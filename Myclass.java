package HashMap;

public class Myclass {

	public static void main(String[] args) 
	{
		MyHashMap h=new MyHashMap();
		h.add(30, "a");
		h.add(25, "b");
		h.add(5, "c");
		h.add(5, "cc");
		h.add(42, "d");
		h.print();
		System.out.println(h.get(5));
		
	}

}
