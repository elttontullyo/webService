package pibiti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaMysql {
	
	private static String url="jdbc:mysql://localhost/pibitiws";
	private static String user ="root";
	private static String senha="mysql";
	
	
	public static Connection obtemConexao() throws SQLException{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return DriverManager.getConnection(url,user,senha);
	}

}
