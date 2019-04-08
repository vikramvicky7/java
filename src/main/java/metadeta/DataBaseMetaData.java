package metadeta;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.DatabaseMetaData;

public class DataBaseMetaData {
	
public static void main(String[] args) throws Exception {
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is loaded");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
		System.out.println("Connection is created");

		java.sql.DatabaseMetaData db = con.getMetaData();
		
		System.out.println("DatabaseProductName");
		System.out.println(db.getDatabaseProductName());
		
		System.out.println("DatabaseProductVersion");
		System.out.println(db.getDatabaseProductVersion());
		
		System.out.println("DriverName");
		System.out.println(db.getDriverName());
		
		System.out.println("DriverVersion");
		System.out.println(db.getDriverVersion());
		
	}

}
