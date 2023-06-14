package sec03_map.EX05;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapMethod_1 {
public static void main(String[] args) {
	 TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
	 for(int i=20; i>0; i-=2) {treeMap.put(i,i+" 번째 데이터");}
		System.out.println(treeMap.toString());//set으로 정렬되어 오름차순으로 출력
//firstKey
System.out.println(treeMap.firstKey());//2
//firstEntryKey
System.out.println(treeMap.firstEntry());//2=2번째 데이터
//lastKey
System.out.println(treeMap.lastKey());//20
//lastEntryKey
System.out.println(treeMap.lastEntry());//20=20번째 데이터
//lowerKey
System.out.println(treeMap.lowerKey(11));//10
//lowerKey
System.out.println(treeMap.lowerKey(10));//8
//higherKey
System.out.println(treeMap.higherKey(11));//12
//higherKey
System.out.println(treeMap.higherKey(10));//12
//pollFirstEntry
System.out.println(treeMap.pollFirstEntry());
System.out.println(treeMap.toString());
//pollLastEntry
System.out.println(treeMap.pollLastEntry());
System.out.println(treeMap.toString());
//SortedMap<K,V> headMap(K toKey)
SortedMap<Integer,String> sortedMap=treeMap.headMap(8);//시작부터 키 값이 8까지
System.out.println(sortedMap);//시작포함 끝 미포함
//NavigableMap<K,V> headMap(K toKey, boolean inclusive)
NavigableMap<Integer,String> navigableMap=treeMap.headMap(8, true);//끝 키 값이 8 true=포함
System.out.println(navigableMap);//시작포함 끝 포함
//SortedMap<K,V> tailMap(K toKey)
sortedMap=treeMap.tailMap(14);//시작 키 값이 14부터 끝까지
System.out.println(sortedMap);//시작포함 끝 포함
//NavigableMap<K,V> headMap(K toKey, boolean inclusive)
navigableMap=treeMap.tailMap(14, false);//시작 키 값 14 미포함
System.out.println(navigableMap);//시작미포함 끝 포함

sortedMap=treeMap.subMap(6,10);//6에서 10까지
System.out.println(sortedMap);//시작포함 끝 포함

navigableMap=treeMap.subMap(6, false,10,true);//6미포함 10포함
System.out.println(navigableMap);//시작미포함 끝포함

NavigableSet<Integer> navigableSet = treeMap.descendingKeySet();
System.out.println(navigableSet.toString());
System.out.println(navigableSet.descendingSet());

navigableMap=treeMap.descendingMap();
System.out.println(navigableMap.toString());
System.out.println(navigableMap.descendingMap());

}
}
