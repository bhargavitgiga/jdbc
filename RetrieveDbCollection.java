package advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RetrieveDbCollection {

	public static void main(String[] args) {
		List<Empdata> l=new ArrayList<Empdata>();
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bhargav","root","1992");
			Statement s=con.createStatement();
			ResultSet rs=s.executeQuery("select * from student_details");
			while(rs.next())
			{
				
		//		l.add(new Empdata(rs.getInt(2),rs.getString(3),rs.getInt(4)));
				//System.out.println(rs.getString(1)+rs.getInt(2)+rs.getString(3)+rs.getInt(4));
			}
			con.close();
			System.out.println("-----display from list---- ");
			//System.out.println("-----extended for(java 5)----");
			
			for(Empdata k:l)
			{
				System.out.println(k);
			}
			System.out.println("-----foreach() java 8----");
			l.forEach((k)->{
				System.out.println(k+"\t");
			});
			
			
		}//end of try
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		

	}

}
