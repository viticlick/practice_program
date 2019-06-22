package beverages;

public abstract class Supplement implements Beverage{
	
	private final Beverage beverage;

	public Supplement(Beverage beverage) {
		this.beverage = beverage;
	}

}
