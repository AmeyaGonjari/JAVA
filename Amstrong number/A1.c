import java.util.*;

class A1
{

	public static void main(String Arg[])
	{
		int iValue = 0;
		boolean bret = false;

		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the Number");
		iValue = sobj.nextInt();

		Marvellous mobj = new Marvellous();
		
		bret = mobj.CheckAmstrong(iValue);

		if(bret == true)
		{
			System.out.println("Number is Amstrong");
		}
		else
		{
			System.out.println("Number is not Amstrong");
		}


	}
}

class Marvellous
{

	public boolean CheckAmstrong(int iNo)
	{
		

		int iDigit = 0;
		int iCnt = 0;
		b bret 
		
		while(iNo != 0)
		{
			iDigit = iDigit % 10;
			iCnt++;
			iNo = iNo / 10;
		}
		int i = 0;
		int iSum = 0;
		for(i = 1;i<=iCnt;i++)
		{
			iSum = iSum +(i*iCnt);
		}
		if(iSum = iNo)
		{
			return 
		}


	}
}

