package ch.neukom.learning.control.loops.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * Erweitere die Klasse so, dass über die statische Liste LOG iteriert wird
 * und jeder Datensatz der mit "ERROR" beginnt auf die Konsole geschrieben wird.
 */
public class ErrorFinder {
	private final static List<String> LOG = new ArrayList<String>();
	
	static {
		LOG.add("WARNING: Keine Daten");
		LOG.add("LOG: Aktion gestartet");
		LOG.add("ERROR: System gestorben");
		LOG.add("LOG: Aktion gestoppt");
		LOG.add("LOG: Backup geschrieben");
		LOG.add("ERROR: Festplatte voll");
	}
	
	private static void main(String[] args) {
		
	}
}
