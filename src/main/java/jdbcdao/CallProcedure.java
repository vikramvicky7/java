package jdbcdao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallProcedure {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is loaded");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
		System.out.println("Connection is created");
		
		CallableStatement cst = con.prepareCall("call titleupdate(?,?)");
		cst.setInt(1,2);
		cst.setString(2,"rough wednesday");
		cst.registerOutParameter(2,Types.VARCHAR);
		int res = cst.executeUpdate();
		String title = cst.getString(2);
		System.out.println(title);
	}
}
