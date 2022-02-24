import java.util.*;


class P1
{
	public static void main(String args[])
	{
		
	int iValue = 0;

		Scanner sobj = new Scanner(System.in);


	System.out.println("Enter the Number of Elements:");
	iValue= sobj.nextInt();

	Marvellous mobj = new Marvellous(iValue);
	mobj.Accept();
	mobj.Display();
	mobj.Add();

	}

}


class ArrayX
{
		public int Arr[];
	
 		public ArrayX( int iSize)
 		{

			Arr = new int[iSize];

 		} 

 		public void Accept()
 		{
 			int i = 0;
 			Scanner sobj = new Scanner(System.in);

 				System.out.println("Enter the  Elements:");
 			

 			for(i = 0; i<Arr.length;i++)
 			{

 				Arr[i] = sobj.nextInt();

 			}


 		}


 		public void Display()
 		{	
			int i = 0;
 				
 				System.out.println("Elemts are");

 			for(i = 0; i< Arr.length;i++)
 			{
 				System.out.println(Arr[i]);

 			}

 		}

	}

	class Marvellous extends ArrayX
	{
		Marvellous(int No)
		{
			super(No);

		}

		public void Add()
		{
			int i = 0;
			int iSum = 0;
			
			for(i = 0;i<Arr.length;i++)
			{
				iSum = iSum + Arr[i];
			
			}

			System.out.println(iSum);
		}

	}



