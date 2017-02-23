package com.org.dao;

import java.sql.Connection;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ConnectionDao {
	private static final Logger logger = LoggerFactory.getLogger(ConnectionDao.class);
	
	public Connection getRewardMoneyDbConnection(){
		Connection conn = null;
		try {
		    Context initCtx = new InitialContext();
		    DataSource ds = (DataSource) initCtx.lookup("java:comp/env/jdbc/rewardmoney");
		    conn = ds.getConnection();
		} catch (Exception e) {
		    e.printStackTrace();
		    logger.error("exception in rewardmoney connection" + e);
		}
		return conn;
	}
	
	public Connection getGlobalDbConnection(){
		Connection conn = null;
		try {
		    Context initCtx = new InitialContext();
		    DataSource ds = (DataSource) initCtx.lookup("java:comp/env/jdbc/global");
		    conn = ds.getConnection();
		} catch (Exception e) {
		    e.printStackTrace();
		    logger.error("exception in global_db connection" + e);
		}
		return conn;
	}
	
	public Connection getEasyCashDbConnection(){
		Connection conn = null;
		try {
		    Context initCtx = new InitialContext();
		    DataSource ds = (DataSource) initCtx.lookup("java:comp/env/jdbc/easycash");
		    conn = ds.getConnection();
		} catch (Exception e) {
		    e.printStackTrace();
		    logger.info("exception in easycash_db connection" + e);
		}
		return conn;
	}
	
}
