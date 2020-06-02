package backUpLab7;

public class PeriodicElementFactory {
	// getInstance State->PeriodicElement	
	public static PeriodicElement getInstance(int number, String symbol, String name, double weight, State state) {
		switch (state) {
		case GAS: 
			return new GasPeriodicElement(number, symbol, name, weight);
		case SOLID: 
			return new SolidPeriodicElement(number, symbol, name, weight);
		case LIQUID: 
			return new LiquidPeriodicElement(number, symbol, name, weight);
		case UNKNOWN: 
			return new UnknownPeriodicElement(number, symbol, name, weight);
		default: 
			return null;
		}
	}
}
