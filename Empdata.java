package advjava;

public class Empdata {
	public String name,dept;
	public	int marks,age ;



public	Empdata(int marks,String dept,int age)
	{
		
		this.marks=marks;
		this.dept=dept;
		this.age=age;
	}


  	public  String toString() 
  	{
		return (marks+" "+dept+" "+age );
  		
  	}

	}


