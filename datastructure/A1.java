class A1
{
	public static void main(String str[])
	{
		int iRet = 0;
		SinglyLL obj = new SinglyLL();
		obj.InsertFirst(101);
		obj.InsertFirst(51);
		obj.InsertFirst(21);
		obj.InsertFirst(11);
		obj.InsertLast(152);
		obj.Display();
	 iRet = obj.Count();
		System.out.println(iRet);

		obj.DeleteFirst();
		obj.Display();
	iRet = obj.Count();
		System.out.println(iRet);

		obj.DeleteLast();
			obj.Display();
	 iRet = obj.Count();
		System.out.println(iRet);

		obj.InertAtPos(2,853);
				obj.Display();
	 iRet = obj.Count();
		System.out.println(iRet);

		obj.DeleteAtPos(2);
				obj.Display();
	 iRet = obj.Count();
		System.out.println(iRet);



	}

}

class Node
{
	public int data;
	public Node next;
}
class SinglyLL
{
	private Node first;
	private int size;

	public SinglyLL()
	{
		this.first = null;
		this.size = 0;
	}

	public void InsertFirst(int no)
	{
		Node newn = null;
		newn = new Node();

		newn.data = no;
		newn.next = null;

		if(first == null)
		{
			first = newn;
		}
		else
		{
			newn.next = first;
			first = newn;
			
		}
		this.size++;
	}

	public void Display()
	{
		Node temp = first;

		while(temp != null)
		{
			System.out.print("|"+temp.data+"|->");
			temp= temp.next;
		}
		System.out.print("\n");
	}

	public int Count()
	{
		return this.size;
	}

	public void InsertLast(int no)
	{
		Node newn = null;
		newn = new Node();

		newn.data = no;
		newn.next = null;

		if(first == null)
		{
			first = newn;
		}
		else
		{
			Node temp = first;

			while(temp.next != null)
			{
				temp =temp.next;
			}
			temp.next = newn;
		}
		this.size++;
	}

	public void DeleteFirst()
	{
		if(size == 0)
		{
			return;
		}
		if(size == 1)
		{
			first = null;
		}
		else
		{
			first = first.next;
		}
		this.size--;

	}

	public void DeleteLast()
	{
		if(size == 0)
		{
			return;
		}
		if(size == 1)
		{
			first = null;
		}
		else
		{
			Node temp = first;
			while(temp.next.next != null)
			{
				temp = temp.next ;

			}
			temp.next = null;

		}
		this.size--;

	}
	public void InertAtPos(int iPos,int no)
	{
		if((iPos<0)||(iPos > size+1))
		{
			return;
		}
		else if(iPos == size + 1)
		{
			InsertLast(no);
		}
		else if(iPos == 1)
		{
			InsertFirst(no);
		}
		else
		{
		Node newn = null;
		newn = new Node();
		Node temp = first;
		newn.data = no;
		newn.next = null;

		for(int i = 1;i <iPos -1 ;i++)
		{
			temp = temp.next;
		}
		newn.next = temp.next;
		temp.next = newn;

		this.size++;
		}

	}

	public void DeleteAtPos(int iPos)
	{
		if((iPos<0)||(iPos > size+1))
		{
			return;
		}
		else if(iPos == size)
		{
			DeleteLast();
		}
		else if(iPos == 1)
		{
			DeleteFirst();
		}
		else
		{
				Node temp = first;
			for(int i = 1;i <iPos -1 ;i++)
		{
			temp = temp.next;
		}
		temp.next = temp.next.next;
		this.size--;

		}
	}
}