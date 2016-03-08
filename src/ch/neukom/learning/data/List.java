package ch.neukom.learning.data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * List sind Kollektionen von Daten. Die Daten sind geordnet, erlauben Duplikate und k�nnen null sein. 
 */
public class List {

	public static void main(String[] args) {
		List list = new List();
		list.someLists();
		list.addList();
		list.removeList();
		list.listData();
	}
	
	/**
	 * Listen sind immer von einem bestimmten Typ, zum Beispiel List<String> f�r eine Liste von Strings
	 */
	private void someLists() {
		new LinkedList<>(); //doubly-linked list, besser um dar�ber zu iterieren, langsamer bei Zugriff auf spezifische Index
		new ArrayList<>(); //Liste die im Hintergrund mit einem Array funktioniert, optimal um auf spezifische Indexes zuzugreifen
		new Stack<>(); //Last-In-First-Out, sollte normalerweise �ber Implementationen von java.util.Deque gemacht werden
	}
	
	/**
	 * Werte k�nnen an jeden Ort einer Liste angeh�ngt werden
	 */
	private void addList() {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("first"); //Wert hinten anh�ngen
		strings.add("second");
		strings.add(1, "third"); //Wert an angegebenem Index einf�gen
		
		System.out.println("\naddList\n---");
		for(String string: strings) {
			System.out.println(string);
		}
	}
	
	/**
	 * Werte k�nnen aus einer Liste wieder entfernt werden
	 */
	private void removeList() {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("first");
		strings.add("second");
		strings.add("third");
		strings.remove(0); //Wert an einem bestimmten Index entfernen
		strings.remove("second"); //Bestimmten Wert entfernen

		System.out.println("\nremoveList\n---");
		for(String string: strings) {
			System.out.println(string);
		}
		
		strings.clear();
	}
	/**
	 * Listen k�nnen nach verschiedenen Sachen gefragt werden
	 */
	private void listData() {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("first");
		strings.add("second");
		strings.add("third");

		System.out.println("\nlistData\n---");
		System.out.println("L�nge: " + strings.size()); //L�nge der Liste
		System.out.println("Ist leer: " + strings.isEmpty()); //Ob die Liste leer ist
		System.out.println("Enth�lt 'third': " + strings.contains("third")); //Ob die Liste einen bestimmten Wert enth�lt
		System.out.println("Enth�lt 'fourth': " + strings.contains("fourth"));
	}
}
