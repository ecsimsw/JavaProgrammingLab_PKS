package dao;

import temp.Element;
import temp.SolidPeriodicElement;

import java.util.function.Predicate;

public class ISolidPeriodicElementFinder implements IPeriodicElementFinder {

	@Override
	public boolean isInstanceOf(Element.PeriodicElement pe) {
		if (pe instanceof SolidPeriodicElement)
			return true;
		return false;
	}

	@Override
	public Element.PeriodicElement findElement(Predicate<Element.PeriodicElement> predicate) {
		return null;
	}

	@Override
	public Element.PeriodicElement[] findElements(Predicate<Element.PeriodicElement> predicate) {
		return new Element.PeriodicElement[0];
	}

}

