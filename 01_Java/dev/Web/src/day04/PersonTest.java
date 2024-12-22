package day04;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		Person p2 = new Person("Poiret");
		
		
		p1.u.p(p1.name);
		p2.u.p(p2.name);
		p1.u.p(Person.place);
		p1.place = "The Sun";
		p1.u.p(Person.place);
		p1.u.p(p2.place);
		
		
		// static test
		p1.hit();
		p2.hit();
		Person.hit();
		
		System.out.println(p1);
		
		
	}

}
