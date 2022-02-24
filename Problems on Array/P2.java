import java.util.*;

class P2
{
	public static void main(String args[])
	{
		Marvellous mobj = new Marvellous();
		mobj.Accept();
		mobj.Display();
		mobj.Vowels();

	}

}

class StringX
{
	public String s1;

	public void Accept()
	{
		Scanner sobj  = new Scanner(System.in);
			
			System.out.println("Enter the String:");
			s1 = sobj.nextLine();

	}

	public void Display()
	{

		System.out.println("Entered String is : "+ s1);
	}


}

class Marvellous extends StringX
{
		
	
	public void Vowels()
	{	
		char brr[] = s1.toCharArray();
		int i = 0;
		int iCnt = 0;
		for(i = 0; i< brr.length;i++)
		{
			if(brr[i] == 'a')
			{
				iCnt++;
			}

		}	

		System.out.println(" Count of A is : "+iCnt);

	}


}