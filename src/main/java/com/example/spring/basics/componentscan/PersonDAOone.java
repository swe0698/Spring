package com.example.spring.basics.componentscan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component

public class PersonDAOone {

   Logger logger = LoggerFactory.getLogger(PersonDAOone.class);
    @Autowired
    JDBCConnectionOne jdbcConnection;

    public JDBCConnectionOne getJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcConnection(JDBCConnectionOne jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }

    @PostConstruct
    public void postConst(){
        logger.info("Post Construct annotation");
    }
    @PreDestroy
    public void preDest(){
        logger.info("Pre destroy annotation");
    }
}
