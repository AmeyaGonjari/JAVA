import java.util.*;

class Add extends Cal
 {
 		Add()
 		{
 			super();
 		}
 		
		public static void main(String Arg[])
		
		{
			Cal obj2 = new Cal();
				System.out.println(obj2.p);
				System.out.println(obj2.q);

		Demo obj = new Demo();
		obj.Addition();

	}

 public int additionTwoNumbers(int a,int b)
 {

 	 	System.out.println("I am in Add");


 	return a+b;
 }

}
class Cal
{
	Cal()
	{
		
		System.out.println("I am in Const");

	}

	int p;
	int q;
 

 public int additionTwoNumbers(int a,int b)
 {
 	System.out.println("I am in Cal");
 	return a*b;
 }
}

class Demo
{
	public void Addition()
	{

		Add obj = new Add();
		obj.additionTwoNumbers(11,12);

/*	
		System.out.println(obj.iNo1);
		System.out.println(obj.iNo2);


		Add obj1 = new Add(11,12);
		System.out.println(obj1.iNo1);
		System.out.println(obj1.iNo2);
	 	
		System.out.println(Add.iNo3);
	 	//	iNo1+iNo2;*/
	}


}