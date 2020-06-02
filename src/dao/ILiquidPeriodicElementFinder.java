package dao;

import Lab8.Element;
import Lab8.LiquidPeriodicElement;

import java.util.function.Predicate;

public class ILiquidPeriodicElementFinder implements IPeriodicElementFinder {

	@Override
	public boolean isInstanceOf(Element.PeriodicElement e) {
		if (e instanceof LiquidPeriodicElement)
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
