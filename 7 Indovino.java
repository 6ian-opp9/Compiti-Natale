public class Indovino {
	
	private String Parola;
	private int Fatti;
	private int Scorretti;
	private String Scoperta;
	
	public Indovino(String parola) {
		
		this.Parola = parola;
		this.Fatti = 0;
		this.Scorretti = 0;
		for(int i = 0; i < parola.length(); i++) {
			
			Scoperta = Scoperta + "?";
		}
	}
	
	public void Find(char z) {
		
		System.out.println(Scoperta);
		
		for(int i = 0; i < Parola.length(); i++) {
			
			if(Parola.charAt(i) != z) {
				Scorretti++;
			}
			else {
				
				Scoperta.replace(Scoperta.charAt(i), z);
			}
		}
		Fatti++;
		
	}
	public String get_ParolaScoperta(){
		return Scoperta;
	}
	public int get_NumeroTentativi() {
		return Fatti;
	}
	public boolean Indovinata() {
		
		if(Scoperta.equals (Parola)) {
			
			return false;
		}
		else {
			
			return true;
		}

	}
	public void to_String() {
		
		System.out.println("La parola da scoprire era " + Parola + " , dopo " + Fatti + " tentativi di cui " + Scorretti + " incorretti hai indovinato");
	}
}