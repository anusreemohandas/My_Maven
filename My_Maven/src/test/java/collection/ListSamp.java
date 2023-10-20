package collection;

import java.util.ArrayList;
import java.util.List;

public class ListSamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList();
		l.add("anu");
		l.add(6);
		l.add(9.65f);
		System.out.println(l);
		
		List<String> ls=new ArrayList();
		ls.add("sree");
		ls.add("das");
		ls.add("anu");
		System.out.println(ls);
		ls.remove(2);
		System.out.println(ls);
		List<String> ls2=new ArrayList();
		ls2.add("hai");
		ls2.add("hi");
		ls2.add("hey");
		System.out.println(ls2);
		ls2.addAll(ls);
		System.out.println(ls2);
		ls2.removeAll(ls2); 
		System.out.println(ls2);
		System.out.println(l.get(2)); 
		System.out.println(l.size()); 
		System.out.println(l.contains(6));
	}

}
