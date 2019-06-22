package beverages;

public class HotChocolateMaker implements BeverageMaker {
	private Beverage beverage = new HotChocolate();

	public HotChocolateMaker withMilk() {
		beverage = new Milk(beverage);
		return this;
	}

	public HotChocolateMaker withCinnamon() {
		beverage = new Cinnamon(beverage);
		return this;
	}

	public HotChocolateMaker withCream() {
		beverage = new Cream(beverage);
		return this;
	}

	@Override
	public Beverage serve() {
		return beverage;
	}
}
