import java.util.*;

class A6

{
	public static void main(String arg[])
	{
			int iRet = 0;
			boolean bRet;
			Marvellous mobj = new Marvellous();
			mobj.Accept();
			mobj.Display();
			
			
		bRet = mobj.Checkpalindrome();
		if(bRet == true)
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is Not palindrome");

		}
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
	public boolean Checkpalindrome()
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
			String str = new String(Arr);
			boolean bret =
			 str.equals(str);
			

			return bret;

	} 

}