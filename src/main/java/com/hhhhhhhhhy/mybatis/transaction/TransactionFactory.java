package com.hhhhhhhhhy.mybatis.transaction;

import com.hhhhhhhhhy.mybatis.session.TransactionIsolationLevel;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * 工厂包装不同的 JDBC 事务实现，为每个事务实现都提供一个对应工厂
 * @author hhhhhhhhhy
 * @Date 2023/3/14 11:20
 */
public interface TransactionFactory {

    /**
     * 根据 Connection 创建 Transaction
     * @param connection
     * @return
     */
    Transaction newTransaction(Connection connection);

    /**
     * 根据数据源和事务隔离级别创建 Transaction
     * @param dataSource
     * @param level
     * @param autoCommit
     * @return
     */
    Transaction newTransaction(DataSource dataSource, TransactionIsolationLevel level, boolean autoCommit);

}
