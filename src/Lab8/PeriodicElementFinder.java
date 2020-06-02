package Lab8;

public abstract class PeriodicElementFinder {
	public abstract boolean isInstanceOf(Element.PeriodicElement pe);

	// template method pattern
	public Element.PeriodicElement[] find(Element.PeriodicElement[] elements) {
		int count = 0;
		for (Element.PeriodicElement pe : elements) {
			if (pe != null && isInstanceOf(pe)) {
				count++;				
			}
		}
		Element.PeriodicElement[] result = new Element.PeriodicElement[count];
		count = 0;
		for (Element.PeriodicElement pe : elements) {
			if (pe != null && isInstanceOf(pe)) {
				result[count++] = pe;
			}
		}
		return result;
	}
}
