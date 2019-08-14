package capgemini_labbook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

	public class lab9_Ex1_ {
	  static  List<String> getValues(HashMap<Integer, String> h) {
	    
	    List<String> l=new ArrayList<String>();
	   Iterator<String> itr = h.values().iterator();
	   while(itr.hasNext()){
		   l.add(itr.next());
	   }
	   Collections.sort(l);
	    return l;
	}
	public static void main(String args[]) {
	    HashMap<Integer, String> h = new HashMap<Integer, String>();
	    h.put(1,"suresh kumar");
	    h.put(9,"sai kumar");
	    h.put(3,"satish kumar");
	    
	    List<String> list = getValues(h);
	    System.out.println(list);
	}
	}
