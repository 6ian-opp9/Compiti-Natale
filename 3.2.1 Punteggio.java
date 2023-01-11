
public class Punteggio {
	
	private String descrizione;
	private double voto;
	private int max;
	
	public Punteggio(String descrizione) {
		this.descrizione=descrizione;
		this.max=70;
	}
	
	public void setVoto(double voto) {
		this.voto=voto;
	}
	
	public String massimo() {
		String ret = "Il voto massimo possibile è " + max + " stelle";
		return ret;
	}
	
	public String Print() {
		String ret =  "Il tuo voto è " + voto + " / " + max;
		return ret;
	}

}
