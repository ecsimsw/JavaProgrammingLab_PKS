package Lab8;

public class IUnknownPeriodicElementFinder implements IPeriodicElementFinder {
	@Override
	public boolean isInstanceOf(Element.PeriodicElement pe) {
		if (pe instanceof UnknownPeriodicElement) 
			return true;
		return false;
	}
}
