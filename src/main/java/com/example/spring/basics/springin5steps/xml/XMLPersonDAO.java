package com.example.spring.basics.springin5steps.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component

public class XMLPersonDAO {
    //@Autowired
    XMLJDBCConnection jdbcConnection;

    public XMLJDBCConnection getJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcConnection(XMLJDBCConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
}
