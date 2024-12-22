package day07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class MapCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm = new HashMap();
		TreeMap<String, Integer> tm = new TreeMap();
		
		// (1) put() : 데이터 저장 cf) CURL : post, get, put, delete, patch
		String[] food = {"Steak", "Chicken", "Rice", "Curri"};
		int[] price = {10000, 15000, 9000, 500};
		
		for(int i=0; i<food.length; i++) {
			hm.put(food[i], price[i]);
			tm.put(food[i], price[i]);
		}
		
		System.out.println("HashMap : " + hm);
		System.out.println("TreeMap : " + tm);
		
		// (2) get() : 데이터 조회
		// 1) Enhanced For
		for(String key : hm.keySet()) {
			System.out.println(key + " : " + hm.get(key));
			
		}
		
		// 2) Iterator
		Iterator keys = tm.keySet().iterator();
		while(keys.hasNext()) {
			String key = (String)keys.next();
			System.out.println(key + " : " + tm.get(key));
		
		}
		
		// (3) remove() : 데이터 삭제, replace() : 데이터 정정
		hm.remove("Rice");
		hm.replace("Steak", 1000);
		System.out.println(hm);
	}

}
