package beverages;

public class Coffee implements Beverage {
    private static final double PRICE = 1.2;

	@Override
    public double price() {
        return PRICE;
    }
}
