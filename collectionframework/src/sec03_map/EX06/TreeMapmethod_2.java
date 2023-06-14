package sec03_map.EX06;

import java.util.Comparator;
import java.util.TreeMap;


class MyClass{
	int data1;
	int data2;
	public MyClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;}	
	@Override
	public String toString() {
		return "data1="+data1+"을 가지고 있는 클래스";
	}
}

class MyComparableClass implements Comparable<MyComparableClass>{
	int data1;
	int data2;
	public MyComparableClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;}
	@Override
	public int compareTo(MyComparableClass o) {//크기비교의 기준을 여기서 설정(음수,0,양수)
		if(this.data1<o.data1) return-1;
		else if(this.data1==o.data1) return 0;
		else return 1;
	}
	@Override
	public String toString() {
		return "data1="+data1+"을 가지고 있는 클래스";
	}
}



public class TreeMapmethod_2 {
public static void main(String[] args) {
	//Integer 크기비교
	TreeMap<Integer, String> treeMap1=new TreeMap<Integer, String>();
	Integer intValue1 = new Integer(20);
	Integer intValue2 = new Integer(10);
	treeMap1.put(intValue1, "가나다");
	treeMap1.put(intValue2, "나라다");
	System.out.println(treeMap1.toString());
	
	//String 크기비교
	TreeMap<String, Integer> treeMap2=new TreeMap<String, Integer>();
	String str1="가나";
	String str2="다라";
	treeMap2.put(str1, 10);
	treeMap2.put(str2, 20);
	System.out.println(treeMap2.toString());
	
	//MyClass 객체 크기 비교 기준이 없어서 비교 불가.->runtime 오류
//	TreeMap<MyClass, String> treeMap3=new TreeMap<MyClass, String>();
//	MyClass myclass1 = new MyClass(2,5);
//	MyClass myclass2 = new MyClass(3,3);
//	treeMap3.put(myclass1,"가나다");
//	treeMap3.put(myclass2,"나라다");
//	System.out.println(treeMap3.toString());
	
	//MyComparableClass 객체 크기 비교 1
	TreeMap<MyComparableClass, String> treeMap4=new TreeMap<MyComparableClass, String>();
	MyComparableClass myComparableClass1 = new MyComparableClass(2,5);
	MyComparableClass myComparableClass2 = new MyComparableClass(3,3);
	treeMap4.put(myComparableClass1, "가나다");
	treeMap4.put(myComparableClass2, "나라다");
	System.out.println(treeMap4);
	
	//MyComparableClass 객체 크기 비교 2
	TreeMap<MyClass, String> treeMap5=new TreeMap<MyClass, String>(new Comparator<MyClass>() {
		@Override
		public int compare(MyClass o1, MyClass o2) {
			if(o1.data1<o2.data1) return-1;
			else if(o1.data1==o2.data1) return 0;
			else return 1;
		}
	});
	
	MyClass myClass1=new MyClass(2,5);
	MyClass myClass2=new MyClass(3,3);
	treeMap5.put(myClass1,"가나다");
	treeMap5.put(myClass2,"나라다");
	System.out.println(treeMap5);

}
}
