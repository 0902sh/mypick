package day07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. ArrayTest
		ArrayList arr = new ArrayList();
		
		// (1) 리스트에 요소 추가(add)
		arr.add("돈까스");
		arr.add("치킨");
		arr.add("쌀국수");
		arr.add("라면");
		System.out.println(arr);
		
		for(int i=0; i<arr.size(); i++) {
			System.out.println(i + " : " + arr.get(i));
		}
		
		// (2) 요소 삭제
		arr.remove(1);
		arr.remove("돈까스");
		System.out.println("[메뉴 2개 삭제 후]" + arr);
		
		// (3) 요소 변경
		arr.set(0, "스파게티");
		System.out.println("[메뉴 변경 후]" + arr);
		
		
		try {
			System.out.println("[메뉴 변경 후]" + arr.get(100));
		}
		catch(Exception e) {
			System.out.println("나중에 꼭 추가해드릴게요");
		}
		// (4) Iterator
		Iterator iter = arr.iterator();
		while(iter.hasNext()) {
			System.out.println("Iterator : " + iter.next());
		}
		// (5) size() : 요소 개수 구하기
		System.out.println("size : 총 메뉴 개수는 " + arr.size() + "개");
		
		// (6) contains() : 요소 있는지 알아보기
		System.out.println("contains : 라면 있나요 - " + arr.contains("라면"));
		System.out.println("contains : 돈까스 있나요 - " + arr.contains("돈까스"));
		
		// 2. LinkedList
		LinkedList link = new LinkedList();
		link.add("슬램덩크");
		link.add(0, "트위스터스");
		link.add(1, "사랑의 하츄핑");
		System.out.println("\nLinkedList : " + link);
		
		// 3. Performance
		ArrayList app1 = new ArrayList();
		LinkedList app2 = new LinkedList();
		
		final int SAMPLE_CNT = 10000;
		for(int i=0; i<SAMPLE_CNT; i++) {
			app1.add(i);
			app2.add(i);
			
		}
		
		long start = System.currentTimeMillis();
		for(int i=0; i<SAMPLE_CNT; i++) {
			app2.get(i);
		}
		long mid = System.currentTimeMillis();
		for(int i=0; i<SAMPLE_CNT; i++) {
			app2.get(i);
	}
		long end = System.currentTimeMillis();
		
		System.out.println("****** Read Competition ****");
		System.out.println("ArrayList : " + (mid-start));
		System.out.println("LinkedList : " + (end-mid));
		
		// insert test
		start = System.currentTimeMillis();
		for(int i=0; i<SAMPLE_CNT; i++) {
			app2.get(i);
			app1.add(3000, i);
		}
		mid = System.currentTimeMillis();
		for(int i=0; i<SAMPLE_CNT; i++) {
			app2.get(i);
			app2.add(3000, i);
	}
		end = System.currentTimeMillis();
}
	
}
