package beverages;

public class CoffeMaker implements BeverageMaker {

	private Beverage beverage = new Coffee();

	public CoffeMaker withMilk() {
		beverage = new Milk(beverage);
		return this;
	}

	public CoffeMaker withCinnamon() {
		beverage = new Cinnamon(beverage);
		return this;
	}

	public CoffeMaker withCream() {
		beverage = new Cream(beverage);
		return this;
	}

	@Override
	public Beverage serve() {
		return beverage;
	}

}
