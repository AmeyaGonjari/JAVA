import java.util.*;

class A4
{
	public static void main(String arg[])
	{
			int iRet = 0;
			Marvellous mobj = new Marvellous();
			mobj.Accept();
			mobj.Display();

			iRet = mobj.CountVowels();
			System.out.println("Number of Vowels are:"+iRet);
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
	public int CountVowels()
	{
		char Arr[] = str.toCharArray();

		int iCnt = 0 , i = 0;
		
		while(i<Arr.length)
		{	
			if((Arr[i] == 'a')||(Arr[i]=='e')||(Arr[i] == 'i')||(Arr[i]=='o')||(Arr[i] == 'u'))
			{
				iCnt++;
			}
			i++;
		}	
		

		return iCnt;
		} 
}