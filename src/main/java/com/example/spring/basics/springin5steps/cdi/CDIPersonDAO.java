package com.example.spring.basics.springin5steps.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

@Named

public class CDIPersonDAO {
    @Inject
    CDIJDBCConnection jdbcConnection;

    public CDIJDBCConnection getJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcConnection(CDIJDBCConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
}
