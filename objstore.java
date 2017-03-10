package advjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class objstore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bhargav","root","1992");
			System.out.println("enter id");
			String id=s.nextLine();
			String name=s.nextLine();
			Employee obj1=new Employee(name,id);
			FileOutputStream fos=new FileOutputStream("E:\\hi.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(obj1);
			File f=new File("E:\\hi.txt");
			FileInputStream fis=new FileInputStream(f);
			PreparedStatement ps=con.prepareStatement("insert into objtab values(?,?)");
			ps.setString(1, "a123");
			ps.setBinaryStream(2,fis,(int)f.length());
			int k=ps.executeUpdate();
			System.out.println(k+"updated");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
