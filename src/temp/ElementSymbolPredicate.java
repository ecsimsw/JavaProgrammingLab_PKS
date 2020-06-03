package temp;

import java.util.function.Predicate;

public class ElementSymbolPredicate implements Predicate<Element.PeriodicElement> {
    @Override
    public boolean test(Element.PeriodicElement periodicElement) {
        return false;
    }
}
