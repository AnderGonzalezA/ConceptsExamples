public class Bird extends Animal {
	public Bird(int age) {
		super(age);
	}
	public void fly() {
		System.out.println("Flying...");
	}
	public void eat() {
		System.out.println("Eating insects...");
	}
	public void eat(int quantity) {
		System.out.println("Eating "+quantity+" insects...");
	}
}