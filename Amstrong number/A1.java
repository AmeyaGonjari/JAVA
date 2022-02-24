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
		
		int iTemp = iNo;
		int iTempo = iNo;
		int iDigit = 0;
		int iCnt = 0;
		
		while(iNo != 0)
		{
			iCnt++;
			iNo = iNo / 10;
		}

		int i = 0;
		int iSum = 0;
		int iPower = 1;


		while(iTemp != 0)
		{

			iDigit = iTemp % 10;

			for(i = 1 ; i <= iCnt ; i++)
			{
				iPower = iPower * iDigit;
				System.out.println(""+iPower);
			}

			iSum = iSum + iPower;
			iPower = 1;
			iTemp = iTemp / 10;
		}

		if(iSum == iTempo)
		{

			return true;
		}
		else
		{
			return false;
		}
		
	}
}
