package problem03;

public class Money {
	
	//
	// 클래스 구현을 완성 하십시오.
	// 

	
	private int amount;
	
	public Money(int amount) {
	}

	public Money add(Money money) {
		amount = amount + money.amount;
		return null;
	}

	public Money minus(Money money) {
		amount = amount - money.amount;
		return null;
	}

	public Money multiply(Money money) {
		amount = amount * money.amount;
		return null;
	}

	public Money devide(Money money) {
		amount = amount / money.amount;
		return null;
	}
}