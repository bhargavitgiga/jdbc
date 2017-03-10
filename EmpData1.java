package advjava;

public class EmpData1 {
	String name,dept;
	int marks,age;
	
	
	EmpData1(String name,int marks,String dept,int age )
	{
	 this.name=name;
	 this.marks=marks;
	 this.dept=dept;
	 this.age=age;
	
	}

	public String toString()
	{
		return name+marks+dept+age;

	}

}
