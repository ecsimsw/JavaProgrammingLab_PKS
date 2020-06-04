package dao;

import controller.Element;
import dao.IPeriodicElementFinder;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PeriodicTableList implements IPeriodicElementFinder{
	private List<Element.PeriodicElement> elements = null;

    public List<Element.PeriodicElement> getElements() {
        return elements;
    }

    // constructor
	public PeriodicTableList() {
		this.elements = new ArrayList<>();
	}
	
	public PeriodicTableList(List<Element.PeriodicElement> elements) {
		this.elements = elements;
	}

	// add
	public void add(Element.PeriodicElement pe) {
		this.elements.add(pe);
	}

	// remove
	public void remove(Element.PeriodicElement pe) {
		this.elements.remove(pe);
	}

	// indexOf
	public int indexOf(Element.PeriodicElement pe) {
		return this.elements.indexOf(pe);
	}
	
	// size
	public int size() {
		return this.elements.size();
	}

	// getCurrent(int index)
	public Element.PeriodicElement get(int index) {
		return this.elements.get(index);
	}

	// getPrevious
	public Element.PeriodicElement getPrevious(int index) {
		index -= 1;
		return get(index);
	}

	// getNext
	public Element.PeriodicElement getNext(int index) {
		index += 1;
		return get(index);
	}

	// get a random element from the list
    public Element.PeriodicElement getRandomElement() {
        return get((int)(Math.random()*size())); 
    }

	// print
	public void print() {
		for (Element.PeriodicElement pe : elements) {
			System.out.println(pe);
		}
	}

	// sort

	public void sort(){
		Collections.sort(elements);
	}

	public void sort(Comparator<Element.PeriodicElement> comparator) {
		Collections.sort(elements, comparator);
	}

	@Override
	public String toString() {
		return "Lab8.PeriodicTableList [elements=" + elements + "]";
	}

	@Override
	public Element.PeriodicElement findElement(Predicate<Element.PeriodicElement> predicate) {

		var resultList = elements.stream()
				.filter( predicate )
				.collect(Collectors.toList());


		Element.PeriodicElement result = resultList.size()>0 ? resultList.get(0) : null;

		return result;
	}

	@Override
	public Element.PeriodicElement[] findElements(Predicate<Element.PeriodicElement> predicate) {

		var resultList = elements.stream()
				.filter( predicate )
				.collect(Collectors.toList());

		Element.PeriodicElement[] resultArray =  resultList!=null ? resultList.toArray(new Element.PeriodicElement[0]) : null;

		return resultArray;
	}
}
