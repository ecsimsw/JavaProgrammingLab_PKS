package Lab8;
import dto.*;
public class UnknownPeriodicElement extends Element.PeriodicElement {

	public UnknownPeriodicElement(int number, String symbol, String name, double weight, int period, int group, Type type, State state) {
		super(number, symbol, name, weight, period, group, type, state);

		state = State.UNKNOWN;
	}

	@Override
	public String toString() {
		return "Lab8.UnknownPeriodicElement [number=" + number + ", symbol=" + symbol + ", name=" + name + ", weight="
				+ weight + ", state=" + state + "]";
	}
	
	@Override
	public void print() {
			System.out.println("Lab8.UnknownPeriodicElement");
			System.out.println("number : " + number);
			System.out.println("symbol : " + symbol);
			System.out.println("name   : " + name);
			System.out.println("weight : " + weight);
			System.out.println("state  : " + state);
			System.out.println();		
	}
}
