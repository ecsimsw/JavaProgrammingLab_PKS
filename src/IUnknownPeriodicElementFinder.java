
public class IUnknownPeriodicElementFinder implements IPeriodicElementFinder {
	@Override
	public boolean isInstanceOf(PeriodicElement pe) {
		if (pe instanceof UnknownPeriodicElement) 
			return true;
		return false;
	}
}
