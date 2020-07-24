package ga.rubok.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleDAO {
	
	private static OracleDAO dao = null;
	
	private OracleDAO() {} // 기본 생성자에 private를 붙여줌 외부에서 생성이 불가능함

	public static OracleDAO getInstance() { // 객체화 된 변수를 표현하는 instance
		if(dao == null) {
			dao = new OracleDAO();
		} // 최초에 주소값을 넣은 다음 넣을 수 없다
		return dao;
	} // 싱글톤 만드는 방법 - 객체를 하나만 만드는 것
	
	public static void main(String[] args){
		OracleDAO oracleDAO = new OracleDAO();
		try {
			oracleDAO.getConn();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public Connection getConn() throws Exception {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userName = "hr";
		String password = "koreait2020";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, userName, password);
		System.out.println("접속 성공!");
		return con;
	}
	
	public void closeConn(Connection conn) {
		if(conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
