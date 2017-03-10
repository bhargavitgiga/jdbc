package advjava;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bhargav?useSSL=false","root","1992");
			PreparedStatement p=con.prepareStatement("insert into Image values(?,?)");
			File f=new File("E:\\bird.jpg");
			FileInputStream fis=new FileInputStream(f);
			p.setString(1,"a113");
			p.setBinaryStream(2,fis,(int)f.length());
			int k=p.executeUpdate();
			System.out.println(k+"updated");
		
		con.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
