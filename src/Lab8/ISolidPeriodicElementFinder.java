package Lab8;

public class ISolidPeriodicElementFinder implements IPeriodicElementFinder {

	@Override
	public boolean isInstanceOf(Element.PeriodicElement pe) {
		if (pe instanceof SolidPeriodicElement) 
			return true;
		return false;
	}

}
