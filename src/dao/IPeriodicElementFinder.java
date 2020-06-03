package dao;

import temp.*;

import java.util.function.*;

public interface IPeriodicElementFinder {
    Element.PeriodicElement findElement(Predicate<Element.PeriodicElement> predicate);

    Element.PeriodicElement[] findElements(Predicate<Element.PeriodicElement> predicate);
}
