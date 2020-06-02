package backUpLab7;

import java.util.Arrays;

public class PeriodicTable {
	private PeriodicElement[] elements = null;

	// constructor
	public PeriodicTable() {
		this(null);
	}
	
	public PeriodicTable(PeriodicElement[] elements) {
		this.elements = elements;
	}

	// getter & setter
	public PeriodicElement[] getElements() {
		return elements;
	}

	public void setElements(PeriodicElement[] elements) {
		this.elements = elements;
	}

	// set
	public void set(int index, PeriodicElement pe) {
		if (index >= 0 && index < this.elements.length)
			this.elements[index] = pe;
		else
			System.out.println("cannot put PeriodicElement");
	}

	// getElements (from index to index)
	public PeriodicElement[] getElements(int min, int max) {
		//System.out.println("getElements from min=" + min + " max" + max);
		PeriodicElement[] result = new PeriodicElement[max-min];
		int count= 0;
		for (int i = min; i < max; i++) {
			result[count++] = this.elements[i];
		}
		return result;
	}

	// getCurrent(int index)
	public PeriodicElement get(int index) {
		if (index >= 0 && index < this.elements.length)
			return this.elements[index];
		return null;
	}

	// getPrevious
	public PeriodicElement getPrevious(int index) {
		index -= 1;
		if (index >= 0 && index < this.elements.length)
			return this.elements[index];
		return null;
	}

	// getNext
	public PeriodicElement getNext(int index) {
		index += 1;
		if (index >= 0 && index < this.elements.length)
			return this.elements[index];
		return null;
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
	
	// use PeriodicElementFinder
	public PeriodicElement[] find(PeriodicElementFinder finder) {
		return finder.find(this.elements);
	}

	// use IPeriodicElementFinder
	public PeriodicElement[] find(IPeriodicElementFinder ifinder) {
		int count = 0;
		for (PeriodicElement pe : this.elements) {
			if (pe != null && ifinder.isInstanceOf(pe)) {
				count++;				
			}
		}
		PeriodicElement[] result = new PeriodicElement[count];
		count = 0;
		for (PeriodicElement pe : this.elements) {
			if (pe != null && ifinder.isInstanceOf(pe)) {
				result[count++] = pe;
			}
		}
		return result;
	}

	@Override
	public String toString() {
		return "PeriodicTable [elements=" + Arrays.toString(elements) + "]";
	}

	// print
	public void print() {
		for (PeriodicElement pe : elements) {
			System.out.println(pe);
		}
	}

	// shuffle
	public void shuffle() {
		for (int i=0; i<elements.length; i++){
			int x = (int)(Math.random()*elements.length);
			int y = (int)(Math.random()*elements.length);
		            
			PeriodicElement tmp = elements[x];
			elements[x] = elements[y];
			elements[y] = tmp;
		}
	}
	
	// get a random element from the array
    public PeriodicElement getRandomElement() { 
        return elements[(int)(Math.random()*elements.length)]; 
    } 

	// get random elements from the array
    public PeriodicElement[] getRandomElements(int size) { 
    	shuffle(); // shuffle
    	PeriodicElement[] results = new PeriodicElement[size];
    	for (int i = 0; i < results.length; i++) {
    		results[i] = elements[i]; 
    	}
        return results; 
    }

    // sort
    public void sort() {
    	Arrays.sort(elements); 
    }
}
