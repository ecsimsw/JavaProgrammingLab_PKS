package temp;

import dao.IPeriodicElementFinder;

import java.util.Arrays;
import java.util.function.Predicate;

public class PeriodicTable implements IPeriodicElementFinder {
	private Element.PeriodicElement[] elements = null;

	// constructor
	public PeriodicTable() {
		this(null);
	}
	
	public PeriodicTable(Element.PeriodicElement[] elements) {
		this.elements = elements;
	}

	// getter & setter
	public Element.PeriodicElement[] getElements() {
		return elements;
	}

	public void setElements(Element.PeriodicElement[] elements) {
		this.elements = elements;
	}

	// set
	public void set(int index, Element.PeriodicElement pe) {
		if (index >= 0 && index < this.elements.length)
			this.elements[index] = pe;
		else
			System.out.println("cannot put Lab8.Element.PeriodicElement");
	}

	// getElements (from index to index)
	public Element.PeriodicElement[] getElements(int min, int max) {
		//System.out.println("getElements from min=" + min + " max" + max);
		Element.PeriodicElement[] result = new Element.PeriodicElement[max-min];
		int count= 0;
		for (int i = min; i < max; i++) {
			result[count++] = this.elements[i];
		}
		return result;
	}

	// getCurrent(int index)
	public Element.PeriodicElement get(int index) {
		if (index >= 0 && index < this.elements.length)
			return this.elements[index];
		return null;
	}

	// getPrevious
	public Element.PeriodicElement getPrevious(int index) {
		index -= 1;
		if (index >= 0 && index < this.elements.length)
			return this.elements[index];
		return null;
	}

	// getNext
	public Element.PeriodicElement getNext(int index) {
		index += 1;
		if (index >= 0 && index < this.elements.length)
			return this.elements[index];
		return null;
	}

	@Override
	public String toString() {
		return "Lab8.PeriodicTable [elements=" + Arrays.toString(elements) + "]";
	}

	// print
	public void print() {
		for (Element.PeriodicElement pe : elements) {
			System.out.println(pe);
		}
	}

	// shuffle
	public void shuffle() {
		for (int i=0; i<elements.length; i++){
			int x = (int)(Math.random()*elements.length);
			int y = (int)(Math.random()*elements.length);
		            
			Element.PeriodicElement tmp = elements[x];
			elements[x] = elements[y];
			elements[y] = tmp;
		}
	}
	
	// get a random element from the array
    public Element.PeriodicElement getRandomElement() {
        return elements[(int)(Math.random()*elements.length)]; 
    } 

	// get random elements from the array
    public Element.PeriodicElement[] getRandomElements(int size) {
    	shuffle(); // shuffle
    	Element.PeriodicElement[] results = new Element.PeriodicElement[size];
    	for (int i = 0; i < results.length; i++) {
    		results[i] = elements[i]; 
    	}
        return results; 
    }

    // sort
    public void sort() {
    	Arrays.sort(elements); 
    }

    @Override
    public Element.PeriodicElement findElement(Predicate<Element.PeriodicElement> predicate) {
        return null;
    }

    @Override
    public Element.PeriodicElement[] findElements(Predicate<Element.PeriodicElement> predicate) {
        return new Element.PeriodicElement[0];
    }

    @Override
    public boolean isInstanceOf(Element.PeriodicElement pe) {
        return false;
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

	// use Lab8.PeriodicElementFinder
	public Element.PeriodicElement[] find(PeriodicElementFinder finder) {
		return finder.find(this.elements);
	}

	// use Lab8.IPeriodicElementFinder
	public Element.PeriodicElement[] find(IPeriodicElementFinder ifinder) {
		int count = 0;
		for (Element.PeriodicElement pe : this.elements) {
			if (pe != null && ifinder.isInstanceOf(pe)) {
				count++;
			}
		}
		Element.PeriodicElement[] result = new Element.PeriodicElement[count];
		count = 0;
		for (Element.PeriodicElement pe : this.elements) {
			if (pe != null && ifinder.isInstanceOf(pe)) {
				result[count++] = pe;
			}
		}
		return result;
	}

}
