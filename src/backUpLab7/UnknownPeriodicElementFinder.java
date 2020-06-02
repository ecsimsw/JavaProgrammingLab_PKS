package backUpLab7;

public class UnknownPeriodicElementFinder extends PeriodicElementFinder {
	@Override
	public boolean isInstanceOf(PeriodicElement pe) {
		if (pe instanceof UnknownPeriodicElement) 
			return true;
		return false;
	}
}
