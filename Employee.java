package advjava;

import java.io.Serializable;

public class Employee implements Serializable {
	public  String name,id;
	
	public Employee(String name,String id)
	{
		this.name=name;
		this.id=id;
		
	}
	
public String toString()
{
	return (name+"\t"+id);
	
	
	}

}
