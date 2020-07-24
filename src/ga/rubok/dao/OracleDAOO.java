package ga.rubok.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleDAOO {
	private OracleDAOO daoo = null;
	private OracleDAOO () {}
	
	public OracleDAOO getInstance() {
		if(daoo == null) {
			daoo = new OracleDAOO();
		}
		return daoo;
	}
	
	public static void main(String[] args) {
		OracleDAOO oracleDAOO = new OracleDAOO();
		try {
			oracleDAOO.getConn();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConn() throws Exception{
		String url = "";
		String userName = "";
		String password = "";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, userName, password);
		System.out.println("접속 성공");
		return con;
	}
	
	public void closeConn(Connection conn) {
		try {
			conn.close();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
