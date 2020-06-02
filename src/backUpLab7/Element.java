package backUpLab7;

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
	
	// get Element by index
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
	
	//nameOf - String 받으면 Element 내보낸다.
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
/*	
	//get names()
	public static String[] names() {
		String[] names = new String[Element.values().length];
		for(Element n: Element.values()) {
			names[n.ordinal()] = n.toString();
		}
		return names;
	}
*/
	//get names()
	public static String[] names() {
		String[] names = new String[Element.values().length];
		for(int i = 0; i< Element.values().length; i++) {
			names[i] = Element.values()[i].toString();
		}
		return names;
	}

	
}
