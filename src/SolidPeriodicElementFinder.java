
public class SolidPeriodicElementFinder extends PeriodicElementFinder {

	@Override
	public boolean isInstanceOf(PeriodicElement e) {
		if (e instanceof SolidPeriodicElement) 
			return true;
		return false;
	}

}

