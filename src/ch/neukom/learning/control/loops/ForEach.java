package ch.neukom.learning.control.loops;

import java.util.ArrayList;
import java.util.List;

/**
 * Diese weitere Form der for-Schleife kann verwendet werden um über Data-Container zu iterieren
 * (Um genau zu sein über jede Klasse die 'Iterable' implementiert oder Arrays)
 */
public class ForEach {

	public static void main(String[] args) {
		ForEach foreach = new ForEach();
		foreach.iterateOverList();
		foreach.iterateOverArray();
	}
	
	private void iterateOverList() {
		List<String> list = new ArrayList<String>();
		list.add("first");
		list.add("second");
		list.add("third");

		System.out.println("\niterateOverList\n---");
		for(String string: list) {
			System.out.println(string);
		}
	}
	
	private void iterateOverArray() {
		String[] array = new String[10];
		array[0] = "first";
		array[1] = "second";
		array[2] = "third";

		System.out.println("\niterateOverArray\n---");
		for(String string: array) {
			System.out.println(string);
		}
	}

}
