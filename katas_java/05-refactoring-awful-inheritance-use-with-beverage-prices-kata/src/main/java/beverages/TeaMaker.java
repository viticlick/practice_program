package beverages;

public class TeaMaker implements BeverageMaker {

	private Beverage beverage = new Tea();

	public TeaMaker withMilk() {
		beverage = new Milk(beverage);
		return this;
	}

	public TeaMaker withCinnamon() {
		beverage = new Cinnamon(beverage);
		return this;
	}

	@Override
	public Beverage serve() {
		return beverage;
	}

}
