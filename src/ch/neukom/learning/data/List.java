package ch.neukom.learning.data;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
	}
	
	/**
	 * List sind Kollektionen von Daten. Die Daten sind geordnet , erlauben Duplikate und k�nnen null sein. 
	 */
	private class Example {
		/**
		 * Werte k�nnen an jeden Ort einer Liste angeh�ngt werden
		 */
		private void addList() {
			ArrayList<String> strings = new ArrayList<String>();
			strings.add("first");
			strings.add("second");
			strings.add(0, "third");
		}
		
		/**
		 * Werte k�nnen aus einer Liste wieder entfernt werden
		 */
		private void removeList() {
			ArrayList<String> strings = new ArrayList<String>();
			strings.add("first");
			strings.add("second");
			strings.remove(0);
			strings.remove("second");
		}
	}

}
