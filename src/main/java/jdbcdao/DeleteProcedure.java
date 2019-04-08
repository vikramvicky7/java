package jdbcdao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class DeleteProcedure {
	
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is loaded");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
		System.out.println("Connection is created");
		
		CallableStatement cst = con.prepareCall("call deletetitle(?)");
		cst.setInt(1,5);
		
		int res = cst.executeUpdate();
		System.out.println("title deleted");
	}

}
