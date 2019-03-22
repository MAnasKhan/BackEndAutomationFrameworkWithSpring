package com.nisum.onestopshop.be.utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.sql.*;

@Component
public class ConnectionUtil {

    private static final Logger logger = LoggerFactory.getLogger(ConnectionUtil.class);
    private Connection conn = null;
    private ResultSet currentRS = null;

    @Value("${db.url}")
    private String dbUrl;

    @Value("${db.username}")
    private String dbUsername;

    @Value("${db.password}")
    private String dbPassword;

    private void initConnection(String DbURL, String DbUsername, String DbPassword) {
        // Create connection
        logger.info("Database Credentials: " + DbURL + DbPassword);
        try {

            conn = DriverManager.getConnection(DbURL, DbUsername, DbPassword);
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            logger.error("Coult not Initiate Connection to the Database. Please refer to the trace below: ");
            e.printStackTrace();

        }
    }

    @PostConstruct
    public void init() {

        //QATestProperties qaTestProperties = script.getQATestProperties();
        this.initConnection(dbUrl, dbUsername, dbPassword);

    }

    public Connection getConn() {
        return conn;
    }

    public ResultSet execute(String query) {
        ResultSet rs = null;
        try {
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            currentRS = rs;
        } catch (SQLException e) {
            logger.error("ERROR WHILE EXECUTING QUERY - PLEASE CHECK CONNECTION AND QUERY");
            currentRS = null;
        }



        return rs;
    }

    public boolean executeUpdate(String sql) {
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            return false;
        }

        return true;
    }

    public void closeConnection() throws SQLException {

        conn.close();

    }


}
