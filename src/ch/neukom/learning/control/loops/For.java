package ch.neukom.learning.control.loops;

import java.util.ArrayList;
import java.util.List;

/**
 * Die for-Schleife führt eine Logik eine gewisse Anzahl Male aus
 */
public class For {

	public static void main(String[] args) {
		For forClass = new For();
		forClass.fromZeroToTen();
		forClass.multiplicationsOfFiveToHundred();
		forClass.iterateThroughList();
	}
	
	private void fromZeroToTen() {
		System.out.println("\nfromZeroToTen\n---");
		/* Eine for-Schleife hat einen initialen Wert (int i = 0),
		 * eine Bedingung die vor jeder Ausführung geprüft wird (i <= 10)
		 * und eine Aktion die nach jeder Durchführung ausgeführt wird (i++)
		 */
		for(int i = 0; i <= 10; i++) { 
			System.out.println(i);
		}
	}
	
	private void multiplicationsOfFiveToHundred() {
		System.out.println("\nmultiplicationsOfFiveToHundred\n---");
		//Die Aktion der for-Schleife kann eine beliebig Zuweisung sein, hier wird zum Beispiel i um 5 hochgezählt
		for(int i = 0; i <= 100; i = i + 5) {
			System.out.println(i);
		}
	}
	
	private void iterateThroughList() {
		List<String> strings = new ArrayList<String>();
		strings.add("first");
		strings.add("second");
		strings.add("third");

		System.out.println("\niterateThroughList\n---");
		for(int i = 0; i < strings.size(); i++) {
			System.out.println(strings.get(i));
		}
	}

}
