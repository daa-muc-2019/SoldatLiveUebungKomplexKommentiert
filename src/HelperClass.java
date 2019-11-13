/**
 * Klasse mit statischen Methoden, die verdeutlichen sollen, wie
 * Methoden ohne Konkrete Objekte zur Laufzeit erstellt werden koennen.
 * 
 * @author paul
 *
 */
public class HelperClass {

	/**
	 * 
	 * Statische, ausfuehrende Methode, die einen String als Parameter erwartet.
	 * Aufruf innerhalb anderer Klassen oder in der main-Methode:
	 * 
	 * HelperClass.consolenAusgabe("test Ausgabe");
	 * 
	 * @param ausgabe
	 */
	static void consolenAusgabe(String ausgabe) {

		System.out.println(ausgabe);

	}

	/**
	 * Statische, ausfuehrende Methode, die einen int als Parameter erwartet.
	 * Aufruf innerhalb anderer Klassen oder in der main-Methode:
	 * 
	 * HelperClass.consolenAusgabe(1337);	 * 
	 * @param ausgabe
	 */
	static void consolenAusgabe(int ausgabe) {

		System.out.println(ausgabe);

	}

	/**
	 * 
	 * Hilfsmethode um die personalKennziffer zu generieren.
	 * Rueckgabe Wert ist ein String.
	 * 
	 * @param name
	 * @param personalNummer
	 * @return
	 */
	static String personalKennzifferGenerator(String name, int personalNummer) {

		String output = name + " " + personalNummer;

		return output;

	}

}
