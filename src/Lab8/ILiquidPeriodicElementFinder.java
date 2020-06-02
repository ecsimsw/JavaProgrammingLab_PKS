package Lab8;

public class ILiquidPeriodicElementFinder implements IPeriodicElementFinder {

	@Override
	public boolean isInstanceOf(Element.PeriodicElement e) {
		if (e instanceof LiquidPeriodicElement) 
			return true;
		return false;
	}

}
