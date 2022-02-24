import java.util.*;

class A2
{
	public static void main(String arg[])
	{
		String arr;
		Scanner sobj = new Scanner(System.in);

			System.out.println("Enter your Name:");
			arr=sobj.nextLine();

			StringDemo obj = new StringDemo();
				obj.Display(arr);

	}


}

class StringDemo
{
	public void Display(String Brr)
	{
		System.out.println("Welcome "+Brr);
	}

}