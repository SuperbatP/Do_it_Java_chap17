package sec03_map.EX07;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSummary {
public static void main(String[] args) {
	//HashMap
	Map<String, Integer> hashMap = new HashMap<>();
	hashMap.put("다", 30);
	hashMap.put("마", 40);
	hashMap.put("나", 50);
	hashMap.put("가", 60);
	System.out.println(hashMap.toString());//입력순서!=출력순서
	
	//HashTable HashMap와 똑같고 멀티쓰레드에 용이
	Map<String, Integer> hashTable = new Hashtable<>();
	hashTable.put("다", 30);
	hashTable.put("마", 40);
	hashTable.put("나", 50);
	hashTable.put("가", 60);
	System.out.println(hashTable.toString());//입력순서!=출력순서
	
	//LikedHashMap
	Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
	linkedHashMap.put("다", 30);
	linkedHashMap.put("마", 40);
	linkedHashMap.put("나", 50);
	linkedHashMap.put("가", 60);
	System.out.println(linkedHashMap.toString());//입력순서=출력순서
	
	//LikedHashMap
	Map<String, Integer> treeMap = new TreeMap<>();
	treeMap.put("다", 30);
	treeMap.put("마", 40);
	treeMap.put("나", 50);
	treeMap.put("가", 60);
	System.out.println(treeMap.toString());// 키 값을 기준으로 항상 오름차순 출력
}
}
