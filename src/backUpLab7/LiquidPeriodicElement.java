package backUpLab7;

public class LiquidPeriodicElement extends PeriodicElement {
	// constructor
	public LiquidPeriodicElement(int number, String symbol, String name, double weight) {
		super(number, symbol, name, weight);
		state = State.LIQUID;
	}

	@Override
	public String toString() {
		return "LiquidPeriodicElement [number=" + number + ", symbol=" + symbol + ", name=" + name + ", weight="
				+ weight + ", state=" + state + "]";
	}

	@Override
	public void print() {
			System.out.println("LiquidPeriodicElement");
			System.out.println("number : " + number);
			System.out.println("symbol : " + symbol);
			System.out.println("name   : " + name);
			System.out.println("weight : " + weight);
			System.out.println("state  : " + state);
			System.out.println();		
	}
}
