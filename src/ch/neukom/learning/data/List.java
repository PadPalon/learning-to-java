package ch.neukom.learning.data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * List sind Kollektionen von Daten. Die Daten sind geordnet, erlauben Duplikate und können null sein. 
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
	 * Listen sind immer von einem bestimmten Typ, zum Beispiel List<String> für eine Liste von Strings
	 */
	private void someLists() {
		new LinkedList<>(); //doubly-linked list, besser um darüber zu iterieren, langsamer bei Zugriff auf spezifische Index
		new ArrayList<>(); //Liste die im Hintergrund mit einem Array funktioniert, optimal um auf spezifische Indexes zuzugreifen
		new Stack<>(); //Last-In-First-Out, sollte normalerweise über Implementationen von java.util.Deque gemacht werden
	}
	
	/**
	 * Werte können an jeden Ort einer Liste angehängt werden
	 */
	private void addList() {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("first"); //Wert hinten anhängen
		strings.add("second");
		strings.add(1, "third"); //Wert an angegebenem Index einfügen
		
		System.out.println("\naddList\n---");
		for(String string: strings) {
			System.out.println(string);
		}
	}
	
	/**
	 * Werte können aus einer Liste wieder entfernt werden
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
	 * Listen können nach verschiedenen Sachen gefragt werden
	 */
	private void listData() {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("first");
		strings.add("second");
		strings.add("third");

		System.out.println("\nlistData\n---");
		System.out.println("Länge: " + strings.size()); //Länge der Liste
		System.out.println("Ist leer: " + strings.isEmpty()); //Ob die Liste leer ist
		System.out.println("Enthält 'third': " + strings.contains("third")); //Ob die Liste einen bestimmten Wert enthält
		System.out.println("Enthält 'fourth': " + strings.contains("fourth"));
	}
}
