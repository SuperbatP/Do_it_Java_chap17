package sec01_list.EX03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethod {
public static void main(String[] args) {
	List<Integer> aList1 = new ArrayList<Integer>();
	//add E element
	aList1.add(3);
	aList1.add(4);
	aList1.add(5);
	System.out.println(aList1.toString());
	
	//add(int index, E element)
	aList1.add(1,6);
	System.out.println(aList1.toString());
	
	//addAll
	List<Integer> aList2 = new ArrayList<>();
	aList2.add(1);
	aList2.add(2);
	aList2.addAll(aList1);
	System.out.println(aList2);
	
	//addAll(int index, 또다른 리스트 객체)
	List<Integer> aList3 = new ArrayList<>();
	aList3.add(1);
	aList3.add(2);
	aList3.addAll(1, aList3);
	System.out.println(aList3);
	
	//set(int index, E element)
	aList3.set(1, 5);
	aList3.set(3, 6);
//	aList3.set(4, 7);
	System.out.println(aList3);
	
	//remove(int index)
	aList3.remove(1);
	System.out.println(aList3);
	
	//remove(Object o)
	aList3.remove(new Integer(2));
	System.out.println(aList3);
	
	//clear()
	aList3.clear();
	System.out.println(aList3);
	
	//isEmpty()
	System.out.println(aList3.isEmpty());
	
	//size()
	System.out.println(aList3.size());
	aList3.add(1);
	aList3.add(2);
	aList3.add(3);
	System.out.println(aList3);
	System.out.println(aList3.size());
	
	//get(int index)
	System.out.println("0번째: "+aList3.get(0));
	System.out.println("1번째: "+aList3.get(1));
	System.out.println("2번째: "+aList3.get(2));
	for(int i=0;i<aList3.size();i++)
	System.out.println(i +"번째: "+aList3.get(i));
	
	//toArray() List->Array
	Object[] object=aList3.toArray();
	System.out.println(Arrays.toString(object));
	
	//toArray(T[] t)-> T[]
	Integer[] integer1=aList3.toArray(new Integer[0]);//값에 맞추어 데이터 크기 자동 변환
	System.out.println(Arrays.toString(integer1));
	
	Integer[] integer2=aList3.toArray(new Integer[5]);
	System.out.println(Arrays.toString(integer2));
	
}
}
