package jdbcdao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class InsertProcedure {
	
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is loaded");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
		System.out.println("Connection is created");
		

		CallableStatement cst = con.prepareCall("call TitleInsert(?,?)");
		cst.setString(1,"calm wednesday");
		cst.setString(2,"cool wednesday");
		cst.registerOutParameter(1,Types.VARCHAR);
		cst.registerOutParameter(2,Types.VARCHAR);
		int res = cst.executeUpdate();
		String title = cst.getString(1);
		System.out.println(title);
		String body = cst.getString(2);
		System.out.println(body);
	}
	}



