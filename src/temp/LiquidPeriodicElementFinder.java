package temp;

public class LiquidPeriodicElementFinder extends PeriodicElementFinder {

	@Override
	public boolean isInstanceOf(Element.PeriodicElement e) {
		if (e instanceof LiquidPeriodicElement) 
			return true;
		return false;
	}

}
