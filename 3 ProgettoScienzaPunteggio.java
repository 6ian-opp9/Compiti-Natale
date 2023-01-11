public class ProgettoScienzaPunteggio {
	
	String Nome_Progetto;
	String Ide_Prg;
	String Nome_P;
	double Ab_Cr;
	double Va_Scient;
	double Compl;
	double Chiar;
	
	public ProgettoScienzaPunteggio(String Nome_Progetto, String Ide_Prg, String Nome_P, double Ab_Cr, double Va_Scient, double Compl, double Chiar) {
		
		this.Nome_Progetto = Nome_Progetto;
		this.Ide_Prg = Ide_Prg;
		this.Nome_P = Nome_P;
		this.Ab_Cr = Ab_Cr;
		this.Va_Scient = Va_Scient; 
		this.Compl = Compl;
		this.Chiar = Chiar;
	}

	
	public String getNome_Progetto() {
		return Nome_Progetto;
	}

	public void setNome_Progetto(String nome_Progetto) {
		Nome_Progetto = nome_Progetto;
	}

	public String getIde_Prg() {
		return Ide_Prg;
	}

	public void setIde_Prg(String ide_Prg) {
		Ide_Prg = ide_Prg;
	}

	public String getNome_P() {
		return Nome_P;
	}

	public void setNome_P(String nome_P) {
		Nome_P = nome_P;
	}

	public double getAb_Cr() {
		return Ab_Cr;
	}

	public void setAb_Cr(double ab_Cr) {
		Ab_Cr = ab_Cr;
	}

	public double getVa_Scient() {
		return Va_Scient;
	}

	public void setVa_Scient(double va_Scient) {
		Va_Scient = va_Scient;
	}

	public double getCompl() {
		return Compl;
	}

	public void setCompl(double compl) {
		Compl = compl;
	}

	public double getChiar() {
		return Chiar;
	}

	public void setChiar(double chiar) {
		Chiar = chiar;
	}


	//============================================================================================================================================

	//Stampa dalla classe punteggio
	public void Punteggio_Totale() {
		Punteggio ris = new Punteggio(Ide_Prg);

		ris.setVoto (Ab_Cr + Va_Scient + Compl + Chiar);
		ris.Print();
	}
	
	//Stampa caratteristiche 
	public void Stampa() {
		
		System.out.println("Nome progetto: " + Nome_Progetto + "\n Descrizione progetto: " + Ide_Prg + "\n Autore: " + Nome_P +
				"\n Punteggi: \n -abilità creativa: " + Ab_Cr + "\n -valore scientifico: " + Va_Scient + "\n -completezza: " + Compl + "\n -chiarezza: " + Chiar + 
				"\n Totale: " + (Ab_Cr + Va_Scient + Compl + Chiar) + "/70");
	}
	
}