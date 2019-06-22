package beverages;

public class Milk extends Supplement {

	private static final double INCREMENT = 0.1;

	public Milk(Beverage beverage) {
		super(beverage);
	}

	public double price() {
		return super.price() + INCREMENT;
	}

}
