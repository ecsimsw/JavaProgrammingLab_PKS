public abstract class PeriodicElement implements Comparable<PeriodicElement> {
	protected int number;
	protected String symbol;
	protected String name;
	protected double weight;
	protected State state;
	
	// constructor
	public PeriodicElement(int number, String symbol, String name, double weight) {
		this.number = number;
		this.symbol = symbol;
		this.name = name;
		this.weight = weight;
	}

	// getter/setter
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public State getState() {
		return state;
	}
	
	public void setState(State state) {
		this.state = state;
	}

	// getElement
	public Element getElement() {
		return Element.nameOf(this.name);
	}

	@Override
	public String toString() {
		return "PeriodicElement [number=" + number + ", symbol=" + symbol + ", name=" + name + ", weight=" + weight
				+ ", state=" + state + "]";
	}

	public abstract void print(); 
	
	// utility method ( String -> PeirodicElement) "1 H HYDROGEN 1.008 GAS" => GasPeriodicElement
	public static PeriodicElement parsePeriodicElement(String line) {
		String[] fields = line.split(" "); 
		int number = Integer.parseInt(fields[0]);
		String symbol = fields[1];
		String name = fields[2];
		double weight = Double.parseDouble(fields[3]);
		State state = State.valueOf(fields[4]);
		return PeriodicElementFactory.getInstance(number, symbol, name, weight, state);
	}
	
	@Override
	public int compareTo(PeriodicElement other) {
        //ascending order
        return this.getNumber() - other.getNumber();
        //descending order
        //return other.getNumber() - this.getNumber();
    }

}
