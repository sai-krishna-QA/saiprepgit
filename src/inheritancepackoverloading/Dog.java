package inheritancepackoverloading;

public class Dog extends Animal {
	
	
public void play() {
	System.out.println("Dog is playing");
}
@Override
public void eat() {
	System.out.println("Dog is eating");
}
}
