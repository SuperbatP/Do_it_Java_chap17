package sec01_list.EX04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorMethod {
public static void main(String[] args) {
	List<Integer> vector1=new Vector<Integer>();
	//add E element
	vector1.add(3);
	vector1.add(4);
	vector1.add(5);
		System.out.println(vector1.toString());
		
		//add(int index, E element)
		vector1.add(1,6);
		System.out.println(vector1.toString());
		
		//addAll
		List<Integer> vector2 = new ArrayList<>();
		vector2.add(1);
		vector2.add(2);
		vector2.addAll(vector2);
		System.out.println(vector2);
		
		//addAll(int index, 또다른 리스트 객체)
		List<Integer> vector3 = new ArrayList<>();
		vector3.add(1);
		vector3.add(2);
		vector3.addAll(1, vector3);
		System.out.println(vector3);
		
		//set(int index, E element)
		vector3.set(1, 5);
		vector3.set(3, 6);
//		vector3.set(4, 7);
		System.out.println(vector3);
		
		//remove(int index)
		vector3.remove(1);
		System.out.println(vector3);
		
		//remove(Object o)
		vector3.remove(new Integer(2));
		System.out.println(vector3);
		
		//clear()
		vector3.clear();
		System.out.println(vector3);
		
		//isEmpty()
		System.out.println(vector3.isEmpty());
		
		//size()
		System.out.println(vector3.size());
		vector3.add(1);
		vector3.add(2);
		vector3.add(3);
		System.out.println(vector3);
		System.out.println(vector3.size());
		
		//get(int index)
		System.out.println("0번째: "+vector3.get(0));
		System.out.println("1번째: "+vector3.get(1));
		System.out.println("2번째: "+vector3.get(2));
		for(int i=0;i<vector3.size();i++)
		System.out.println(i +"번째: "+vector3.get(i));
		
		//toArray() List->Array
		Object[] object=vector3.toArray();
		System.out.println(Arrays.toString(object));
		
		//toArray(T[] t)-> T[]
		Integer[] integer1=vector3.toArray(new Integer[0]);//값에 맞추어 데이터 크기 자동 변환
		System.out.println(Arrays.toString(integer1));
		
		Integer[] integer2=vector3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2));
}
}
