package ch.neukom.learning.main;

public class Output {

	public static void main(String[] args) {
	}
	
	private class Example {
		private Example() {}
		
		/**
		 * System.out.print schickt Werte direkt an die Konsole, welche dort an die momentane Zeile angehängt werden
		 */
		private void printValue() {
			System.out.print("first value");
			System.out.print("second value on same line");
		}
		
		/**
		 * System.out.println schickt Werte direkt an die Konsole, welche dort auf eine neue Zeile gedruckt werden
		 */
		private void printLine() {
			System.out.println("first line");
			System.out.println("second line");
		}
		
		/**
		 * Mit String.format können Werte auf einfache Weise formatiert werden und in einen String geschrieben werden
		 */
		private void formatValue() {
			String value = "value";
			Integer number = 12;
			String formatted = String.format("This is a '%s' and it contains '%'" , value, number);
			System.out.println(formatted);
		}
	}

}
