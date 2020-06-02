package Lab8;

public class SolidPeriodicElementFinder extends PeriodicElementFinder {

	@Override
	public boolean isInstanceOf(Element.PeriodicElement e) {
		if (e instanceof SolidPeriodicElement) 
			return true;
		return false;
	}

}

