
public class LiquidPeriodicElementFinder extends PeriodicElementFinder {

	@Override
	public boolean isInstanceOf(PeriodicElement e) {
		if (e instanceof LiquidPeriodicElement) 
			return true;
		return false;
	}

}
