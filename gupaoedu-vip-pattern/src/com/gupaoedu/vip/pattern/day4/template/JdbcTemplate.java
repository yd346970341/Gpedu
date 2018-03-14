package com.gupaoedu.vip.pattern.day4.template;


import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/3/11.
 */
public class JdbcTemplate {
    public DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    private Connection getConnection()throws  Exception{
        return this.dataSource.getConnection();
    }
    private PreparedStatement createPreparedStatement(Connection conn ,String sql) throws  Exception{
        return conn.prepareStatement(sql);
    }
    private ResultSet executeQuery(PreparedStatement pstmt,Object[] values)throws Exception{
        for (int i = 0 ; i <values.length; i ++){
            pstmt.setObject(i,values[i]);
        }
        return pstmt.executeQuery();
    }
    private void closeStatement(Statement statement)throws Exception{
        statement.close();
    }
    private void closeResult(ResultSet rs)throws Exception{
        rs.close();
    }
    private void closeConnection(Connection coon)throws Exception{
        //通常放在连接池中回收
    }
    private List<?> parseResultSet(ResultSet rs,RowMapper rowMapper)throws  Exception{
        List<Object> result = new ArrayList<Object>();
        int rowNum =  1;
        while(rs.next()){
            result.add(rowMapper.mapRow(rs, rowNum++));
        }
        return  result;
    }
    public List<?> executeQuery(String sql,RowMapper<?> rowMapper, Object[] values) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<?> list = null;
        try{
            //1.获取连接
            conn = this.getConnection();
            //2.创建语句集
            pstmt =this.createPreparedStatement(conn,sql);
            //3.执行语句集，并且获得结果集
            rs = this.executeQuery(pstmt ,values);
            //4.解析语句集
            list = this.parseResultSet(rs, rowMapper);
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            try {
                //5.关闭结果集
                this.closeResult(rs);
                //6.关闭语句集
                this.closeStatement(pstmt);
                //7.关闭连接
                this.closeConnection(conn);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return  list;
    }

}
