package dao;

import controller.Element;
import dao.IPeriodicElementFinder;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PeriodicTable implements IPeriodicElementFinder {
	private Element.PeriodicElement[] elements = null;

	public PeriodicTable(Element.PeriodicElement[] elements) {
		this.elements = elements;
	}

	// getter
	public Element.PeriodicElement[] getElements() {
		return elements;
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
	public void sort(){
		Arrays.sort(elements);
	}

	public void sort(Comparator<Element.PeriodicElement> comparator) {
		Arrays.sort(elements, comparator);
	}

    // predicate example : https://howtodoinjava.com/java8/how-to-use-predicate-in-java-8/

	@Override
    public Element.PeriodicElement findElement(Predicate<Element.PeriodicElement> predicate) {

        var resultList = Arrays.asList(elements).stream()
                .filter( predicate )
                .collect(Collectors.toList());

        Element.PeriodicElement result = resultList.size()>0 ? resultList.get(0) : null;

        return result;
	}

    @Override
    public Element.PeriodicElement[] findElements(Predicate<Element.PeriodicElement> predicate) {

		var resultList = Arrays.asList(elements).stream()
				.filter( predicate )
				.collect(Collectors.toList());

		Element.PeriodicElement[] resultArr = resultList !=null ? resultList.toArray(new Element.PeriodicElement[0]) : null;

		return resultArr;
	}
}
