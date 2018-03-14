package com.gupaoedu.vip.pattern.day4.template.dao;

import com.gupaoedu.vip.pattern.day4.template.JdbcTemplate;
import com.gupaoedu.vip.pattern.day4.template.RowMapper;
import com.gupaoedu.vip.pattern.day4.template.entity.Member;
import com.sun.corba.se.spi.ior.ObjectKey;

import javax.sql.DataSource;
import javax.xml.transform.Result;
import java.sql.ResultSet;
import java.util.List;

/**
 * Created by Administrator on 2018/3/11.
 */
public class MemberDao{

    private JdbcTemplate jdbcTemplate = new JdbcTemplate(null);


    public List<?> qurery()throws Exception{
        String sql = "select * from t_member";
        return  jdbcTemplate.executeQuery(sql,new RowMapper<Member>(){
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member m = new Member();
                m.setUserName(rs.getString("userName"));
                m.setPassWord(rs.getString("passWord"));
                m.setAge(rs.getString("age"));
                m.setAddr(rs.getString("addr"));

                return m;
            }
        },null);
    }
}
