package advjava;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.PreparedStatement;

public class StoreTxtFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bhargav?useSSL=false","root","1992");
			PreparedStatement p=(PreparedStatement) c.prepareStatement("insert into Image values(?,?)");
			File f=new File ("E:\\hi.txt");
			FileReader fr=new FileReader(f);
			p.setString(1,"a234");
			p.setCharacterStream(2,fr,(int)f.length());
			int k=p.executeUpdate();
			System.out.println(k+"updated");
		}
			
		catch(Exception e)
		{
			System.out.println(e);
		}
			
		
		

	}

}
