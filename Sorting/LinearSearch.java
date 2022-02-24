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
        mobj.Display(); 


        System.out.println("Enter the Number to Search");
        
        bValue = sobj.nextInt();
        bRet = mobj.Search(bValue);
        if(bRet == true)
        {
            System.out.println("Elements is there");
        }
        else
        {
            System.out.println("Elements is not present");
        }
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

    public void  Display()
    {

        System.out.println("The elements are:");

        for(int j = 0;j< Arr.length;j++)
        {
            System.out.println(Arr[j]);
        }
    }

    public boolean Search(int no)
    {
        int i = 0;
        for(i = 0;i<Arr.length;i++)
        {
            if(Arr[i] == no)
            {
                break;
            }
        }

        if(i == Arr.length)
        {
            return false;
        }
        else
        {
            return true;
        }

    }

 }