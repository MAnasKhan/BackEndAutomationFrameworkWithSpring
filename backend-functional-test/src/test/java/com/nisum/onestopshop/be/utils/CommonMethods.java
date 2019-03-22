package com.nisum.onestopshop.be.utils;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import freemarker.template.EmptyMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public  class CommonMethods {
    private static final Logger logger = LoggerFactory.getLogger(CommonMethods.class);
    private  final ObjectMapper MAPPER = new ObjectMapper();

    public  <T, type> List<T> jsonStringResponseToDtoList(String json, Class<T> type) throws Exception {
        JavaType realType = MAPPER.getTypeFactory()
                .constructCollectionType(List.class, type);
        return MAPPER.readValue(json, realType);
    }

    public  <T> T jsonStringToDto(String json, Class<T> type) throws IOException {
        return MAPPER.readValue(json, type);
    }

    public HashMap<String,Object> jsonStringToMap(String json)throws Exception
    {
        if(json.charAt(0)=='[')
        {
            StringBuilder builder = new StringBuilder(json);
            builder.deleteCharAt(0);
            logger.info("after deleting 1st character "+String.valueOf(builder));
            builder.deleteCharAt(builder.length()-1);
            logger.info("after deleting last character "+String.valueOf(builder));
            HashMap<String, Object> result =
                    MAPPER.readValue(String.valueOf(builder), HashMap.class);
            return result;
        }
        else {
            HashMap<String, Object> result =
                    MAPPER.readValue(json, HashMap.class);
            return result;
        }
    }

    public   Map<String, List<String>> rsConvertToMap(ResultSet resultSet) throws SQLException {
        Map<String, List<String>> listMap = new HashMap<String, List<String>>();
        ResultSetMetaData metaData = resultSet.getMetaData();
        List<String> list;
        int columnCount = metaData.getColumnCount();
        int i;
        String columnName;
        String cellValue;
        while (resultSet.next()) {
            for (i = 1; i <= columnCount; i++) {
                columnName = metaData.getColumnName(i);
                cellValue = resultSet.getString(columnName);
                if (listMap.get(columnName) == null) {
                    list = new ArrayList<String>();
                    list.add(cellValue);
                    listMap.put(columnName, list);
                } else {
                    listMap.get(columnName).add(cellValue);
                }
            }
        }
        return listMap;
    }
}
