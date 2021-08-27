package seleniumPractice;

public class Exp7 {

	public static void main(String[] args) {
		int a=10,b=5,c=5;
		int result;
		try {
			result=a/(b-c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		result=a/(b+c);
		System.out.println(result);

	}

}
