package advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

public class RetrieveDbMap {

	public static void main(String[] args) {
		
		Map<String,Empdata> h=new HashMap<String,Empdata>();
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bhargav?useSSL=false","root","1992");
			PreparedStatement ps=con.prepareStatement("select * from student_details");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				h.put(rs.getString(1),new Empdata(rs.getInt(2),rs.getString(3),rs.getInt(4)));
			}
			System.out.println("----DisMap---");
			
			
			for(Map.Entry e:h.entrySet())
			{
				System.out.println(e.getKey());
				Empdata z=(Empdata) e.getValue();
				System.out.println(z);
				
			}
			
			System.out.println("----foreach() (java8)----");
			h.forEach((p,q)->
			{ 
				System.out.println(p+q);
			});
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			
			
			
			
			
		}

	}


