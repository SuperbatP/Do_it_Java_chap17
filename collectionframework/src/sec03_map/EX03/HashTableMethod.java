package sec03_map.EX03;


import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableMethod {
public static void main(String[] args) {
	Map<Integer, String> hTable1 = new Hashtable<Integer, String>();
	//put
	hTable1.put(2,"나다라");
	hTable1.put(1,"가나다");
	hTable1.put(3,"다라마");
	System.out.println(hTable1.toString());
	
	//putAll
	Map<Integer, String> hTable2 = new Hashtable<Integer, String>();
	hTable2.putAll(hTable1);
	System.out.println(hTable2.toString());
	
	//replace
	hTable2.replace(1, "가가가");
	hTable2.replace(4, "라라라"); //동작안함
	System.out.println(hTable2.toString());
	
	//replace2
	hTable2.replace(1, "가가가", "나나나");
	hTable2.replace(2, "다다다", "라라라"); //동작안함
	System.out.println(hTable2.toString());
	
	//V get
	System.out.println(hTable2.get(1));
	System.out.println(hTable2.get(2));
	System.out.println(hTable2.get(3));
	
	//containsKey
	System.out.println(hTable2.containsKey(1));
	System.out.println(hTable2.containsKey(5));
	
	//containsValue
	System.out.println(hTable2.containsValue("나나나"));
	System.out.println(hTable2.containsValue("다다다"));
	
	//Set<K> keySet()
	Set<Integer> keySet = hTable2.keySet();
	System.out.println(keySet.toString());
	
	//Set<Map.Entry<K,V>> entrySet()
	Set<Map.Entry<Integer,String>> entrySet = hTable2.entrySet();
	System.out.println(entrySet.toString());//꺾인괄호
	//size
	System.out.println(hTable2.size());
	//remove
	hTable2.remove(1);
	hTable2.remove(4);
	System.out.println(hTable2.toString());
	
	hTable2.remove(2, "나다라");
	hTable2.remove(3, "다다다");//동작안함
	System.out.println(hTable2.toString());
	
	hTable2.clear();
	System.out.println(hTable2.toString());
	
	
}
}
