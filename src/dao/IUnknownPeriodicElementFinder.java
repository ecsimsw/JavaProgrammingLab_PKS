package dao;

import Lab8.Element;
import Lab8.UnknownPeriodicElement;

import java.util.function.Predicate;

public class IUnknownPeriodicElementFinder implements IPeriodicElementFinder {
	@Override
	public boolean isInstanceOf(Element.PeriodicElement pe) {
		if (pe instanceof UnknownPeriodicElement)
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
