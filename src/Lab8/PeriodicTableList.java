package Lab8;

import dao.IPeriodicElementFinder;

import java.util.ArrayList;
import java.util.List;

public class PeriodicTableList {
	private List<Element.PeriodicElement> elements = null;

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
	
	// set/replace
	public void set(int index, Element.PeriodicElement pe) {
		this.elements.set(index, pe);
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

	// find by Lab8.Element -> Lab8.Element.PeriodicElement
	public Element.PeriodicElement find(Element e) {
		for(Element.PeriodicElement pe : this.elements) {
			if(e != null && pe != null && pe.getNumber() == e.getValue())
				return pe;
		}
		return null;
	}

	// find by Symbol -> Lab8.Element.PeriodicElement
	public Element.PeriodicElement find(String symbol) {
		Element.PeriodicElement result = null;
		for (Element.PeriodicElement pe : this.elements) {
			if (symbol != null && pe != null && pe.getSymbol().equals(symbol)) {
				result = pe;
				break;
			}
		}
		return result;
	}
	
	// use Lab8.IPeriodicElementFinder
	public List<Element.PeriodicElement> find(IPeriodicElementFinder ifinder) {
		List<Element.PeriodicElement> result = new ArrayList<Element.PeriodicElement>();
		for (Element.PeriodicElement pe : elements) {
			if (pe != null && ifinder.isInstanceOf(pe)) {
				result.add(pe);
			}
		}
		return result;
		//return result.toArray(new Lab8.Element.PeriodicElement[result.size()]);
	}

	// print
	public void print() {
		for (Element.PeriodicElement pe : elements) {
			System.out.println(pe);
		}
	}

	// sort
	public void sort() {
		elements.sort(null);
	}
	
	@Override
	public String toString() {
		return "Lab8.PeriodicTableList [elements=" + elements + "]";
	}
}
