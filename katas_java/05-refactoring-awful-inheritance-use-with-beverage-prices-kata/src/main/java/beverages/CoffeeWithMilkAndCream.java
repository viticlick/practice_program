package beverages;

public class CoffeeWithMilkAndCream extends Coffee {
    private static final double INCREMENT = 0.25;

	@Override
    public double price() {
        return super.price() +  INCREMENT;
    }
}
