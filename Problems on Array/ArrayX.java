

package A1;
import java.util.*;

public class ArrayX
{
	public int Arr[];
	
	public ArrayX(int iSize)
	{
		Arr= new int[iSize];
	}
	
	public void Accept()
	{
		int i = 0;
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the Elements:");
		for(i = 0; i<Arr.length;i++)

			
		{
			Arr[i]= sobj.nextInt();
		}
		
	}
	
	public void Display()
	{
		int i = 0;
		System.out.println("Elemsts are:");
		
		for(i = 0; i<Arr.length;i++)
		{
				System.out.println(Arr[i]);
		}
		
	}

}