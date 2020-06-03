package temp;

import dao.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class PeriodicTableMap {
	private Map<Element, Element.PeriodicElement> elements = null;

	// constructor
	public PeriodicTableMap() {
		this.elements = new HashMap<>();
	}
	
	public PeriodicTableMap(Map<Element, Element.PeriodicElement> elements) {
		this.elements = elements;
	}

	// add
	public void add(Element e, Element.PeriodicElement pe) {
		System.out.println("pmap add " + e + " : " + pe);
		this.elements.put(e, pe);
	}

	// remove
	public void remove(Element e) {
		this.elements.remove(e);
	}

	// set/replace
	public void set(Element e, Element.PeriodicElement pe) {
		this.elements.replace(e, pe);
	}

	// get
	public Element.PeriodicElement get(Element e) {
		return this.elements.get(e);
	}
    
	// get a random element from the map
    public Element.PeriodicElement getRandomElement() {
        int index = new Random().nextInt(elements.keySet().size());
        Iterator<Element> iter = elements.keySet().iterator();
        for (int i = 0; i < index; i++) {
            iter.next();
        }
        return get(iter.next());
    } 

	// size
	public int size() {
		return this.elements.size();
	}
	
	// find by Lab8.Element -> Lab8.Element.PeriodicElement
	public Element.PeriodicElement find(Element e) {
		return get(e);
	}

	// find by Symbol -> Lab8.Element.PeriodicElement
	public Element.PeriodicElement find(String symbol) {
		Element.PeriodicElement result = null;
		for (Element.PeriodicElement pe : this.elements.values()) {
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
		for (Element.PeriodicElement pe : this.elements.values()) {
			if (pe != null && ifinder.isInstanceOf(pe)) {
				result.add(pe);
			}
		}
		return result;
	}

	// print keys
	public void printKeys() {
		for (Element e : elements.keySet()) {
			System.out.println(e);
		}
	}

	// print values
	public void printValues() {
		for (Element.PeriodicElement pe : elements.values()) {
			System.out.println(pe);
		}
	}

	// print keys & values
	public void print() {
		for (Map.Entry<Element, Element.PeriodicElement> entry : elements.entrySet()) {
			System.out.println("" + entry.getKey() + " : " + entry.getValue());
		}
	}

	// sort
	public void sort() {
		
		// first, sort by Value
		List<Map.Entry<Element, Element.PeriodicElement>> entries = new ArrayList<>(elements.entrySet());
		entries.sort(new Comparator<Map.Entry<Element, Element.PeriodicElement>>() {
			@Override
			public int compare(Map.Entry<Element, Element.PeriodicElement> e1, Map.Entry<Element, Element.PeriodicElement> e2) {
				return e1.getValue().compareTo(e2.getValue());
			}
		});
		// then, sort by Map
		Map<Element, Element.PeriodicElement> sortedMap = new LinkedHashMap<>();
	    for(Map.Entry<Element, Element.PeriodicElement> entry : entries){
	        sortedMap.put(entry.getKey(), entry.getValue());
	    }	    
	    // then, update elements
	    elements = sortedMap;
	    /*
		// first, sort by Key using TreeMap
		TreeMap<Lab8.Element, Lab8.Element.PeriodicElement> sortedMap = new TreeMap<>(elements);
	    // then, update elements
	    elements = sortedMap;
	    */
	}

	@Override
	public String toString() {
		return "Lab8.PeriodicTableMap [elements=" + elements + "]";
	}
}
