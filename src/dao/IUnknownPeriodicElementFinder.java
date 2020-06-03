package dao;

import temp.Element;
import temp.UnknownPeriodicElement;

import java.util.function.Predicate;

public class IUnknownPeriodicElementFinder implements IPeriodicElementFinder {
	@Override
	public Element.PeriodicElement findElement(Predicate<Element.PeriodicElement> predicate) {
		return null;
	}

	@Override
	public Element.PeriodicElement[] findElements(Predicate<Element.PeriodicElement> predicate) {
		return new Element.PeriodicElement[0];
	}

	@Override
	public boolean isInstanceOf(Element.PeriodicElement pe) {
		if (pe instanceof UnknownPeriodicElement)
			return true;
		return false;
	}
}
