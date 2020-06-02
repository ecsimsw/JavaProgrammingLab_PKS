package dao;

import Lab8.*;

import java.util.function.Predicate;

public interface IPeriodicElementFinder {

    boolean isInstanceOf(Element.PeriodicElement pe);

    Element.PeriodicElement findElement(Predicate<Element.PeriodicElement> predicate);

    Element.PeriodicElement[] findElements(Predicate<Element.PeriodicElement> predicate);
}
