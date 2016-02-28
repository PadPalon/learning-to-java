package ch.neukom.learning.main;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

	public static void main(String[] args) {
	}
	
	/**
	 * System.in ist ein InputStream aus der Konsole, von dem gelesen werden kann
	 * 
	 * InputStreams und Reader sind auch an vielen anderen Orten im Gebrauch, lesen von Files, lesen von Daten aus dem Netz
	 */
	private class Example {
		/**
		 * Mit einem InputStreamReader kann ein Zeichen nach dem anderen von der Konsole eingelesen werden
		 */
		private void readValue() {
			try (InputStreamReader reader = new InputStreamReader(System.in)) {
				int c;
				while((c = reader.read()) != -1) {
					System.out.println(String.format("Read character: %s", (char) c));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		/**
		 * Mit einem BufferedReader kann ein InputStreamReader zusätzlich noch eine Zeile nach der anderen eingelesen werden
		 */
		private void readLine() {
			 try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
				String read = reader.readLine();
				System.out.println(read);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
