package backUpLab7;

public class ILiquidPeriodicElementFinder implements IPeriodicElementFinder {

	@Override
	public boolean isInstanceOf(PeriodicElement e) {
		if (e instanceof LiquidPeriodicElement) 
			return true;
		return false;
	}

}
