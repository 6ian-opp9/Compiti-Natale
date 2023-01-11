import java.util.Scanner;
public class IndovinoDemo {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("Inserisci la parola da indovinare: ");
		String incognita = s1.next();

            System.out.println(" ");
		
		Indovino gioco = new Indovino(incognita);
		
		System.out.println("Indovina la parola!!!");
		
		do {
			System.out.println("Scegli una lettera");
			String par = s1.next();
			
			char c = par.charAt(0);
			
			gioco.Find(c);
			
			gioco.get_ParolaScoperta();
			
		}while(gioco.Indovinata());
		
		gioco.to_String();
	}

}
