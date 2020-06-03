package temp;

public class UnknownPeriodicElementFinder extends PeriodicElementFinder{
	@Override
	public boolean isInstanceOf(Element.PeriodicElement pe) {
		if (pe instanceof UnknownPeriodicElement) 
			return true;
		return false;
	}
}
