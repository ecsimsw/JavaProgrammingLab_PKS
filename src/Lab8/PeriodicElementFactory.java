package Lab8;

import dto.*;

public class PeriodicElementFactory {
	// getInstance Lab8.State->Lab8.Element.PeriodicElement
	public static Element.PeriodicElement getInstance(int number, String symbol, String name, double weight,
													  int period, int group, Type type, State state) {
		switch (state) {
		case GAS: 
			return new GasPeriodicElement(number, symbol, name, weight, period, group, type, state);
		case SOLID: 
			return new SolidPeriodicElement(number, symbol, name, weight, period, group, type, state);
		case LIQUID: 
			return new LiquidPeriodicElement(number, symbol, name, weight, period, group, type, state);
		case UNKNOWN: 
			return new UnknownPeriodicElement(number, symbol, name, weight, period, group, type, state);
		default: 
			return null;
		}
	}
}
