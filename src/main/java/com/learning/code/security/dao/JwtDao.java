package com.learning.code.security.dao;

import com.learning.code.security.model.JwtRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JwtDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public JwtRequest loginCheck(String userName) throws Exception{
        String sql = "select username, password from login where username = '"+userName+"'";
        return jdbcTemplate.queryForObject(sql, (rs, rowNum) -> {
            JwtRequest user = new JwtRequest();
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            return user;
        });
    }
}
