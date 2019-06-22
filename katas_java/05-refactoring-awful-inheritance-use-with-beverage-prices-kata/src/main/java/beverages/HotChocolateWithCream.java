package beverages;

public class HotChocolateWithCream extends HotChocolate {
    private static final double PRICE = 1.45 + 0.15;

	@Override
    public double price() {
        return PRICE;
    }
}
