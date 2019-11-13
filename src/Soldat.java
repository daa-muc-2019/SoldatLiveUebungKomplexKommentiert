
/**
 * 
 * Diese Klasse repraesentiert einen Soldaten mit 
 * vordef. Attributen
 * 
 * @author paul
 *
 */
public class Soldat {

	/**
	 * Soldaten Alter
	 * Deklarierung, Datentyp: int
	 */
	int alter;
	/**
	 * Soldaten Dienstgrad
	 * Deklarierung, Datentyp: Dienstgrad/enum
	 */
	Dienstgrad dienstgrad;
	/**
	 * Soldaten Name
	 * Deklarierung des, Datentyp: String
	 */
	String name;
	
	/**
	 * Personalakte des/der Soldats/Soldatin
	 */
	PersonalAkte meinePersonalAkte;
	
//	im folgenden haette der Soldat eine 2. Personalakte
//	PersonalAkte meineZweitePersonalAkte;

	/**
	 * default Konstroktur eines Soldaten, ohne Parameter
	 * Dabei werden alle Attribute festgelegt.
	 */
	public Soldat() {

		this.alter = 20;
		this.dienstgrad = Dienstgrad.UNTEROFFIZIER;
		this.name = "Erika Musterfrau";
		
		
		String tmpPersonalKennziffer = HelperClass.personalKennzifferGenerator(name, 100);
		
		
		this.meinePersonalAkte = new PersonalAkte(tmpPersonalKennziffer, 100);

	}

	/**
	 * Konstruktor mit einen einen Parameter
	 * 
	 * Die Werte der Attribute: name = null, Dienstgrad = null, 
	 * meinePersonalAkte = null.
	 * 
	 * Nur der Wert alter werden initialisiert.
	 * 
	 * @param alter
	 */
	public Soldat(int alter) {
		this.alter = alter;
	}

	/**
	 * 
	 * Konstruktor mit 3 Parametern. 
	 * hier werden alle Attribute korrekt initialisiert.
	 * 
	 * @param alter erwartet ein int
	 * @param name erwartet einen String
	 * @param personalNummer erwartet ein int
	 */
	public Soldat(int alter, String name, int personalNummer) {
		this.dienstgrad = Dienstgrad.GEFREITER;
		this.name = name;
		this.alter = alter;
		String tmpPersonalKennziffer = name + " " + personalNummer;
		this.meinePersonalAkte = new PersonalAkte(tmpPersonalKennziffer, personalNummer);
	}

	/**
	 * ausführende Method
	 * gibt auf der Konsole einen vordef. ausruf aus.
	 */
	void halloAnAlle() {
		
		HelperClass.consolenAusgabe("Hallo ich bin: " + name +" Und bin " + alter +
				" Jahre alt" + "Meine Personalnummer lautet: " 
				+ meinePersonalAkte.gibMirDiePersonalNummer());
		
//		System.out.println("Hallo ich bin: " + name +" Und bin " + alter +
//				" Jahre alt");
	}

	/**
	 * ausführende Methode.
	 * Erhoeht das Alter um 1
	 */
	void wirdAelter() {
		this.alter = alter + 1;
		// this.alter++;
	}

	/**
	 * ausführende Methode.
	 * bekommt als Parameter ein int und ueberschreibt den aktuellen Wert.
	 * Kleine Logik ueberprueft das Alter
	 * @param neuesAlter
	 */
	void wirdAelter(int neuesAlter) {
		if (neuesAlter >= 17) {

			this.alter = neuesAlter;
			
		} else {
			
			System.out.println("zu jung!");
		}
	}
	
	/**
	 * Methode, die den Wert des Attributes alter zurueck gibt.
	 * @return
	 */
	int getAlter() {
		
		return this.alter;
		
	}

	/**
	 * ausfuehrende Methode.
	 * Die Methode: personalAkteAnfordern, der Klasse PersonalAkte
	 * wird hier ausgefuehrt.
	 */
	void personalAkteAnfordern() {
		meinePersonalAkte.personalAkteAnfordern();
	}
	
	/**
	 * 
	 * Ausfuehrende Methode.
	 * Die Methode: inhaltHinzufuegen(String neuerInhalt), der Klasse
	 * PersonalAkte wird hier ausgefuehrt.
	 * 
	 * Dabei wird ein String als Parameter uebergeben
	 * 
	 * @param neuerInhalt
	 */
	void inhaltInAkteHinzufuegen(String neuerInhalt) {
		meinePersonalAkte.inhaltHinzufuegen(neuerInhalt);
	}
	
}
