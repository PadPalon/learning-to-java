package ch.neukom.learning.data;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
	}
	
	private class Example {
		private void addList() {
			ArrayList<String> strings = new ArrayList<String>();
			strings.add("first");
			strings.add("second");
		}
		
		private void removeList() {
			ArrayList<String> strings = new ArrayList<String>();
			strings.add("first");
			strings.add("second");
			strings.remove(0);
			strings.remove("second");
		}
	}

}
