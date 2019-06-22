package beverages;

public class HotChocolate implements Beverage {
    private static final double PRICE = 1.45;

	@Override
    public double price() {
        return PRICE;
    }
}
