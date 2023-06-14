package sec03_map.EX02;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;



class A{//우클릭-source-Generate Constructors using Fields
	int data;
	public A(int data) {this.data=data;}
}

class B{
	int data;
	public B(int data) {this.data=data;}
	@Override//equals 오버라이딩
	public boolean equals(Object obj) {
	if(obj instanceof B) {
		if(this.data==((B)obj).data)
		return true;}
	return false;}
}

class C{
	int data;
	public C(int data) {this.data=data;}
	@Override//equals 오버라이딩
	public boolean equals(Object obj) {
	if(obj instanceof C) {
		if(this.data==((C)obj).data)
		return true;}
	return false;}
	@Override//hashCode 오버라이딩
	public int hashCode() {return Objects.hash(data);}
	
}

public class HashMapMachanism {
	public static void main(String[] args) {
		//equals, hashCode 오버라이딩 하지 않음
		Map<A, String> hashMap1 = new HashMap<>();
		A a1=new A(3);
		A a2=new A(3);
		System.out.println(a1==a2);//f
		System.out.println(a1.equals(a2));//f
		System.out.println(a1.hashCode()+", "+a2.hashCode());
		hashMap1.put(a1,"첫 번째");
		hashMap1.put(a2,"두 번째");
		System.out.println(hashMap1.size());//다른 객체로 받아드림. 2
		System.out.println();
		
		//equals만 오버라이딩
		Map<B, String> hashMap2 = new HashMap<>();
		B b1=new B(3);
		B b2=new B(3);
		System.out.println(b1==b2);//f
		System.out.println(b1.equals(b2));//t
		System.out.println(b1.hashCode()+", "+b2.hashCode());
		hashMap2.put(b1,"첫 번째");
		hashMap2.put(b2,"두 번째");
		System.out.println(hashMap2.size());//hashcode가 달라서 2
		System.out.println();
		
		//equals, hashCode 둘다 오버라이딩
		Map<C, String> hashMap3 = new HashMap<>();
		C c1=new C(3);
		C c2=new C(3);
		System.out.println(c1==c2);//f
		System.out.println(c1.equals(c2));//t
		System.out.println(c1.hashCode()+", "+c2.hashCode());//t
		hashMap3.put(c1,"첫 번째");
		hashMap3.put(c2,"두 번째");
		System.out.println(hashMap3.size());//같은 객체로 받아드림 1
		
		
	}
}
