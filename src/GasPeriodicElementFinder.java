
public class GasPeriodicElementFinder extends PeriodicElementFinder {

	@Override
	public boolean isInstanceOf(PeriodicElement e) {
		if (e instanceof GasPeriodicElement) 
			return true;
		return false;
	}

}
