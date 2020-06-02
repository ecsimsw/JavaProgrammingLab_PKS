
public class UnknownPeriodicElement extends PeriodicElement {
	// constructor
	public UnknownPeriodicElement(int number, String symbol, String name, double weight) {
		super(number, symbol, name, weight);
		state = State.UNKNOWN;
	}

	@Override
	public String toString() {
		return "UnknownPeriodicElement [number=" + number + ", symbol=" + symbol + ", name=" + name + ", weight="
				+ weight + ", state=" + state + "]";
	}
	
	@Override
	public void print() {
			System.out.println("UnknownPeriodicElement");
			System.out.println("number : " + number);
			System.out.println("symbol : " + symbol);
			System.out.println("name   : " + name);
			System.out.println("weight : " + weight);
			System.out.println("state  : " + state);
			System.out.println();		
	}
}
