
public class Bigs {
	
	public static void main (String[] s) {
        int[ ] a = One();
        for (int i=0; i<33222; ++i) { a = times(a, 2); }
        System.out.println("2^33222 hat " + a.length + " Stellen");
        print(a); 
        System.out.println();
        int[ ] b = fromInt(13);
        int[ ] c = copy(b);
        for (int i=1; i<8978; ++i) { c = times(c, b); }
        System.out.println("13^8978 hat " + c.length + " Stellen");
        print(c); 
        System.out.println();
        System.out.println(less(a, c)); // beantwortet die Frage aus der    
                                        // Aufgabenueberschrift
        maxDigit(a); 
        maxDigit(c);
    }
	
	
	public static int[] One() {
		int[] eins = {1}; 
		return eins;
	}
	
	public static int[] times(int[] n, int d) {
		int[] k = new int[n.length];
		for(int i = 0; i < (n.length - 1); i++) {
			int z = n[i] * d;
			int z0 = z % 10;
			int z1 = z / 10;
			k[i] = k[i] + z0;
			if(k[i] > 9) {
				k[i + 1] = k[i] / 10;
				k[i] = k[i] % 10;
			}
			k[i + 1] += z1;
		}
		k[n.length - 1] = n[n.length - 1] * d; 
		if(k[n.length - 1] > 9) {
			int[] m = new int[n.length + 1];
			for(int i = 0; i < n.length - 1; i++) {
				m[i] = k[i];
			}
			int k0 = k[n.length - 1] % 10;
			int k1 = k[n.length - 1] / 10;
			m[n.length - 1] = k0;
			m[n.length] = k1;
			return m;
		}
		else {
			return k;
		}
	}
	
	public static int[] print(int[] n) {
		// \ wird auch bei genau 68 Zeichen geprintet!!!!!!!!!!!!!!!!!!!
		String m = "";
		int j = 1;
		for(int i = n.length - 1; i >= 0; i--) {
			j = j % 68;
			if( j == 0 ) {
				System.out.println(m + "\\");
				m = "";					
			}
			m += n[i];
			j += 1;
		}
		System.out.println(m);
		return n;
	}
	
	public static int[] fromInt(int n) {
		int m = n;
		int j = 0;
		if ( n == 0) {
			int[]z = {0};
			return z;
		}
		else {
			while( m != 0) {
				m = m % 10;
				j += 1;						
			}
			int[] w = new int[j];
			for ( int i = 0; i < j; i++) {
				w[i] = n % 10;
				n = n / 10;		
			}
			return w;
		}
	}
	
	public static int[] copy(int[] n) {
		int[] m = new int[n.length];
		for( int i = 0; i < (n.length -1) ; i++) {
			m[i] = n[i];
		}
		return m;
	}
	
	public static int[] times10(int[] n) {
		int[] m = new int[n.length + 1];
		m[0] = 0;
		for( int i = 0; i < n.length; i++) {
			m[i + 1] = n[i]; 
		}
		return m;
	}
	
	public static int[] add( int[] a, int[] b) {
		// wird m mit Nulleinträgen initialisiert???????????
		int z = Math.min(a.length, b.length);
		int v = Math.max(a.length, b.length);
		int[] m = new int[v];
		int k = 0;
		for( int i = 0; i < z; i++) {
			m[i] = k + a[i] + b[i];
			k = 0;
			if( m[i] > 9) {
				k = 1;
				m[i] = m[i] % 10;
			}
		}
		if(a.length < b.length) {
			for( int i = z; i < v; i++) {
				m[i] = k + b[i];
				k = 0;
				if( m[i] > 9) {
					k = 1;
					m[i] = m[i] % 10;
				}
			}
		}
		
		if( a.length > b.length ) {
			for( int i = z; i < v; i++) {
				m[i] = k + a[i];
				k = 0;
				if( m[i] > 9) {
					k = 1;
					m[i] = m[i] % 10;
				}
			}
		}
		
		if( k > 0 ) {
			int[] g = new int[m.length + 1];
			g[m.length] += k;
			for( int i = 0; i < m.length; i++) {
				g[i] = m[i]; 
			}
			return g;
		}
		else {
			return m;
		}
		
	}
	
	public static void maxDigit(int[] n) {
		int[] z = new int[9];
		for( int i = 0; i < n.length; i++) {
			switch (n[i]) {
			case 0: z[0] += 1;break;
			case 1: z[1] += 1;break;
			case 2: z[2] += 1;break;
			case 3: z[3] += 1;break;
			case 4: z[4] += 1;break;
			case 5: z[5] += 1;break;
			case 6: z[6] += 1;break;
			case 7: z[7] += 1;break;
			case 8: z[8] += 1;break;
			case 9: z[9] += 1;break;singleton
			}
		}
		int maxD = 0;
		for ( int i = 1; i <= 9; i++) {
			if(z[maxD] < z[i]) {
				maxD = i;
			}
		}
		System.out.println(maxD);
	}
	
	public static int[] times(int[] a, int[] b) {
		// verbinde add() und times10()
	}
	
	public static int[] digit(int d) {
		int num = d;
		int[] digit = {num};
		return digit;
	}
	
	public static int[] Null() {
		int[] zero = {0};
		return zero;
	}
	
	public static int mod10(int[] n) {
		rest = n[0];
		return rest;
	}
	
	public static int[] div10(int[] n) {
		int[] result = new int[n.length - 1];
		for (i = 0; i < n.length; i++) {
			result[i] = n[i];
		}
		return result;
	}
	
	public static boolean equal ( int[] a, int[] b) {
		if (a.length != b.length ) {
			return false;
		}
		else {
			for (i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {return false;}
			}
			return true;
			}
		}
	
	public static boolean less ( int[] a, int[] b) {
		if (a.length < b.length) {return true;}
		else if (a.length > b.length) {return false;}
		else {
			for (i = a.length - 1; i < -1 ; i--) {
				if (a[i] < b[i]) {return true;}
			return false;
			}
		}
		
	}
	
	public static boolean ok(int[] n) {
		
	}
}
