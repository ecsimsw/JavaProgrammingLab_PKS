package temp;

import dto.*;

public class PeriodicElementFactory {
	// getInstance Lab8.State->Lab8.Element.PeriodicElement
	public static Element.PeriodicElement getInstance(int number, String symbol, String name, double weight,
													  int period, int group, Type type, State state) {
		return new Element.PeriodicElement(number, symbol, name, weight, period, group, type, state);
	}
}
