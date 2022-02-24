import java.util.*;

class Cal
{
	int p;
	int q;
}


class Add extends Cal
 {
		int iNo1;
		int iNo2;

		protected static final int iNo3 = 20;

		Add()
		{
			iNo1 = 50;
			iNo2 = 100;
			iNo3 = 40;
		}

/*
		Add(int a,int b)
		{
			iNo1 = a;
			iNo2 = b;
		}
*/
		public static void main(String Arg[])
		
		{

		Demo obj = new Demo();
		obj.Addition();

	}

}

class Demo
{
	public void Addition()
	{

		Add obj = new Add();

	
		System.out.println(obj.iNo1);
		System.out.println(obj.iNo2);


		Add obj1 = new Add(11,12);
		System.out.println(obj1.iNo1);
		System.out.println(obj1.iNo2);
	 	
		System.out.println(Add.iNo3);
	 	//	iNo1+iNo2;
	}


}



































/*		int iValue1 = 0;
		int iValue2 = 0;
		int iRet = 0;

		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter  the 1st  Number");
		iValue1 = sobj.nextInt();

		System.out.println("Enter the  2nd Number");
		iValue2 = sobj.nextInt();



		Demo obj = new Demo();

		//iRet = obj.Addition(iValue1,iValue2);
		iRet = iValue1+iValue2;
		System.out.println("Addition is :"+iRet);
*/