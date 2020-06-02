package backUpLab7;

import java.util.*;

public class PeriodicTableMap {
	private Map<Element, PeriodicElement> elements = null;

	// constructor
	public PeriodicTableMap() {
		this.elements = new HashMap<>();
	}
	
	public PeriodicTableMap(Map<Element, PeriodicElement> elements) {
		this.elements = elements;
	}

	// add
	public void add(Element e, PeriodicElement pe) {
		System.out.println("pmap add " + e + " : " + pe);
		this.elements.put(e, pe);
	}

	// remove
	public void remove(Element e) {
		this.elements.remove(e);
	}

	// set/replace
	public void set(Element e, PeriodicElement pe) {
		this.elements.replace(e, pe);
	}

	// get
	public PeriodicElement get(Element e) {
		return this.elements.get(e);
	}
    
	// get a random element from the map
    public PeriodicElement getRandomElement() { 
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
	
	// find by Element -> PeriodicElement
	public PeriodicElement find(Element e) {
		return get(e);
	}

	// find by Symbol -> PeriodicElement
	public PeriodicElement find(String symbol) {
		PeriodicElement result = null;
		for (PeriodicElement pe : this.elements.values()) {
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
		for (PeriodicElement pe : this.elements.values()) {
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
		for (PeriodicElement pe : elements.values()) {
			System.out.println(pe);
		}
	}

	// print keys & values
	public void print() {
		for (Map.Entry<Element, PeriodicElement> entry : elements.entrySet()) {
			System.out.println("" + entry.getKey() + " : " + entry.getValue());
		}
	}

	// sort
	public void sort() {
		
		// first, sort by Value
		List<Map.Entry<Element, PeriodicElement>> entries = new ArrayList<>(elements.entrySet());
		entries.sort(new Comparator<Map.Entry<Element, PeriodicElement>>() {
			@Override
			public int compare(Map.Entry<Element, PeriodicElement> e1, Map.Entry<Element, PeriodicElement> e2) {
				return e1.getValue().compareTo(e2.getValue());
			}
		});
		// then, sort by Map
		Map<Element, PeriodicElement> sortedMap = new LinkedHashMap<>();
	    for(Map.Entry<Element, PeriodicElement> entry : entries){
	        sortedMap.put(entry.getKey(), entry.getValue());
	    }	    
	    // then, update elements
	    elements = sortedMap;
	    /*
		// first, sort by Key using TreeMap
		TreeMap<Element, PeriodicElement> sortedMap = new TreeMap<>(elements);    
	    // then, update elements
	    elements = sortedMap;
	    */
	}

	@Override
	public String toString() {
		return "PeriodicTableMap [elements=" + elements + "]";
	}
}
