package com.work.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * DAO 클래스에 사용하기 위한 Factory pattern 클래스
 * @author 김기영
 * @version ver 2.0
 * @since 	jdk1.8
 */
public class FactoryDao {
	
	
	/** jdbc resource property */
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private String user = "kiyung";
	private String password = "1234";
	
	private static FactoryDao instance = new FactoryDao();
	
	private FactoryDao() {
		try {
			Class.forName(driver);
			System.out.println("[성공] 드라이버 로딩");
		} catch (ClassNotFoundException e) {
			System.out.println("[오류] 드라이버 로딩 오류");
			e.printStackTrace();
		}
	}
	
	public static FactoryDao getInstance() { 
		return instance; 
	}
	
	/**
	 * DB 연결 Connection 반환 메서드 
	 * @return Connection
	 */
	public Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		};
		
		return conn;
	}
	
	/**
	 * 자원해제 : SELECT 수행에 대한 자원
	 * @param conn Connection
	 * @param stmt Statement
	 * @param rs ResultSet
	 */
	public void close(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	/**
	 * 자원해제 : CUD 수행에 대한 자원
	 * @param conn Connection
	 * @param stmt Statement
	 */
	public void close(Connection conn, Statement stmt) {
		close(conn, stmt, null);
	}
}

