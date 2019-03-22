package com.nisum.onestopshop.be.db;

import com.nisum.onestopshop.be.utils.CommonMethods;
import com.nisum.onestopshop.be.utils.ConnectionUtil;
import com.nisum.onestopshop.be.utils.RestUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Component
public class DBMethods {
    private static final Logger logger = LoggerFactory.getLogger(DBMethods.class);
    Connection connection;

    @Autowired
    ConnectionUtil connectionUtil;

    @Autowired
    CommonMethods commonMethods;

    public Map<String, List<String>> selectQueries(String query)  {
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        logger.debug("Select Query is :" + query);
        try {
            connection = connectionUtil.getConn();
            if (connection != null && !connection.isClosed()) {
                preparedStatement = connection.prepareStatement(query);
                resultSet = preparedStatement.executeQuery();


                return commonMethods.rsConvertToMap(resultSet);
            }
            if (resultSet != null) resultSet.close();
            if (preparedStatement != null) preparedStatement.close();
            return Collections.emptyMap();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if(connection!=null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return Collections.emptyMap();
    }

    public void deleteQueries(String query){

    }
}
