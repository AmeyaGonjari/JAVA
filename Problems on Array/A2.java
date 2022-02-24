
class A1
{
	public static void main(String Arg[])
	{
		
		int i = 0, j = 0;
		int iSize = 0;
		int iret = 0;
		Scanner sobj = new Scanner(System.in); 

		System.out.println("Enter Number of Elements");
		iSize = sobj.nextInt();

		int Arr[] = new int[iSize];

		System.out.println("Enter the Numbers");

		for(i = 0; i < Arr.length ;i++)
		{
			Arr[i] = sobj.nextInt(); 

		}

		ArrayDemo  obj = new ArrayDemo();
		iret = obj.Addition(Arr);

		System.out.println("Addition is :"+iret);



	}

}

class ArrayDemo
{
			int j ;
			int ians;

	ArrayDemo()
	{
		j = 0;
		ians = 0;
	}

	public int Addition( Brr[])
	{
			
			for(j = 0; j<Brr.length;j++)
			{
				ians = ians + Brr[j];
			}

			return ians;

	}	

}