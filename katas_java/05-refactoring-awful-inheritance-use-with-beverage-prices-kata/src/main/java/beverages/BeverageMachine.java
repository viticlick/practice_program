package beverages;

public class BeverageMachine {

	public static TeaMaker tea() {
		return new TeaMaker();
	}

	public static CoffeMaker coffe() {
		return new CoffeMaker();
	}

}
