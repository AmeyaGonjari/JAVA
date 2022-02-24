import java.util.*;

class A3
{

	public static void main(String Arg[])
	{
		int iSize = 0;
		int iRet = 0;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the number of Elements");
		iSize = sobj.nextInt();

		Marvellous mobj = new Marvellous(iSize);
		mobj.Accept();
		mobj.Display();
		iRet = mobj.Add();
		System.out.println("Addition is :"+iRet);
	} 

}

class ArrayX
{
	public int Arr[];
	
	public ArrayX(int iSize)
	{
		Arr= new int[iSize];
	}
	
	public void Accept()
	{
		int i = 0;
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the Elements:");
		for(i = 0; i<Arr.length;i++)
		{
			Arr[i]= sobj.nextInt();
		}
		
	}
	
	public void Display()
	{
		int i = 0;
		System.out.println("Elemsts are:");
		
		for(i = 0; i<Arr.length;i++)
		{
				System.out.println(Arr[i]);
		}
		
	}

}

class Marvellous extends  ArrayX
{
	public Marvellous(int iValue)
	{
		super(iValue);
	}

	
	public int Add()
	{

		int iSum = 0,iCnt = 0;
		for(iCnt = 0; iCnt<Arr.length;iCnt++)
		{
			iSum = iSum+Arr[iCnt];
		}

		return iSum;

	}	
}