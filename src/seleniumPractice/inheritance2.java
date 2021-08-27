package seleniumPractice;

import java.util.Scanner;

public class inheritance2 extends inheritanc1 {
	String name;
	int rollno;
	Scanner y2=new Scanner(System.in);
	void getdata()
	{
		System.out.println("enter name");
		name=y2.next();
		System.out.println("enter roll no");
		rollno=y2.nextInt();
		
	}
	void putdata()
	{
		System.out.println("Student name ="+this.name);
		System.out.println("Roll no= "+rollno);
		System.out.println("College name= "+clg);
	}

}
