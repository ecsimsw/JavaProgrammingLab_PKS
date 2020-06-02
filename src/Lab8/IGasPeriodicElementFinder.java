package Lab8;

public class IGasPeriodicElementFinder implements IPeriodicElementFinder {

	@Override
	public boolean isInstanceOf(Element.PeriodicElement pe) {
		if (pe instanceof GasPeriodicElement) 
			return true;
		return false;
	}

}
