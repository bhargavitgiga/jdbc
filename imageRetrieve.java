package advjava;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Blob;
import com.mysql.jdbc.PreparedStatement;

public class imageRetrieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bhargav?useSSL=false","root","1992");
			PreparedStatement  p=(PreparedStatement) con.prepareStatement("select * from image");
			ResultSet r=p.executeQuery();
			if(r.next())
			{
				Blob b=(Blob) r.getBlob(2);
				byte by[]=b.getBytes(1, (int)b.length());
				FileOutputStream fos=new FileOutputStream("E:\\haibird.jpg");
				fos.write(by);
			}
			
		
			con.close();  
	}
		
		
		catch(Exception e)
		{
			System.out.println(e);}  
			
	}
}


