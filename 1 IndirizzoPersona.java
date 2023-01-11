
public class IndirizzoPersona {

	private String nome;
	private String cognome;
	private String mail; 
	private long numCell;
	
	public IndirizzoPersona (String nome, String cognome, String mail, long numCell){
		this.nome = nome;
		this.cognome = cognome;
		this.mail = mail;
		this.numCell = numCell;		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public long getNumCell() {
		return numCell;
	}

	public void setNumCell(long numCell) {
		this.numCell = numCell;
	}
	
	/*
	 ===========================================================
	 */
	
	public void CambiaMail(String nMail) {
		mail = nMail;
	}
	
	public void CambiaCell(int nCell) {
		numCell = nCell;
	}
	
	public void to_string() {
		System.out.println(" ");
		System.out.println("Il nome della perosona e': " + nome);
		System.out.println("Il cognome della perosona e': " + cognome);
		System.out.println("La mail della perosona e': " + mail);
		System.out.println("Il numero della perosna e':  " + numCell);

	}

}