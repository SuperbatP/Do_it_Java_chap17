package sec01_list.EX05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMethod {
public static void main(String[] args) {
	List<Integer> linklist1=new LinkedList<Integer>();
	//add E element
	linklist1.add(3);
	linklist1.add(4);
	linklist1.add(5);
			System.out.println(linklist1.toString());
			
			//add(int index, E element)
			linklist1.add(1,6);
			System.out.println(linklist1.toString());
			
			//addAll
			List<Integer> linklist2 = new ArrayList<>();
			linklist2.add(1);
			linklist2.add(2);
			linklist2.addAll(linklist2);
			System.out.println(linklist2);
			
			//addAll(int index, 또다른 리스트 객체)
			List<Integer> linklist3 = new ArrayList<>();
			linklist3.add(1);
			linklist3.add(2);
			linklist3.addAll(1, linklist3);
			System.out.println(linklist3);
			
			//set(int index, E element)
			linklist3.set(1, 5);
			linklist3.set(3, 6);
//			linklist3.set(4, 7);
			System.out.println(linklist3);
			
			//remove(int index)
			linklist3.remove(1);
			System.out.println(linklist3);
			
			//remove(Object o)
			linklist3.remove(new Integer(2));
			System.out.println(linklist3);
			
			//clear()
			linklist3.clear();
			System.out.println(linklist3);
			
			//isEmpty()
			System.out.println(linklist3.isEmpty());
			
			//size()
			System.out.println(linklist3.size());
			linklist3.add(1);
			linklist3.add(2);
			linklist3.add(3);
			System.out.println(linklist3);
			System.out.println(linklist3.size());
			
			//get(int index)
			System.out.println("0번째: "+linklist3.get(0));
			System.out.println("1번째: "+linklist3.get(1));
			System.out.println("2번째: "+linklist3.get(2));
			for(int i=0;i<linklist3.size();i++)
			System.out.println(i +"번째: "+linklist3.get(i));
			
			//toArray() List->Array
			Object[] object=linklist3.toArray();
			System.out.println(Arrays.toString(object));
			
			//toArray(T[] t)-> T[]
			Integer[] integer1=linklist3.toArray(new Integer[0]);//값에 맞추어 데이터 크기 자동 변환
			System.out.println(Arrays.toString(integer1));
			
			Integer[] integer2=linklist3.toArray(new Integer[5]);
			System.out.println(Arrays.toString(integer2));
}
}
