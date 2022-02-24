import java.util.*;

class A1
{
	public static void main(String Arg[])
	{
		
		int  i = 0, j = 0;
		int iSize = 0;
		Scanner sobj = new Scanner(System.in); 

		System.out.println("Enter Number of Elements");
		iSize = sobj.nextInt();

		int Arr[] = new int[iSize];

		System.out.println("Enter the Numbers");

		for(i = 0; i < Arr.length ;i++)
		{
			Arr[i] = sobj.nextInt(); 

		}


		System.out.println("Numbers Are :");

		for(j = 0;j<Arr.length;j++)
		{

			System.out.println(Arr[j]);

		}



	}

}