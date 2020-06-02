package backUpLab7;

public class SolidPeriodicElement extends PeriodicElement {
	// constructor
	public SolidPeriodicElement(int number, String symbol, String name, double weight) {
		super(number, symbol, name, weight);
		state = State.SOLID;
	}

	@Override
	public String toString() {
		return "SolidPeriodicElement [number=" + number + ", symbol=" + symbol + ", name=" + name + ", weight=" + weight
				+ ", state=" + state + "]";
	}

	@Override
	public void print() {
			System.out.println("SolidPeriodicElement");
			System.out.println("number : " + number);
			System.out.println("symbol : " + symbol);
			System.out.println("name   : " + name);
			System.out.println("weight : " + weight);
			System.out.println("state  : " + state);
			System.out.println();		
	}
}
