package beverages;

public class TeaWithMilk extends Tea {
    private static final double INCREMENT = 0.10;

	@Override
    public double price() {
        return super.price() +  INCREMENT;
    }
}
