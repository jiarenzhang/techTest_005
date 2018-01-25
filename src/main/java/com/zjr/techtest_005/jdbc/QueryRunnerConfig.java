package com.zjr.techtest_005.jdbc;

import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 *  关于QueryRunner中的ResultSetHandler取值说明:
 * <pre>
 * 1、简单类型查询 ScalarHandler<String> ScalarHandler<Integer>  ScalarHandler<Long> MapHandler BeanHandler
 * 2、列表对象查询
 *      ScalarHandler(唯一值查询): Converts one ResultSet column into an Object.
 *      ArrayHandler(单一Array查询): Converts the first ResultSet row into an Object[].
 *      BeanHandler(单一Bean查询): Converts the first ResultSet row into a JavaBean.
 *      MapHandler(单一Map查询): Converts the first ResultSet row into a Map.
 *      ColumnListHandler(List集合查询): Converts a ResultSet into a List of Object.
 *      ArrayListHandler(List集合查询): Converts the ResultSet into a List of Object[].
 *      BeanListHandler(List集合查询): Converts a ResultSet into a List of beans.
 *      MapListHandler(List集合查询): Converts a ResultSet into a List of Map.
 *      BeanMapHandler(Map集合查询): Converts a ResultSet into a Map of beans.
 *      KeyedHandler(Map集合查询): Returns a Map of Maps,ResultSet rows are converted into Maps which are then stored in a Map under the given key.
 * </pre>
 * @author LIUKANGJIN
 */
@Configuration
@ConditionalOnClass(QueryRunner.class)
public class QueryRunnerConfig {

    @Autowired
    private DataSource dataSource;

    @Bean
    public QueryRunner queryRunner(){
        return new QueryRunner(dataSource);
    }

}
