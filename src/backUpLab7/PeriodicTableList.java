package backUpLab7;

import java.util.ArrayList;
import java.util.List;

public class PeriodicTableList {
	private List<PeriodicElement> elements = null;

	// constructor
	public PeriodicTableList() {
		this.elements = new ArrayList<>();
	}
	
	public PeriodicTableList(List<PeriodicElement> elements) {
		this.elements = elements;
	}

	// add
	public void add(PeriodicElement pe) {
		this.elements.add(pe);
	}

	// remove
	public void remove(PeriodicElement pe) {
		this.elements.remove(pe);
	}

	// indexOf
	public int indexOf(PeriodicElement pe) {
		return this.elements.indexOf(pe);
	}
	
	// size
	public int size() {
		return this.elements.size();
	}
	
	// set/replace
	public void set(int index, PeriodicElement pe) {
		this.elements.set(index, pe);
	}

	// getCurrent(int index)
	public PeriodicElement get(int index) {
		return this.elements.get(index);
	}

	// getPrevious
	public PeriodicElement getPrevious(int index) {
		index -= 1;
		return get(index);
	}

	// getNext
	public PeriodicElement getNext(int index) {
		index += 1;
		return get(index);
	}

	// get a random element from the list
    public PeriodicElement getRandomElement() { 
        return get((int)(Math.random()*size())); 
    } 

	// find by Element -> PeriodicElement
	public PeriodicElement find(Element e) {
		for(PeriodicElement pe : this.elements) {
			if(e != null && pe != null && pe.getNumber() == e.getValue())
				return pe;
		}
		return null;
	}

	// find by Symbol -> PeriodicElement
	public PeriodicElement find(String symbol) {
		PeriodicElement result = null;
		for (PeriodicElement pe : this.elements) {
			if (symbol != null && pe != null && pe.getSymbol().equals(symbol)) {
				result = pe;
				break;
			}
		}
		return result;
	}
	
	// use IPeriodicElementFinder
	public List<PeriodicElement> find(IPeriodicElementFinder ifinder) {
		List<PeriodicElement> result = new ArrayList<PeriodicElement>();
		for (PeriodicElement pe : elements) {
			if (pe != null && ifinder.isInstanceOf(pe)) {
				result.add(pe);
			}
		}
		return result;
		//return result.toArray(new PeriodicElement[result.size()]);
	}

	// print
	public void print() {
		for (PeriodicElement pe : elements) {
			System.out.println(pe);
		}
	}

	// sort
	public void sort() {
		elements.sort(null);
	}
	
	@Override
	public String toString() {
		return "PeriodicTableList [elements=" + elements + "]";
	}
}
