package day07;

import java.util.HashSet;
import java.util.TreeSet;

public class SetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. HashSet
		HashSet movie = new HashSet();
		movie.add("매트릭스");
		movie.add("주글래살래");
		movie.add("쇼생크탈출");
		movie.add(new Dog());
		System.out.println("HashSet : " + movie);
		
		// 2. TreeSet
		TreeSet ts = new TreeSet();
		ts.add("매트릭스");
		ts.add("주글래살래");
		ts.add("쇼생크탈출");
		ts.add("터미네이터");
		ts.add("다크나이트");
		//ts.add(new Dog()); => Comparator 구현 시 가능할 걸?
		System.out.println(ts);
		
		TreeSet subSet1 = (TreeSet)ts.subSet("매트릭스", "주글래살래");
		System.out.println("Subset1 : " + subSet1);
		TreeSet subSet2 = (TreeSet)ts.subSet("매트릭스", true, "주글래살래", true);
		System.out.println("Subset2 : " + subSet2);
		TreeSet subSet3 = (TreeSet)ts.subSet("매", "철");
		System.out.println("Subset3 : " + subSet3);

	}

}


class Dog {
	String name;
	int age;
}