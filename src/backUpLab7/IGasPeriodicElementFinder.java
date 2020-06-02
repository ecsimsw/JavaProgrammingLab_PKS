package backUpLab7;

public class IGasPeriodicElementFinder implements IPeriodicElementFinder {

	@Override
	public boolean isInstanceOf(PeriodicElement pe) {
		if (pe instanceof GasPeriodicElement) 
			return true;
		return false;
	}

}
