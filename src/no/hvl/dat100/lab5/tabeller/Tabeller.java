package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for (int i= 0; i<tabell.length; i++) {
			int temp = tabell[i];
			System.out.println(temp);
		}
		
		}
		
	

	// b)
	public static String tilStreng(int[] tabell) {

		String tabInh = "";
		for (int i=0;i<tabell.length;i++) {
			tabInh = tabInh+tabell[i];
			if (i<tabell.length-1)
				tabInh = tabInh+",";
		}
			
		String melding="["+tabInh+"]";
		return melding;
		//throw new UnsupportedOperationException("tilStreng ikke implementert");

		
	}

	// c)
	public static int summer(int[] tabell) {
		int sum=0;
		for (int i= 0; i<tabell.length; i++) {
			sum = sum + tabell[i];
			
		}
		return sum;
		
		//throw new UnsupportedOperationException("summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int e:tabell)
			if (e==tall)
				return true;
		return false;
		//throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i=0;i<tabell.length;i++)
			if (tabell[i]==tall)
				return i;
		return -1;
		//throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("reverser ikke implementert");
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
