public class Zoo {
	public static void main(String[] args) {
		Bird eagle = new Bird(10);
		eagle.sleep();
		eagle.eat();
		eagle.eat(5);
		eagle.fly();
		Lion simba = new Lion(15);
		simba.sleep();
		simba.eat();
	}
}