package ch.neukom.learning.data;

/**
 * Ein Array ist eine Datenstruktur die eine Reihe von Elementen enthält, auf die mit einem Index zugegriffen werden kann.
 * Die Reihenfolge der hinterlegten Daten wird durch ihre Position im Array bestimmt.
 */
public class Array {

	public static void main(String[] args) {
		Array array = new Array();
		array.createArray();
		array.accessArray();
	}
	
	/**
	 * Arrays können erstell werden mit "new Type[Grösse des Arrays]"
	 */
	private void createArray() {
		String[] array = new String[3];
		array[0] = "first";
		array[1] = "second";
		array[2] = "third";
		array[0] = "another";

		System.out.println("\ncreateArray\n---");
		for(String string: array) {
			System.out.println(string);
		}
	}
	
	/**
	 * Auf Arrays wird mit Hilfe von [index] zugegriffen.
	 */
	private void accessArray() {
		String[] array = new String[10];
		array[0] = "first";
		array[1] = "second";
		array[2] = "third";

		System.out.println("\naccessArray\n---");
		System.out.println("Erster Eintrag: " + array[0]);
		System.out.println("Zweiter Eintrag: " + array[1]);
		System.out.println("Dritter Eintrag: " + array[2]);
		System.out.println("Vierter Eintrag: " + array[3]);
		System.out.println("Länge: " + array.length);
	}
}
