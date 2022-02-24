import java.util.*;
 
 class A1
 {
 	public static void main(String args[])
 	{
 		int Arr[];
 		int iValue = 0;

 		Scanner sobj = new Scanner(System.in);

 		System.out.println("Enter the size of Array");
 		iValue = sobj.nextInt();

 		Arr = new int[iValue];


 		System.out.println("Enter the elements");
 		for(int i = 0;i <Arr.length;i++)
 		{
 			Arr[i] = sobj.nextInt();

 		}
 		System.out.println("The elements are");

 		for(int j = 0;j< Arr.length;j++)
 		{
 			System.out.println(Arr[j]);
 		}
 	}
 }