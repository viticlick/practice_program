package beverages;

public class Tea implements Beverage {
    private static final double PRICE = 1.5;

	@Override
    public double price() {
        return PRICE;
    }
}
