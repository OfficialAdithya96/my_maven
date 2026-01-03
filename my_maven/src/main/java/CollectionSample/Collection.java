package CollectionSample;

import java.util.ArrayList;
import java.util.Iterator;

class Collection {
	
	

	public static void main(String[] args) {
		//*non generic arraylist
		ArrayList al= new ArrayList();
		al.add("Hello");
		al.add(23);
		al.add(20456.91f);
		
		System.out.println(al);
		
		//Generic ArrayList
		ArrayList<String> st= new ArrayList();
		st.add("ONE");
		st.add("TWO");
		st.add("THREE");
		System.out.println(st);
		
		st.remove (1);
		System.out.println(st);
		
		
		
				
		ArrayList<String> st1= new ArrayList();
		st1.add("Apple");
		st1.add("Mango");
		st1.add("Pineapple");
		st1.add("Orange");
		
		System.out.println(st1);
		
		st1.remove("Orange");
		System.out.println(st1);
		
		st.addAll(st1);
		System.out.println(st);
		
		al.removeAll(al);
		System.out.println(al);
		
		
		System.out.println(st.get(2));
		System.out.println(st.size());
		boolean s = st.contains("Apple");
		boolean s1=st.contains("earth");
		System.out.println(s);
		System.out.println(s1);
		
		boolean s3=st.isEmpty();
		System.out.println(s3);
		
		Iterator it1=st.iterator(); 
		
	while(it1.hasNext()) {
		System.out.println(it1.next());
	}
	System.out.println(st);
	it1.remove();
	System.out.println(st);
	}
	
		// TODO Auto-generated method stub
/* non generic ArrayList
 * ArrayList al= new ArrayList();
 * Generic ArrayList 
 * ArrayList al = new ArrayList<String>();
 * Interface to Class 
 * List Li=new ArrayList();
 * List<Integer> Li= new ArrayList<Interger>();
 * 
 * Iterator interface : hasNext() ; next() ; remove();
 *  */
	 
	

}
