package temp;

import dto.State;
import dto.Type;

import java.util.Comparator;

public enum Element {
	HYDROGEN(1),
	HELIUM(2),
	LITHIUM(3),
	BERYLLIUM(4),
	BORON(5),
	CARBON(6),
	NITROGEN(7),
	OXYGEN(8),
	FLUORINE(9),
	NEON(10),
	SODIUM(11),
	MAGNESIUM(12),
	ALUMINIUM(13),
	SILICON(14),
	PHOSPHORUS(15),
	SULFUR(16),
	CHLORINE(17),
	ARGON(18),
	POTASSIUM(19),
	CALCIUM(20),
	SCANDIUM(21),
	TITANIUM(22),
	VANADIUM(23),
	CHROMIUM(24),
	MANGANESE(25),
	IRON(26),
	COBALT(27),
	NICKEL(28),
	COPPER(29),
	ZINC(30),
	GALLIUM(31),
	GERMANIUM(32),
	ARSENIC(33),
	SELENIUM(34),
	BROMINE(35),
	KRYPTON(36),
	RUBIDIUM(37),
	STRONTIUM(38),
	YTTRIUM(39),
	ZIROCONIUM(40),
	NIOBIUM(41),
	MOLYBDENUR(42),
	TECHNETIUM(43),
	RUTHENIUM(44),
	RHODIUM(45),
	PALLADIUM(46),
	SILVER(47),
	CADMIUM(48),
	INDIUM(49),
	TIN(50);
	
	// constructor
	private final int value;
	Element(int value) {
		this.value = value;
	}
	
	// getValue
	public int getValue() {
		return value;
	}
	
	// get Lab8.Element by index
	public static Element valueOf(int value) {
		switch(value) {
		case 1 : return HYDROGEN;
		case 2 : return HELIUM;
		case 3 : return LITHIUM;
		case 4 : return BERYLLIUM;
		case 5 : return BORON;
		case 6 : return CARBON;
		case 7 : return NITROGEN;
		case 8 : return OXYGEN;
		case 9 : return FLUORINE;
		case 10 : return NEON;
		case 11 : return SODIUM;
		case 12 : return MAGNESIUM;
		case 13 : return ALUMINIUM;
		case 14 : return SILICON;
		case 15 : return PHOSPHORUS;
		case 16 : return SULFUR;
		case 17 : return CHLORINE;
		case 18 : return ARGON;
		case 19 : return POTASSIUM;
		case 20 : return CALCIUM;
		case 21 : return SCANDIUM;
		case 22 : return TITANIUM;
		case 23 : return VANADIUM;
		case 24 : return CHROMIUM;
		case 25 : return MANGANESE;
		case 26 : return IRON;
		case 27 : return COBALT;
		case 28 : return NICKEL;
		case 29 : return COPPER;
		case 30 : return ZINC;
		case 31 : return GALLIUM;
		case 32 : return GERMANIUM;
		case 33 : return ARSENIC;
		case 34 : return SELENIUM;
		case 35 : return BROMINE;
		case 36 : return KRYPTON;
		case 37 : return RUBIDIUM;
		case 38 : return STRONTIUM;
		case 39 : return YTTRIUM;
		case 40 : return ZIROCONIUM;
		case 41 : return NIOBIUM;
		case 42 : return MOLYBDENUR;
		case 43 : return TECHNETIUM;
		case 44 : return RUTHENIUM;
		case 45 : return RHODIUM;
		case 46 : return PALLADIUM;
		case 47 : return SILVER;
		case 48 : return CADMIUM;
		case 49 : return INDIUM;
		case 50 : return TIN;
		default : return null;
		}
	}
	
	//nameOf - String 받으면 Lab8.Element 내보낸다.
	public static Element nameOf(String name) {
		switch(name) {
		case "1":
		case "HYDROGEN" :
			return HYDROGEN;
		case "2":
		case "HELIUM" :
			return HELIUM;
		case "3" :
		case "LITHIUM":
			return LITHIUM;
		case "4" :
		case "BERYLIUM":
			return BERYLLIUM;
		case "5" :
		case "BORON":
			return BORON;
		case "6" :
		case "CARBON" :
			return CARBON;
		case "7" :
		case "NITROGEN":
			return NITROGEN;
		case "8" :
		case "OXYGEN" :
			return OXYGEN;
		case "9" :
		case "FLUORINE":
			return FLUORINE;
		case "10" :
		case "NEON":
			return NEON;
		case "11" :
		case "SODIUM":
			return SODIUM;
		case "12" :
		case "MAGNESIUM":
			return MAGNESIUM;
		case "13" :
		case "ALUMINIUM":
			return ALUMINIUM;
		case "14" :
		case "SILICON":
			return SILICON;
		case "15" :
		case "PHOSPHORUS":
			return PHOSPHORUS;
		case "16" :
		case "SULFUR":
			return SULFUR;
		case "17" :
		case "CHLORINE":
			return CHLORINE;
		case "18" :
		case "ARGON":
			return ARGON;
		case "19" :
		case "POTASSIUM":
			return POTASSIUM;
		case "20" :
		case "CALCIUM":
			return CALCIUM;
		case "21" :
		case "SCANDIUM":
			return SCANDIUM;
		case "22" :
		case "TITANIUM": 
			return TITANIUM;
		case "23" :
		case "VANADIUM":
			return VANADIUM;
		case "24" : 
		case "CHROMIUM":
			return CHROMIUM;
		case "25" : 
		case "MANGANESE":
			return MANGANESE;
		case "26" :
		case "IRON":
			return IRON;
		case "27" :
		case "COBALT":
			return COBALT;
		case "28" :
		case "NICKEL":
			return NICKEL;
		case "29" :
		case "COPPER":
			return COPPER;	
		case "30" :
		case "ZINC":
			return ZINC;
		case "31" :
		case "GALLIUM":
			return GALLIUM;
		case "32" :
		case "GERMANIUM":
			return GERMANIUM;
		case "33" :
		case "ARSENIC":
			return ARSENIC;
		case "34" :
		case "SELENIUM":
			return SELENIUM;
		case "35" :
		case "BROMINE":
			return BROMINE;
		case "36" :
		case "KRYPTON":
			return KRYPTON;
		case "37" :
		case "RUBIDIUM":
			return RUBIDIUM;
		case "38" :
		case "STRONTIUM":
			return STRONTIUM;
		case "39" :
		case "YTTRIUM":
			return YTTRIUM;
		case "40" :
		case "ZIROCONIUM":
			return ZIROCONIUM;
		case "41" : 
		case "NIOBIUM":
			return NIOBIUM;
		case "42" :
		case "MOLYBDENUR":
			return MOLYBDENUR;
		case "43" :
		case "TECHNETIUM":
			return TECHNETIUM;
		case "44" :
		case "RUTHENIUM":
			return RUTHENIUM;
		case "45" :
		case "RHODIUM":
			return RHODIUM;
		case "46" :
		case "PALLADIUM":
			return PALLADIUM;
		case "47" :
		case "SILVER":
			return SILVER;		
		case "48" : 
		case "CADMIUM":
			return CADMIUM;
		case "49" :
		case "INDIUM":
			return INDIUM;
		case "50" :
		case "TIN":
			return TIN;
		default : return null;
		}
	}
	public static String[] names() {
		String[] names = new String[Element.values().length];
		for(int i=0; i<Element.values().length; i++) {
			names[i] = Element.values()[i].toString();
		}
		return names;
	}

