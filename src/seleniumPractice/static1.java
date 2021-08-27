package seleniumPractice;

public class static1 {
	
	String name;
	int rollno;
	static String clgname;
	static int counter=0;
	public static1(String name)
	{
		this.name=name;
		this.rollno=setrollno();
	}
	static int setrollno()
	{
		counter++;
		return counter;
	}
	void getdata()
	{
		System.out.println("name= "+name);
		System.out.println("rollno= "+rollno);
	}

}
