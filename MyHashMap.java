package HashMap;

public class MyHashMap 
{
	
	Node []rootArray=new Node[7];
	void add(int date,String day)
	{
		int index=date%rootArray.length;
		if(rootArray[index]==null)
			rootArray[index]=new Node(date, day);
		else
		{
			Node temp=rootArray[index];
			while(true)
			{
				if(temp.date==date)
					break;
				else if(temp.next!=null)
					temp=temp.next;
				else if(temp.next==null)
				{
					temp.next=new Node(date, day);
					//break;
				}	
			}
		}
	}
	void print()
	{
		for (int i = 0; i < rootArray.length; i++) 
		{
			printList(rootArray[i]);
		}
	}
	private void printList(Node node) 
	{
		while(node!=null)
		{
			System.out.println(node.date+" "+node.day);
			node=node.next;
		}
	}
	String get(int date)
	{
		int index=date%rootArray.length;
		if(rootArray[index]==null)
			return "hashmap is empty";
		else
		{
			Node temp=rootArray[index];
			while(true)
			{
				if(temp.date==date)
					return temp.day;
				else if(temp.next!=null)
					temp=temp.next;
				else if(temp.next==null)
					return "not fond";
			}
		}
	}
	
}
