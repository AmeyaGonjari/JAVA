import java.util.*;

class A6

{
	public static void main(String arg[])
	{
			int iRet = 0;
			String sRet;
			Marvellous mobj = new Marvellous();
			mobj.Accept();
			mobj.Display();
			
			sRet = mobj.ReverseX();
			System.out.println(sRet);
	}
}

class StringX
{
	public String str;
		
		public void Accept()
		{
			Scanner sobj = new Scanner(System.in);
			System.out.println("Enter the String");
			str = sobj.nextLine();
		}


		public void Display()
		{
			System.out.println("String is :"+str);
		}

}

class Marvellous extends StringX
{
	public String ReverseX()
	{
		char Arr[]= str.toCharArray();
		int iStart = 0; 
		char temp;
		int iEnd = Arr.length-1;
		while(iStart<iEnd)
		{
			temp = Arr[iStart];
			Arr[iStart] = Arr[iEnd];
			Arr[iEnd] = temp;

			iStart++;
			iEnd--;


		}
			return new String(Arr);
	} 
}