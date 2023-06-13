package sec02_set.EX03;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetMethod {
public static void main(String[] args) {
	Set<String> linkedSet1=new LinkedHashSet<>();
	//add(E element)
	linkedSet1.add("가");
	linkedSet1.add("나");
	linkedSet1.add("가");//중복으로 제외
	System.out.println(linkedSet1.toString());
	
	//addAll
	Set<String> linkedSet2=new LinkedHashSet<>();
	linkedSet2.add("나");
	linkedSet2.add("다");
	linkedSet2.addAll(linkedSet1);
	System.out.println(linkedSet2.toString());//[나,다,가] 순서가 달라짐
	
	//remove
	linkedSet2.remove("나");
	System.out.println(linkedSet2.toString());//[다,가]
	
	//clear
	linkedSet2.clear();
	System.out.println(linkedSet2.toString());
	
	//isEmpty
	System.out.println(linkedSet2.isEmpty());
	
	//contains
	Set<String> linkedSet3=new LinkedHashSet<>();
	linkedSet3.add("가");
	linkedSet3.add("나");
	linkedSet3.add("다");
	System.out.println(linkedSet3.contains("나"));//t
	System.out.println(linkedSet3.contains("라"));//f
	
	//size
	System.out.println(linkedSet3.size());
	
	//iterator
	Iterator<String> iterator = linkedSet3.iterator();
	while(iterator.hasNext()) {System.out.println(iterator.next());}
	
	//toArray
	Object[] objArray = linkedSet3.toArray();
	System.out.println(Arrays.toString(objArray));
	
	//toArray(T[] t)
	String[] strArray1 = linkedSet3.toArray(new String[0]);
	System.out.println(Arrays.toString(strArray1));
	
	String[] strArray2 = linkedSet3.toArray(new String[5]);
	System.out.println(Arrays.toString(strArray2));
}
}
