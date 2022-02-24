import java.util.*;
import A1.ArrayX;

class Marvellous extends ArrayX
{
	public Marvellous(int iValue)
	{
		
		super(iValue);

	}
	public float Average()
	{
		int iSum = 0,iCnt = 0;
		for(iCnt = 0; iCnt<Arr.length;iCnt++)
		{
			iSum = iSum+Arr[iCnt];
		}

		return iSum (iSum/Arr.length);

	}	
}
class A5
{

	public static void main(String Arg[])
	{
		int iSize = 0;
		float iRet = 0;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the number of Elements");
		iSize = sobj.nextInt();

		Marvellous mobj = new Marvellous(iSize);
		mobj.Accept();
		mobj.Display();
		iRet = mobj.Average();
		System.out.println("Averageition is :"+iRet);
	} 

}

