package controller;

import dao.*;
import temp.Element;
import temp.PeriodicTable;
import temp.Predicator;


import java.util.ArrayList;
import java.util.List;

// Lab8.Lab7 (collection/interface)
//https://www.ptable.com/?lang=ko

public class Lab8 {

/*
	
	public static void printCurrentPrevNext(PeriodicTableList plist) {
		plist.print();
		char key = '\r'; // if Lab8.Element=null, try this do-while loop again
		System.out.print("Please enter [index] between 0 and " + (plist.size()-1));
		int index = UserInput.getIntegerBetween(0, plist.size() - 1);
		Lab8.Element.PeriodicElement pe = plist.get(index);
		if(pe != null) pe.print();
		do {
			key = UserInput.getKey();
			if(key == 'p') { // p-key
				if(index > 0) {
					Lab8.Element.PeriodicElement prev = plist.getPrevious(index);
					if(prev != null) prev.print();
					index--; // decrease
				} else {
					System.out.println("Cannot decrease index < 0");					
				}
			} else if(key == 'n') { // n-key
				if(index < plist.size() - 1) {
					Lab8.Element.PeriodicElement next = plist.getNext(index);
					if(next != null) next.print();
					index++; // increase
				} else {
					System.out.println("Cannot increase index > " + plist.size());
				}
			}
		} while(key != 'q');
	}
	*/
	public static void main(String[] args) {
		//Lab7
		/*
		String[] names = Element.names();
		for (String n: names) System.out.println(n);
		
		// class
		System.out.println("\nptable");
		PeriodicTable ptable = new PeriodicTable(elements);
		ptable.print();
		System.out.println("\nshuffle");
		ptable.shuffle();
		ptable.print();
		System.out.println("\nptable sort");
		ptable.sort();
		ptable.print();
		System.out.println("\nshuffle");
		ptable.shuffle();
		ptable.print();
		
		// get 10 from ptable
		Element.PeriodicElement[] result = ptable.getElements(0, 10);
		// convert array to arraylist
		//List<Lab8.Element.PeriodicElement> list = new ArrayList<>(Arrays.asList(elements));
		System.out.println("\nplist");
		PeriodicTableList plist = new PeriodicTableList();
		for (Element.PeriodicElement pe : result) {
			plist.add(pe);
		}
		plist.print();
		System.out.println("\nrandom pick from plist");
		plist.getRandomElement().print();
		System.out.println("\nplist sort");
		plist.sort();
		plist.print();

		
		System.out.println("\nget another 5 from ptable");		
		// get 5 from ptable
		Element.PeriodicElement[] result2 = ptable.getElements(10, 15);
		for (Element.PeriodicElement pe : result2) {
			System.out.println(pe);
		}
		System.out.println("\nget another 5 from ptable");		
		
		System.out.println("\npmap");
		PeriodicTableMap pmap = new PeriodicTableMap();
		for (Element.PeriodicElement pe : result2) {
			pmap.add(pe.getElement(), pe);
		}
		pmap.print();
		pmap.printKeys();
		pmap.printValues();
		System.out.println("\nrandom pick from pmap");
		pmap.getRandomElement().print();
		System.out.println("\n~~~~~~~~~~~~~~~~~~~pmap sort");
		pmap.sort();
		pmap.print();
		
		// finders

		// plist printCurrentPrevNext
		printCurrentPrevNext(plist);

		// pmap add/remove/
		Element.PeriodicElement element = ptable.getRandomElement();
		element.print();
		pmap.add(element.getElement(), element);
		pmap.print();
		element = ptable.getRandomElement();
		element.print();
		pmap.add(element.getElement(), element);
		pmap.print();

		// finders
		for (IPeriodicElementFinder finder : finders) {
			System.out.println("Using " + finder.getClass().getName());
			List<Element.PeriodicElement> foundElements = pmap.find(finder);
			for (Element.PeriodicElement pe : foundElements) {
				System.out.println(pe);			
			}
			System.out.println("\n\n");			
		}
		 */


		// csv load check
		List<Element.PeriodicElement> loadedElements = PeriodElementImporter.loadCSV("C:\\Users\\luraw\\OneDrive\\Desktop\\ptable.csv");

		for(temp.Element.PeriodicElement e : loadedElements){
		//	System.out.println(e.toString());
		}

		// findElements check
		Element.PeriodicElement[] loadedArray = loadedElements.toArray(new Element.PeriodicElement[loadedElements.size()]);

		PeriodicTable ptable = new PeriodicTable(loadedArray);

		var foundArray_gas =ptable.findElements(Predicator.isGAS());

		for(Element.PeriodicElement e : foundArray_gas){
		 //	System.out.println(e.toString());
		}

		var foundArray_period = ptable.findElements(Predicator.isPeriod(2));

		for(Element.PeriodicElement e : foundArray_period){
			System.out.println(e.toString());
		}

	}
}
