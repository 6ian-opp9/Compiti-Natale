public class Persona {
	
	private String Nome;
	private int Eta;
	
	

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getEta() {
		return Eta;
	}

	public void setEta(int eta) {
		Eta = eta;
	}

	//============================================================================================================================================

	public void Verifiche(String Nome_F, String Nome_S, int Eta_F, int Eta_S) {
		
		if (Nome_F.equals(Nome_S) & Eta_F == Eta_S) {
			
			System.out.println("Le due persone hanno nome e età uguali");
		}
		else if (Nome_F.equals(Nome_S)) {
			
			System.out.println("Le due persone hanno solo il nome uguale");
		}
		else if (Eta_F == Eta_S) {
			
			System.out.println("Le due persone hanno solo l'età uguale");
		}
		else {
			
			System.out.println("Le due persone non hanno niente in comune");
		}
	}
	
	public void Anzianita (String Nome_F, String Nome_S, int Eta_F, int Eta_S) {
		if (Eta_F >  Eta_S) {
			
			System.out.println(Nome_F + " è più anziano di " + Nome_S);
		}
		else if (Eta_F <  Eta_S) {
			
			System.out.println(Nome_F + " è più giovane di " + Nome_S);
		}
	}
}
