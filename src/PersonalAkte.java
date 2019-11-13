/**
 * * Diese Klasse repraesentiert eine PersonalAkte mit vordef. Attributen
 * 
 * @author paul
 *
 */
public class PersonalAkte {

	String inhalt;
	int personalNummer;
	String personalKennziffer;

	/**
	 * 
	 * Konstruktor der Personalakte
	 * 
	 * @param personalKennziffer
	 * @param neuePersonalNummer
	 */
	PersonalAkte(String personalKennziffer, int neuePersonalNummer) {
		this.personalKennziffer = personalKennziffer;
		this.personalNummer = neuePersonalNummer;
		this.inhalt = "Personalakte mit der Personalnummer "
				+ this.personalNummer + "\n\n";

	}

	/**
	 * Methode, die den Wert des Attributes personalNummer zurueck gibt.
	 * 
	 * @return personalNummer der PersonalAkte
	 */
	int gibMirDiePersonalNummer() {
		return personalNummer;
	}

	/**
	 * ausfuehrende Methode, die den Inhalt der Personalakte auf der Konsole
	 * ausgibt.
	 */
	void personalAkteAnfordern() {

		System.out.println(inhalt);
	}

	/**
	 * 
	 * ausfuehrende Methode, die den Inhalt der Personalakte ergaenzt.
	 * 
	 * @param neuerInhalt
	 */
	void inhaltHinzufuegen(String neuerInhalt) {

		inhalt += neuerInhalt;
		// Alternative schreibweise
		// inhalt = inhalt + neuerInhalt;

	}

}
