package beverages;

public class Cream extends Supplement {

	private static final double INCREMENT = 0.15;

	public Cream(Beverage beverage) {
		super(beverage);
	}

	@Override
	public double price() {
		return super.price() + INCREMENT;
	}
	
}
