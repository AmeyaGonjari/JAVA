import java.util.*;

class A2
{

	public static void main(String Arg[])
	{
		int iValue1 = 0;
		int iValue2 = 0;
		int iAns = 0;


		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the 1st Number");
		iValue1 = sobj.nextInt();

		System.out.println("Enter the 2nd Number");
		iValue2 = sobj.nextInt();

		iAns = iValue1+iValue2;

		System.out.println("Addition is :"+iAns);

	}
}