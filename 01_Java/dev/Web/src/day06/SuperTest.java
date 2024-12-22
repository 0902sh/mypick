package day06;

public class SuperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		p.eat();
		p.shout();
		
		Child c = new Child();
		c.eat();
		c.shout();
		c.print();
	}

}
