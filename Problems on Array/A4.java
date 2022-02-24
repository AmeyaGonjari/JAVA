import java.util.*;
import A1.ArrayX;

class A4
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