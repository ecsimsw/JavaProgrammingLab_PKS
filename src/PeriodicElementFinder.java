
public abstract class PeriodicElementFinder {
	public abstract boolean isInstanceOf(PeriodicElement pe);

	// template method pattern
	public PeriodicElement[] find(PeriodicElement[] elements) {
		int count = 0;
		for (PeriodicElement pe : elements) {
			if (pe != null && isInstanceOf(pe)) {
				count++;				
			}
		}
		PeriodicElement[] result = new PeriodicElement[count];
		count = 0;
		for (PeriodicElement pe : elements) {
			if (pe != null && isInstanceOf(pe)) {
				result[count++] = pe;
			}
		}
		return result;
	}
}
