package inheritancepackoverloading;

public class Demo extends Dog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Dog c = new Dog();
		c.fly=true;
		c.fly=false;
		c.run=true;
		c.legs=4;
		
		c.eat();
		c.play();
		c.drink();
		c.sleep();
		
	}

}
