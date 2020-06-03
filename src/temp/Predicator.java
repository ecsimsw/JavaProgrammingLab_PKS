package temp;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import dto.*;

public class Predicator{


    // type은 수가 적어서 isType을 분리해둠 이전 find 방식으로
    public static Predicate<Element.PeriodicElement> isGAS() {
        return p -> p.getState() == State.GAS;
    }

    public static Predicate<Element.PeriodicElement> isLIQUID() {
        return p -> p.getState() == State.LIQUID;
    }

    public static Predicate<Element.PeriodicElement> iSOLID() {
        return p -> p.getState() == State.SOLID;
    }

    public static Predicate<Element.PeriodicElement> isUNKOWN() {
        return p -> p.getState() == State.UNKNOWN;
    }


    public static List<Element.PeriodicElement> filtePeriodicElement (List<Element.PeriodicElement> elements,
                                                                 Predicate<Element.PeriodicElement> predicate)
    {
        return elements.stream()
                .filter( predicate )
                .collect(Collectors.toList());
    }

}
