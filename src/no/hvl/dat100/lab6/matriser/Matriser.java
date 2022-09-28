package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int tab[] : matrise) {
			for (int e : tab)
				System.out.print(e);
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String ret = "";
		for (int[] tab : matrise) {
			for (int i = 0; i < tab.length; i++)
				ret = ret + tab[i] + " ";
			ret = ret + "\n";
		}
		return ret;
		// throw new UnsupportedOperationException("tilStreng ikke implementert");

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] newtab = new int[matrise.length][matrise[0].length];
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise.length; j++) {
				newtab[i][j] = matrise[i][j] * tall;
			}
		}
		return newtab;
		// throw new UnsupportedOperationException("skaler ikke implementert");

	}


	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		if (a.length != b.length)
			return false;
		for (int i = 0; i < a.length; i++)
			if (a[i].length != b[i].length)
				return false;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] != b[i][j])
					return false;
			}
		}
		return true;
		// throw new UnsupportedOperationException("erLik ikke implementert");
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		int[][] newM = new int[matrise.length][matrise[0].length];
		for (int i = 0; i < matrise.length; i++)
			for (int j = 0; j < matrise.length; j++) {
				newM[i][j] = matrise[j][i];
			}
		return newM;
		// throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int[][] nyB = new int[b[0].length][b.length];
		for (int x = 0; x < b.length; x++)
			for (int y = 0; y < b[0].length; y++)
				nyB[y][x] = b[x][y];

		int[][] newM = new int[a.length][b.length];
		
		
		
		for (int x = 0; x < newM.length; x++)
			for (int y = 0; y < newM[0].length; y++) {
				int sum =0;
				for (int x2=0;x2<newM.length;x2++)
					sum=sum+a[x][x2]*nyB[y][x2];
				newM[x][y] =sum;
			}
		return newM;
		// throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
