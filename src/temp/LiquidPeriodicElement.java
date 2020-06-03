package temp;
import dto.*;

public class LiquidPeriodicElement extends Element.PeriodicElement {

	public LiquidPeriodicElement(int number, String symbol, String name, double weight, int period, int group, Type type, State state) {
		super(number, symbol, name, weight, period, group, type, state);

		this.state = state = State.LIQUID;
	}

	@Override
	public String toString() {
		return "Lab8.LiquidPeriodicElement [number=" + number + ", symbol=" + symbol + ", name=" + name + ", weight="
				+ weight + ", state=" + state + "]";
	}

	@Override
	public void print() {
			System.out.println("Lab8.LiquidPeriodicElement");
			System.out.println("number : " + number);
			System.out.println("symbol : " + symbol);
			System.out.println("name   : " + name);
			System.out.println("weight : " + weight);
			System.out.println("period : " + period);
			System.out.println("group : " + group);
			System.out.println("type : " + type);
			System.out.println("state  : " + state);
			System.out.println();		
	}
}