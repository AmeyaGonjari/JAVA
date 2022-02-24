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
		
		bret = mobj.CheckPrime(iValue);

		if(bret == true)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is not Prime");
		}


	}
}

class Marvellous
{

	public boolean CheckPrime(int iNo)
	{
		int iCnt = 0;
		boolean bFlag = true;
		if(iNo==1)
		{
			return bFlag;

		}

		for(iCnt = 2;iCnt<=iNo/2;iCnt++)
		{
			if((iNo%iCnt)==0)
			{

				bFlag = false;
				break;
			}
		}

		return bFlag;
	}
}
