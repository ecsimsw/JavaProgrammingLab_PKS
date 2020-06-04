package controller;

import dao.*;

import java.util.*;

public class Lab8 {
	static String pathLoadCSV = "ptableLoad.csv";
	static String pathSaveCSV = "ptableSave.csv";

	public static void main(String[] args) {

		/// 1. Load table from CSV

		List<Element.PeriodicElement> elements = PeriodElementImporter.loadCSV(pathLoadCSV);
		Element.PeriodicElement[] elementsArray = elements.toArray(new Element.PeriodicElement[elements.size()]);

		System.out.println("\nptable");
		PeriodicTable ptable = new PeriodicTable(elementsArray);

		ptable.print();

		// 2. Shuffle table and Pick some

		System.out.println("\nshuffle");
		ptable.shuffle();
		ptable.print();
		System.out.println("\nptable sort");
		ptable.sort();
		ptable.print();
		System.out.println("\nshuffle");
		ptable.shuffle();
		ptable.print();


		/// 3. Using List

		System.out.println("\nget 20 -> plist");
		PeriodicTableList plist = new PeriodicTableList(Arrays.asList(ptable.getElements(0, 20)));
		plist.print();

		/// 3-1 Sorting List of Elements

		System.out.println("\nplist sort by Name");
		plist.sort(Element.PeriodicElement.NameComparator());
		plist.print();

		System.out.println("\nplist sort by Weight");
		plist.sort(Element.PeriodicElement.WeightComparator());
		plist.print();

		System.out.println("\nplist sort by Symbol");
		plist.sort(Element.PeriodicElement.SymbolComparator());
		plist.print();

		System.out.println("\nplist sort by Number");
		plist.sort(Element.PeriodicElement.NumberComparator());
		plist.print();


		/// 3-2 Finding Elements in List.

		System.out.println("\nget 118 -> plist");
		plist = new PeriodicTableList(Arrays.asList(ptable.getElements(0, 118)));

		System.out.println("\nfind elements in list with predicator");

		var resultElement = plist.findElement(Predicator.isNumber(5));   // by Number
		System.out.println("\nElement which number is 5");
		if(resultElement != null) System.out.println(resultElement.toString());

		resultElement = plist.findElement(Predicator.isSymbol("Mg"));   // by Symbol
		System.out.println("\nElement which symbol is mg");
		if(resultElement != null) System.out.println(resultElement.toString());

		resultElement = plist.findElement(Predicator.isName("Helium"));   // by Name
		System.out.println("\nElement which Name is Helium");
		if(resultElement != null) System.out.println(resultElement.toString());

		var ResultElements = plist.findElements(Predicator.isWeight(20.18));   // by Weight
		System.out.println("\nElements which weight is 20.18");
		if(resultElement != null) for(var r : ResultElements) System.out.println(r.toString());

		ResultElements = plist.findElements(Predicator.isPeriod(3));       // by period
		System.out.println("\nElements which period is 3");
		if(resultElement != null) for(var r : ResultElements) System.out.println(r.toString());

		ResultElements = plist.findElements(Predicator.isGroup(2));          // by Group
		System.out.println("\nElements which group is 2");
		if(resultElement != null) for(var r : ResultElements) System.out.println(r.toString());

		ResultElements = plist.findElements(Predicator.isType(Type.ALKALI_METAL));   // by type
		System.out.println("\nElements which type is ALKALI_METAL");
		if(resultElement != null) for(var r : ResultElements) System.out.println(r.toString());

		ResultElements = plist.findElements(Predicator.isState(State.GAS));   // by state
		System.out.println("\nElements which state is Gas");
		if(resultElement != null) for(var r : ResultElements) System.out.println(r.toString());

		/// 4. Using Array

		System.out.println("\nget 20 -> parray");
		PeriodicTable parray = new PeriodicTable(ptable.getElements(10, 35));
		parray.print();

		/// 4-1 Sorting Array of Elements

		System.out.println("\nplist sort by Name");
		parray.sort(Element.PeriodicElement.NameComparator());
		parray.print();

		System.out.println("\nplist sort by Weight");
		parray.sort(Element.PeriodicElement.WeightComparator());
		parray.print();

		System.out.println("\nplist sort by Symbol");
		parray.sort(Element.PeriodicElement.SymbolComparator());
		parray.print();

		System.out.println("\nplist sort by Number");
		parray.sort(Element.PeriodicElement.NumberComparator());
		parray.print();

		/// 4-2 Finding Elements in Array.

		System.out.println("\nget 118 -> parray");
		parray = new PeriodicTable((ptable.getElements(0, 118)));

		System.out.println("\nfind elements in array with predicator");

		resultElement = parray.findElement(Predicator.isNumber(5));   // by Number
		System.out.println("\nElement which number is 5");
		if(resultElement != null) System.out.println(resultElement.toString());

		resultElement = parray.findElement(Predicator.isSymbol("Mg"));   // by Symbol
		System.out.println("\nElement which symbol is mg");
		if(resultElement != null) System.out.println(resultElement.toString());

		resultElement = parray.findElement(Predicator.isName("Helium"));   // by Name
		System.out.println("\nElement which Name is Helium");
		if(resultElement != null) System.out.println(resultElement.toString());

		ResultElements = parray.findElements(Predicator.isWeight(20.18));   // by Weight
		System.out.println("\nElements which weight is 20.18");
		if(resultElement != null) for(var r : ResultElements) System.out.println(r.toString());

		ResultElements = parray.findElements(Predicator.isPeriod(3));       // by period
		System.out.println("\nElements which period is 3");
		if(resultElement != null) for(var r : ResultElements) System.out.println(r.toString());

		ResultElements = parray.findElements(Predicator.isGroup(2));          // by Group
		System.out.println("\nElements which group is 2");
		if(resultElement != null) for(var r : ResultElements) System.out.println(r.toString());

		ResultElements = parray.findElements(Predicator.isType(Type.ALKALI_METAL));   // by type
		System.out.println("\nElements which type is ALKALI_METAL");
		if(resultElement != null) for(var r : ResultElements) System.out.println(r.toString());

		ResultElements = parray.findElements(Predicator.isState(State.GAS));   // by state
		System.out.println("\nElements which state is Gas");
		if(resultElement != null) for(var r : ResultElements) System.out.println(r.toString());


		// 5. Save table in csv file

		PeriodElementImporter.saveCSV(pathSaveCSV, elements);
	}
}
