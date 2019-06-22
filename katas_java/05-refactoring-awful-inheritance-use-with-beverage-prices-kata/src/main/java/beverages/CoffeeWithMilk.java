package beverages;

public class CoffeeWithMilk extends Coffee {
    private static final double INCREMENT = 0.10; 
    
	@Override
    public double price() {
        return super.price() +  INCREMENT;
    }
}
