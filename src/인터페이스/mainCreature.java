package 인터페이스;

public class mainCreature {

	public static void main(String[] args) {
		Human a = new Human();
		Whale b = new Whale();
		Parrot c = new Parrot();
		
		
		a.alive();
		a.move();
		a.run();
		b.alive();
		b.run();
		b.move();
		c.run();
		c.alive();
		c.move();
		a.barking();
		a.Swimming();
		

	}

}
