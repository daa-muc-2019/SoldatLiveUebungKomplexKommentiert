/**
 * 
 * Ausfuehrende Klasse, in der das Programm spaeter ausgefuehrt wird.
 * 
 * @author paul
 *
 */
public class Main {

	/**
	 * 
	 * Die Hauptmethode ist nur in der "Hauptklasse, der eigenstaenidg ausfuehrbaren Klasse eines Programms erforderlich! (Lehrbuch def.)
	 * 
	 * Methode, die das Java Programm ausfuerht.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// hier wird eine Soldatin mit dem default-Konstruktor
		Soldat soldatErika = new Soldat();
		
		//Das konkrete Objekt: soldatErika, ruft das Verhalten/Methode: halloAnAlle() auf.
		soldatErika.halloAnAlle();

		// hier wird ein Soldat mit einen anderen Konstruktor (benötigt in den Parametern das alter, name, aktennummer)
		// erstellt. 
		Soldat soldatPaul = new Soldat(25, "Paul Seer", 1);
		
		//Das konkrete Objekt: soldatPaul, ruft die Verhalten/Methode: halloAnAlle() auf.
		soldatPaul.halloAnAlle();

		//hier wird das alter des konkreten Objekts soldatPaul mit hilfe der Methode getAlter() aufgerufen und auf der Konsole ausgegeben.
		System.out.println("das Alter von soldat2 ist: "
				+ soldatPaul.getAlter());

		//hier wird die Personalakte mit inhalt gefüllt. dabei wird erst eine Methode in der Klasse Soldat und dann in der Klasse PersonalAkte aufgerufen.
		soldatPaul
				.inhaltInAkteHinzufuegen("momentan manchmal schlecht gelaunt");

		//methoden aufruf wirdAelter; dabei wird das Attribut alter zur Laufzeit verändert.
		soldatPaul.wirdAelter();
		
		soldatPaul.halloAnAlle();

		//hier wird die logig der methode: wirdAelter(int neuesAlter) auf ihre Funktion getestet
		soldatPaul.wirdAelter(12);
		soldatPaul.halloAnAlle();

		// direkter zugriff auf die Methode, ohne Objekt der Klasse Helperclass
		//dabei bekommt die Methode einen String übergeben und gibt diesen auf der Konsole aus
		HelperClass.consolenAusgabe("Test ausgabe");

	}

}
