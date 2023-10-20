package collection;

import java.util.ArrayList;
import java.util.Iterator;


public class CollectnSamp 
{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("anu");
		al.add(5.34f);
		al.add(9);
		al.add(56.986d);
		System.out.println(al);
		
		//Generic al
		
		ArrayList<String> arl=new ArrayList();
		arl.add("sree");
		arl.add("das");
		arl.add("nichu");
		System.out.println(arl);
		
		arl.remove(2); //to remove element from a specified index of arraylist.
		System.out.println(arl);
		ArrayList<String> arl2=new ArrayList();
		arl2.add("hai");
		arl2.add("hello");
 		arl2.add("bye");  //to add elements.
		arl2.addAll(arl); //to add all elements of arl to arl2.
		System.out.println(arl2);
		
		arl2.removeAll(arl2); //to remove all elements of arraylist
		System.out.println(arl2);
		System.out.println(al.get(2)); //to get element on the specified index.
		System.out.println(al.size()); //to get size of arraylist.
		
		
		System.out.println(al.contains("anu"));
		System.out.println(al.contains("sree"));
		
		
		//Itreative interface
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		itr.remove(); //removes elements from last index of al
		System.out.println(al);

	}

}
