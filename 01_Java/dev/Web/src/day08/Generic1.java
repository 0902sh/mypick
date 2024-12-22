package day08;

import java.util.ArrayList;

public class Generic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food ramen = new Food("라면", "그냥 끓이면 됨");
		
		// OldBox
		OldBox ob = new OldBox();
		ob.add(ramen);
		System.out.println(((Food)ob.get(0)).getRecipe());
		// ob.get(0)의 리턴값은 Object이므로 getRecipe()가 없음 -> Casting 필요
		
		// NewBox
		NewBox<Food> nb = new NewBox();
		nb.add(ramen);
		System.out.println(nb.get(0).getRecipe());
		
		// StrangeBox
		StrangeBox<String> sb = new StrangeBox();
		sb.name = "스파르타학원";
		sb.name.charAt(3);
		
//		StrangeBox<Integer> sb2 = new StrangeBox();
//		sb2.name = 111;
//		sb2.name.charAt(2);
	}

}

class Food {
	String name;
	String recipe;
	
	Food(String name, String recipe) {
		this.name = name;
		this.recipe = recipe;
	}
	
	String getRecipe() {
		return recipe;
	}
}

class OldBox {
	ArrayList item = new ArrayList();
	
	void add(Object o) {
		item.add(o);
	}
	
	Object get(int index) {
		return item.get(index);
	}
}

class NewBox<T> {
	// T, E, (K, V) : T=Type, E=Element, K=Key, V=Value
	ArrayList<T> item = new ArrayList();
	
	void add(T o) {
		item.add(o);
	}
	
	T get(int index) {
		return item.get(index);
		
		
	}
}
class StrangeBox<DisneyLand> {
	DisneyLand name;
}