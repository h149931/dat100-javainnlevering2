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

        // TODO
        boolean harVerdi = tabell.length > 0;
        if (!harVerdi) {
            return 0;
        } else {

            // For-løkke:
            int sumFor = tabell[0];
            for (int i = 1; i < tabell.length; i++) {
                sumFor += tabell[i];
            }

            // While-løkke:
            int sumWhile = tabell[0];
            int j = 1;
            while (j < tabell.length) {
                sumWhile += tabell[j];
                j++;
            }

            // Utvidet for-løkke:
            int utvForSum = tabell[0];
            for (int v : tabell) {
                utvForSum += v;
            }
            int sum = (sumFor + sumWhile + utvForSum) / 3;
            return sum;
        }
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

		int[] nytab = new int[tabell.length];
		
		for (int i=0,j=tabell.length-1;i<tabell.length;i++,j--)
			nytab[j]=tabell[i];
		return nytab;	
		//throw new UnsupportedOperationException("reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		for (int i=0;i<tabell.length-1;i++)
			if (tabell[i]>tabell[i+1])
				return false;
		return true;
		//throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] newtab = new int[tabell1.length + tabell2.length];
		int index = 0;
		int t2 = 0;
		while (index < tabell1.length) {
			newtab[index] = tabell1[index];
			index++;
		}
		while (index < tabell1.length + tabell2.length) {
			newtab[index] = tabell2[t2];
			index++;
			t2++;
		}
		return newtab;
		// throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}