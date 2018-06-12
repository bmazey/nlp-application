package org.columbia.service;

import org.columbia.dto.SentenceDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SentenceJdbcRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public SentenceDto findById(long id) {
        return jdbcTemplate.queryForObject("select * from sentences where id=?", new Object[] { id },
                new BeanPropertyRowMapper<>(SentenceDto.class));
    }
}
