package advjava;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class ProcCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bhargav","root","1992");
			CallableStatement cs=c.prepareCall("{call salary(?,?)}");
			cs.setInt(1,1234567);
			cs.setInt(2,2000);
			cs.execute();
			c.close();
			System.out.println("salary updated");
		
	    }//end of try
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
