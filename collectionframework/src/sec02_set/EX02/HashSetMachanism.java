package sec02_set.EX02;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

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




public class HashSetMachanism {
public static void main(String[] args) {
	//equals, hashCode 오버라이딩 하지 않음
	Set<A> hashSet1 = new HashSet<>();
	A a1=new A(3);
	A a2=new A(3);
	System.out.println(a1==a2);//f
	System.out.println(a1.equals(a2));//f
	System.out.println(a1.hashCode()+", "+a2.hashCode());
	hashSet1.add(a1);
	hashSet1.add(a2);
	System.out.println(hashSet1.size());//다른 객체로 받아드림. 2
	System.out.println();
	
	//equals만 오버라이딩
	Set<B> hashSet2 = new HashSet<>();
	B b1=new B(3);
	B b2=new B(3);
	System.out.println(b1==b2);//f
	System.out.println(b1.equals(b2));//t
	System.out.println(b1.hashCode()+", "+b2.hashCode());
	hashSet2.add(b1);
	hashSet2.add(b2);
	System.out.println(hashSet2.size());//hashcode가 달라서 2
	System.out.println();
	
	//equals, hashCode 둘다 오버라이딩
	Set<C> hashSet3 = new HashSet<>();
	C c1=new C(3);
	C c2=new C(3);
	System.out.println(c1==c2);//f
	System.out.println(c1.equals(c2));//t
	System.out.println(c1.hashCode()+", "+c2.hashCode());//t
	hashSet3.add(c1);
	hashSet3.add(c2);
	System.out.println(hashSet3.size());//같은 객체로 받아드림 1
	
	
}
}
