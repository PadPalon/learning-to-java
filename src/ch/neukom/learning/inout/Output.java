package ch.neukom.learning.inout;

public class Output {

	public static void main(String[] args) {
		Output output = new Output();
		output.printValue();
		output.printLine();
		output.formatValue();
	}
	
	/**
	 * System.out.print schickt Werte direkt an die Konsole, welche dort an die momentane Zeile angehängt werden
	 */
	private void printValue() {
		System.out.println("\nprintValue\n---");
		System.out.print("first value");
		System.out.print("second value on same line");
	}
	
	/**
	 * System.out.println schickt Werte direkt an die Konsole, welche dort auf eine neue Zeile gedruckt werden
	 */
	private void printLine() {
		System.out.println("\nprintLine\n---");
		System.out.println("first line");
		System.out.println("second line");
	}
	
	/**
	 * Mit String.format können Werte auf einfache Weise formatiert werden und in einen String geschrieben werden
	 */
	private void formatValue() {
		String value = "value";
		Integer number = 12;
		System.out.println("\nformatValue\n---");
		String formatted = String.format("This is a '%s' and it contains '%s'" , value, number); //Mit %s kann ein Platzhalter in einem String definiert werden
		System.out.println(formatted);
	}

}
