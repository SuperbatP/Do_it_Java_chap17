package sec02_set.EX01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMethod {
public static void main(String[] args) {
	Set<String> hSet1=new HashSet<>();
	//add(E element)
	hSet1.add("가");
	hSet1.add("나");
	hSet1.add("가");//중복으로 제외
	System.out.println(hSet1.toString());
	
	//addAll
	Set<String> hSet2=new HashSet<>();
	hSet2.add("나");
	hSet2.add("다");
	hSet2.addAll(hSet1);
	System.out.println(hSet2.toString());
	
	//remove
	hSet2.remove("나");
	System.out.println(hSet2.toString());
	
	//clear
	hSet2.clear();
	System.out.println(hSet2.toString());
	
	//isEmpty
	System.out.println(hSet2.isEmpty());
	
	//contains
	Set<String> hSet3=new HashSet<>();
	hSet3.add("가");
	hSet3.add("나");
	hSet3.add("다");
	System.out.println(hSet3.contains("나"));
	System.out.println(hSet3.contains("라"));
	
	//size
	System.out.println(hSet3.size());
	
	//iterator
	Iterator<String> iterator = hSet3.iterator();
	while(iterator.hasNext()) {System.out.println(iterator.next());}
	
	//toArray
	Object[] objArray = hSet3.toArray();
	System.out.println(Arrays.toString(objArray));
	
	//toArray(T[] t)
	String[] strArray1 = hSet3.toArray(new String[0]);
	System.out.println(Arrays.toString(strArray1));
	
	String[] strArray2 = hSet3.toArray(new String[5]);
	System.out.println(Arrays.toString(strArray2));
}
}
