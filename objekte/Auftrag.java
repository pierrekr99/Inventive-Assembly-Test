package objekte;

import java.util.Comparator;
import java.util.ArrayList;

public class Auftrag {
	
	// kommentar von jani

//	Attribute
	private String auftragsnr;
	private String erstellungsdatum;
	private String frist;
	private String status;
	private String zuständigkeit; // angegeben durch Monteurexemplar.getMitarbeiternr();
	private String auftraggeber; // angegeben durch Auftraggeberexemplar.getKundennr();
	private ArrayList <Komponente> komponentennr;

	
	public Auftrag(String auftragsnr, String erstellungsdatum, String frist, String status, String zuständigkeit,
			String auftraggeber, ArrayList<Komponente> komponentennr) {
		super();
		this.auftragsnr = auftragsnr;
		this.erstellungsdatum = erstellungsdatum;
		this.frist = frist;
		this.status = status;
		this.zuständigkeit = zuständigkeit;
		this.auftraggeber = auftraggeber;
		this.komponentennr = komponentennr;
	}

	public String getAuftragsnr() {
		return auftragsnr;
	}

	public String getErstellungsdatum() {
		return erstellungsdatum;
	}

	public String getFrist() {
		return frist;
	}

	public String getStatus() {
		return status;
	}

	public String getZuständigkeit() {
		return zuständigkeit;
	}

	public String getAuftraggeber() {
		return auftraggeber;
	}

	public ArrayList<Komponente> getKomponentennr() {
		return komponentennr;
	}

//	@Override
//	public String toString() {
//		return "Auftrag [auftragsnr=" + auftragsnr + ", erstellungsdatum=" + erstellungsdatum + ", frist=" + frist
//				+ ", status=" + status + ", zuständigkeit=" + zuständigkeit + ", auftraggeber=" + auftraggeber
//				+ ", komponentennr=" + komponentennr + "]";
//	}
	
	public String toString() {
		return auftragsnr;
	}
	
	
	

}
