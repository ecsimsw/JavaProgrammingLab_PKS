package controller;

import java.util.function.Predicate;

import controller.Element;
import dto.*;

public class Predicator{

    public static Predicate<Element.PeriodicElement> isNumber(int number) {
        return (p) -> p.getNumber() == number;
    }

    public static Predicate<Element.PeriodicElement> isSymbol(String symbol) { return (p) -> p.getSymbol().equals(symbol); }

    public static Predicate<Element.PeriodicElement> isName(String name) {
        return (p) -> p.getName().equals(name);
    }

    public static Predicate<Element.PeriodicElement> isWeight(double weight) {
        return (p) -> p.getWeight()== weight;
    }

    public static Predicate<Element.PeriodicElement> isPeriod(int period) {
        return (p) -> p.getPeriod() == period;
    }

    public static Predicate<Element.PeriodicElement> isType(Type type) {
        return (p) -> p.getType() == type;
    }

    public static Predicate<Element.PeriodicElement> isGroup(int group) {
        return p -> p.getGroup() == group;
    }

    public static Predicate<Element.PeriodicElement> isState(State state) {
        return p -> p.getState() == state;
    }
}
