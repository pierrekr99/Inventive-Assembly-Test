package objekte;

public class Monteur extends Mitarbeiter {

	//	Attribute
private String anwesenheit;

public Monteur(String name, String vorname, String mitarbeiternr, String passwort, String anwesenheit) {
	super(name, vorname, mitarbeiternr, passwort);
	this.anwesenheit = anwesenheit;
}


}
