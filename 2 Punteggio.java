public class Punteggio {

	private String descrizione;
	private int maxScore;
	private int score;
	
	public Punteggio (String descrizione, int maxScore, int score) {
		this.descrizione = descrizione;
		this.maxScore = maxScore;
		this.score = score;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getMaxScore() {
		return maxScore;
	}

	public void setMaxScore(int maxScore) {
		this.maxScore = maxScore;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	/*
	 ===========================================================
	 */
	
	public void OttieniPunteggio (int punt) { // assegna un punteggio dato dall'utente
		score = punt;
	}
	
	public int MaxPunt() { // massimo punteggio disponibile
		return maxScore;
	}
	
	public boolean Punt (int score2) { // assegnazione punteggio 
	
		boolean check;
		
		if (score2 > MaxPunt()) {
			check = false;
		}
		else {
			check = true;
		}
		 
		return check;
	}
	
	public String punt_print () { //comunica il punteggio 
		
		String out = "Descrizione: " + descrizione + "\nIl punteggio sino ad ora e': " + score ;
		
		return out;
	}
	
}