	public static class PeriodicElement implements Comparable<PeriodicElement> {
		protected int number;
		protected String symbol;
		protected String name;
		protected double weight;
		protected int period; //
		protected int group; //
		protected Type type; //
		protected State state; //

		// constructor
		public PeriodicElement(int number, String symbol, String name, double weight,
							   int period, int group, Type type, State state) {
			this.number = number;
			this.symbol = symbol;
			this.name = name;
			this.weight = weight;
			this.period = period;
			this.group = group;
			this.type = type;
			this.state = state;
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

		public int getPeriod() {return period;}

		public void setPeriod(int period) {this.period = period;}

		public int getGroup() {return group;}

		public void setGroup(int group) {this.group = group;}

		public Type getType() {return type;}

		public void setType(Type type) {this.type = type;}

		public State getState() {
			return state;
		}

		public void setState(State state) {
			this.state = state;
		}

		// getElement
		public Element getElement() {
			return nameOf(this.name);
		}

		public String toString() {
			StringBuilder elementInfo = new StringBuilder();
			elementInfo.append(number);
			elementInfo.append(',');
			elementInfo.append(symbol);
			elementInfo.append(',');
			elementInfo.append(name);
			elementInfo.append(',');
			elementInfo.append(weight);
			elementInfo.append(',');
			elementInfo.append(period);

			elementInfo.append(',');
			if(group == -1) elementInfo.append(" ");
			else elementInfo.append(group);

			elementInfo.append(',');
			if(type == null) elementInfo.append(" ");
			else elementInfo.append(type);

			elementInfo.append(',');
			elementInfo.append(state);

			return elementInfo.toString();
		}

		public static PeriodicElement parse(String[] fields) {
			int number = Integer.parseInt(fields[0]);
			String symbol = fields[1];
			String name = fields[2];
			double weight = Double.parseDouble(fields[3]);
			int period = Integer.parseInt(fields[4]);
			int group;

			if(fields[5].equals("")){
				group = -1;
			}else{
				group = Integer.parseInt(fields[5]);
			}

			Type type;
			if(fields[6].equals("")){
				type = null;
			}else{
				type = Type.valueOf(fields[6]);
			}
			State state = State.valueOf(fields[7]);
			return PeriodicElementFactory.getInstance(number, symbol, name, weight, period,group,type, state);
		}

		@Override
		public int compareTo(PeriodicElement other) {
			//ascending order
			return this.getNumber() - other.getNumber();
			//descending order
			//return other.getNumber() - this.getNumber();
		}


		/// ----------- Start Comparator.. The criteria should be changed later. --------------///

		public static Comparator<PeriodicElement> NumberComparator(){
			Comparator<PeriodicElement> comparator= new Comparator<PeriodicElement>() {
				@Override
				public int compare(PeriodicElement o1, PeriodicElement o2) {
					return o1.name.compareTo(o2.name);
				}
			};

			return comparator;
		}

		public static Comparator<PeriodicElement> SymbolComparator(){
			Comparator<PeriodicElement> comparator= new Comparator<PeriodicElement>() {
				@Override
				public int compare(PeriodicElement o1, PeriodicElement o2) {
					return o1.symbol.compareTo(o2.symbol);
				}
			};

			return comparator;
		}

		public static Comparator<PeriodicElement> NameComparator(){
			Comparator<PeriodicElement> comparator= new Comparator<PeriodicElement>() {
				@Override
				public int compare(PeriodicElement o1, PeriodicElement o2) {
					return o1.name.compareTo(o2.name);
				}
			};

			return comparator;
		}

		public static Comparator<PeriodicElement> WeightComparator(){
			Comparator<PeriodicElement> comparator= new Comparator<PeriodicElement>() {
				@Override
				public int compare(PeriodicElement o1, PeriodicElement o2) {
					return o1.weight < o2.weight ? -1: 1;
				}
			};

			return comparator;
		}

		public void print() {

			System.out.println("Print what????");
		}

		///// ----- End Comparator
	}
}
