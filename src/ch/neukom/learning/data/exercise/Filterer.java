package ch.neukom.learning.data.exercise;

/**
 * Erweitere die Klasse so, dass jeder Eintrag im statischen Array CODES, der grösser ist als 255,
 * in eine neue Liste geschrieben wird. Am Schluss die Länge der Liste und die einzelnen Einträge ausgegeben werden.
 */
public class Filterer {
	private final static int[] CODES = new int[15];
	
	static {
		CODES[0] = 20;
		CODES[1] = 3;
		CODES[2] = 17;
		CODES[3] = 5;
		CODES[4] = 88;
		CODES[5] = 20;
		CODES[6] = 369;
		CODES[7] = 7719357;
		CODES[8] = 20;
		CODES[9] = 241;
		CODES[10] = 89;
		CODES[11] = 43;
		CODES[12] = 5573;
		CODES[13] = 2;
		CODES[14] = 1;
	}
	
	private static void main(String[] args) {
		
	}
}
