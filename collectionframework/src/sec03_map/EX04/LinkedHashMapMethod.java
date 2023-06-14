package sec03_map.EX04;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapMethod {
public static void main(String[] args) {
	Map<Integer, String> lhMap1 = new LinkedHashMap<Integer, String>();
	//put
	lhMap1.put(2,"나다라");
	lhMap1.put(1,"가나다");
	lhMap1.put(3,"다라마");
	System.out.println(lhMap1.toString());
	
	//putAll
	Map<Integer, String> lhMap2 = new LinkedHashMap<Integer, String>();
	lhMap2.putAll(lhMap2);
	System.out.println(lhMap2.toString());
	
	//replace
	lhMap2.replace(1, "가가가");
	lhMap2.replace(4, "라라라"); //동작안함
	System.out.println(lhMap2.toString());
	
	//replace2
	lhMap2.replace(1, "가가가", "나나나");
	lhMap2.replace(2, "다다다", "라라라"); //동작안함
	System.out.println(lhMap2.toString());
	
	//V get
	System.out.println(lhMap2.get(1));
	System.out.println(lhMap2.get(2));
	System.out.println(lhMap2.get(3));
	
	//containsKey
	System.out.println(lhMap2.containsKey(1));
	System.out.println(lhMap2.containsKey(5));
	
	//containsValue
	System.out.println(lhMap2.containsValue("나나나"));
	System.out.println(lhMap2.containsValue("다다다"));
	
	//Set<K> keySet()
	Set<Integer> keySet = lhMap2.keySet();
	System.out.println(keySet.toString());
	
	//Set<Map.Entry<K,V>> entrySet()
	Set<Map.Entry<Integer,String>> entrySet = lhMap2.entrySet();
	System.out.println(entrySet.toString());//꺾인괄호
	//size
	System.out.println(lhMap2.size());
	//remove
	lhMap2.remove(1);
	lhMap2.remove(4);
	System.out.println(lhMap2.toString());
	
	lhMap2.remove(2, "나다라");
	lhMap2.remove(3, "다다다");//동작안함
	System.out.println(lhMap2.toString());
	
	lhMap2.clear();
	System.out.println(lhMap2.toString());
	
	
}
}
