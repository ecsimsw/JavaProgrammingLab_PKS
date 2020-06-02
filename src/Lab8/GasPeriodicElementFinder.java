package Lab8;

public class GasPeriodicElementFinder extends PeriodicElementFinder {

	@Override
	public boolean isInstanceOf(Element.PeriodicElement e) {
		if (e instanceof GasPeriodicElement) 
			return true;
		return false;
	}

}
