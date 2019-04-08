package metadeta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class ResultSetmetaData {
	
public static void main(String[] args) throws Exception {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is loaded");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
		System.out.println("Connection is created");

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from posts");
		
		java.sql.ResultSetMetaData rsmd = rs.getMetaData();
		
		
		System.out.println("ColumnCount=" + rsmd.getColumnCount());
		System.out.println("ColumnType 1=" + rsmd.getColumnTypeName(1));
	}

}
