import java.util.*;
 
class A1
{
 	public static void main(String args[])
 	{
 		
 		int iValue = 0;
        int bValue = 0;
        boolean bRet = false;

 		Scanner sobj = new Scanner(System.in);

 		System.out.println("Enter the size of Array");
 		iValue = sobj.nextInt();

 		Marvellous mobj = new Marvellous(iValue);
        
        mobj.Accept(); 

        mobj.BubbleSort();
        
 	}
 }



 abstract class ArrayX
{
    public int Arr[];

    public ArrayX(int iValue)
    {
        Arr = new int[iValue];
    }

    public void  Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements");
        for(int i = 0;i <Arr.length;i++)
        {
            Arr[i] = sobj.nextInt();

        }

    }

}


 class Marvellous extends ArrayX
{

    public Marvellous(int iValue)
    {
        super(iValue);
    }

    public void BubbleSort(int Arr[])
    {
        int i = 0,j = 0,temp = 0;
         for(i = 0;i<Arr.length;i++)
         {
            for(j = 0;j<Arr.length - i - 1;j++)
            {
                if(Arr[j] > Arr[j+1])
                {
                    temp = Arr[j];
                    Arr[j] = Arr[j+1];
                    Arr[j+1] = temp;
                }
            }
         }

    }

}


