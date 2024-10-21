package 묵찌빠게임;

public class Human extends player{

	protected Human(String name) {
		super(name);
	}

	@Override
	public String next() {
		return lastBet;
	}

}
