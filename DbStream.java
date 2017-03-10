package advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DbStream {

	public static void main(String[] args)throws SQLException {
		// TODO Auto-generated method stub
		List<EmpData1> al=new ArrayList<EmpData1>();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bhargav","root","1992");
			Statement s=con.createStatement();
			ResultSet r=s.executeQuery("select * from student_details");
			while(r.next())
			{
				al.add(new EmpData1(r.getString(1),r.getInt(2),r.getString(3),r.getInt(4)));
			}
			con.close();
			
			
			System.out.println("-----dis from list---- ");
			System.out.println("-----foreach()(java8)");
			al.forEach(k->
			{
				System.out.println(k+"\t");
			});
			
			System.out.println("----age>20-------");
			List<EmpData1>ar = al.stream().filter((p)->p.age>20).collect(Collectors.toList());
			
			ar.forEach((w)->
			{
				System.out.print(w+"\t");
			});
			
				
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
			
			
		
		
		

	}

}
