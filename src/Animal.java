public class Animal {
	private int age=0;
	public Animal(int age) {
		this.age=age;
		System.out.println("I am "+this.age+".");
	}
	public void sleep() {
		System.out.println("Sleeping...");
	}
	public void eat() {
		System.out.println("Eating...");
	}
}