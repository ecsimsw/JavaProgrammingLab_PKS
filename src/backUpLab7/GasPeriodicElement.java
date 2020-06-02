package backUpLab7;

public class GasPeriodicElement extends PeriodicElement {
	// constructor
	public GasPeriodicElement(int number, String symbol, String name, double weight) {
		super(number, symbol, name, weight);
		state = State.GAS;
	}

	@Override
	public String toString() {
		return "GasPeriodicElement [number=" + number + ", symbol=" + symbol + ", name=" + name + ", weight=" + weight
				+ ", state=" + state + "]";
	}
	
	@Override
	public void print() {
			System.out.println("GasPeriodicElement");
			System.out.println("number : " + number);
			System.out.println("symbol : " + symbol);
			System.out.println("name   : " + name);
			System.out.println("weight : " + weight);
			System.out.println("state  : " + state);
			System.out.println();		
	}

}
