package dao;

import Lab8.*;

import java.util.function.Predicate;

public interface IPeriodicElementFinder {

    Element.PeriodicElement findElement(Predicate<Element.PeriodicElement> predicate);

    Element.PeriodicElement[] findElements(Predicate<Element.PeriodicElement> predicate);
}
