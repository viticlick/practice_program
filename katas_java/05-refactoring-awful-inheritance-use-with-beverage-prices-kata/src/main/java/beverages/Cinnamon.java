package beverages;

public class Cinnamon extends Supplement{

	private static final double INCREMENT = 0.05;

	public Cinnamon(Beverage beverage) {
		super(beverage);
	}
	
	@Override
	public double price() {
		return super.price() + INCREMENT;
	}

}
