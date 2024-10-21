package 묵찌빠게임;

import java.util.Random;

public class Computer extends player{

	protected Computer(String name) {
		super(name);
	}

	@Override
	public String next() {
		Random ran = new Random();
		lastBet = ran.nextInt();
	}

}
