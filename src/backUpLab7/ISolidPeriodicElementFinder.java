package backUpLab7;

public class ISolidPeriodicElementFinder implements IPeriodicElementFinder {

	@Override
	public boolean isInstanceOf(PeriodicElement pe) {
		if (pe instanceof SolidPeriodicElement) 
			return true;
		return false;
	}

}

