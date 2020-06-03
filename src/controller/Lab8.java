package controller;

import dao.*;
import temp.Element;
import temp.PeriodicTable;
import temp.Predicator;


import java.util.List;

// Lab8.Lab7 (collection/interface)
//https://www.ptable.com/?lang=ko

public class Lab8 {

	// 50 Lab8.Element.PeriodicElement
	/*
	private static Element.PeriodicElement[] elements = {
			new GasPeriodicElement(1, "H", "HYDROGEN", 1.008),
			new GasPeriodicElement(2, "He", "HELIUM", 4.0026),
			new SolidPeriodicElement(3, "Li", "LITHIUM", 6.94),
			new SolidPeriodicElement(4, "Be", "BERYLLIUM", 9.0122),
			new SolidPeriodicElement(5, "B", "BORON", 10.81),
			new SolidPeriodicElement(6, "C", "CARBON", 12.011),
			new GasPeriodicElement(7, "N", "NITROGEN", 14.007),
			new GasPeriodicElement(8, "O", "OXYGEN", 15.999),
			new GasPeriodicElement(9, "F", "FLUORINE", 18.998),
			new GasPeriodicElement(10, "Ne", "NEON", 20.18),
			new SolidPeriodicElement(11, "Na", "SODIUM", 22.99),
			new SolidPeriodicElement(12, "Mg", "MAGNESIUM", 24.305),
			new SolidPeriodicElement(13, "Al", "ALUMINIUM", 26.982),
			new SolidPeriodicElement(14, "Si", "SILICON", 28.085),
			new SolidPeriodicElement(15, "P", "PHOSPHORUS", 30.974),
			new SolidPeriodicElement(16, "S", "SULFUR", 32.06),
			new GasPeriodicElement(17, "Cl", "CHLORINE", 35.45),
			new GasPeriodicElement(18, "Ar", "ARGON", 39.948),
			new SolidPeriodicElement(19, "K", "POTASSIUM", 39.098),
			new SolidPeriodicElement(20, "Ca", "CALCIUM", 40.078),
			new SolidPeriodicElement(21, "Sc", "SCANDIUM", 44.956),
			new SolidPeriodicElement(22, "Ti", "TITANIUM", 47.867),
			new SolidPeriodicElement(23, "V", "VANADIUM", 50.942),
			new SolidPeriodicElement(24, "Cr", "CHROMIUM", 51.996),
			new SolidPeriodicElement(25, "Mn", "MANGANESE", 54.938),
			new SolidPeriodicElement(26, "Fe", "FERRUM", 55.845),
			new SolidPeriodicElement(27, "Co", "COBALT", 58.933),
			new SolidPeriodicElement(28, "Ni", "NICKEL", 58.693),
			new SolidPeriodicElement(29, "Cu", "CUPRUM", 63.546),
			new SolidPeriodicElement(30, "Zn", "ZINC", 65.38),
			new SolidPeriodicElement(31, "Ga", "GALLIUM", 69.723),
			new SolidPeriodicElement(32, "Ge", "GERMANIUM", 72.63),
			new SolidPeriodicElement(33, "As", "ARSENIC", 74.922),
			new SolidPeriodicElement(34, "Se", "SELENIUM", 78.971),
			new LiquidPeriodicElement(35, "Br", "BROMINE", 79.904),
			new GasPeriodicElement(36, "Kr", "KRYPTON", 83.798),
			new SolidPeriodicElement(37, "Rb", "RUBIDIUM", 85.468),
			new SolidPeriodicElement(38, "Sr", "STRONTIUM", 87.62),
			new SolidPeriodicElement(39, "Y", "YTTRIUM", 88.906),
			new SolidPeriodicElement(40, "Zr", "ZIRCONIUM", 91.224),
			new SolidPeriodicElement(41, "Nb", "NIOBIUM", 92.906),
			new SolidPeriodicElement(42, "Mo", "MOLYBDENUM", 95.95),
			new UnknownPeriodicElement(43, "Tc", "TECHNETIUM", 98),
			new SolidPeriodicElement(44, "Ru", "RUTHENIUM", 101.07),
			new SolidPeriodicElement(45, "Rh", "RHODIUM", 102.91),
			new SolidPeriodicElement(46, "Pd", "PALLADIUM", 106.42),
			new SolidPeriodicElement(47, "Ag", "SILVER", 107.87),
			new SolidPeriodicElement(48, "Cd", "CADMIUM", 112.41),
			new SolidPeriodicElement(49, "In", "INDIUM", 114.82),
			new SolidPeriodicElement(50, "Sn", "TIN", 118.71)
	};
	*/
/*
	// 4 finders
	private static IPeriodicElementFinder[] finders = { 
			new ISolidPeriodicElementFinder(),
			new IGasPeriodicElementFinder(),
			new ILiquidPeriodicElementFinder(),
			new IUnknownPeriodicElementFinder()
	};
	
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
		for (IPeriodicElementFinder finder : finders) {
			System.out.println("Using " + finder.getClass().getName());
			// 어떤 finder를 사용하는지 출력

			List<Element.PeriodicElement> foundElements = plist.find(finder);
			for (Element.PeriodicElement pe : foundElements) {
				System.out.println(pe);			
			}
			System.out.println("\n\n");			
		}

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

		var loadedElements = PeriodElementImporter.loadCSV("C:\\Users\\luraw\\OneDrive\\Desktop\\ptable.csv");

		for(temp.Element.PeriodicElement e : loadedElements){
			System.out.println(e.toString());
		}

		PeriodicTable ptable = new PeriodicTable((Element.PeriodicElement[]) loadedElements.toArray());

		ptable.findElement(Predicator.isGAS());
	}
}
