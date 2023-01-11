import java.util.Scanner;
public class PunteggioDemo {

	public static void main(String[] args) {
				
		String sentinella;
		
		do {
			
			Scanner s1 = new Scanner(System.in);
			Scanner s2 = new Scanner(System.in);
			
			System.out.println(" ");
			
			System.out.print("Inserire descrizione attivita': ");
			String desc = s1.nextLine();
			
			System.out.print("Inserire il punteggio massimo: ");
			int maxPunt = s2.nextInt();
			
			System.out.print("Inserire il punteggio corrente: ");
			int punt  = s2.nextInt();
			
			if (punt > maxPunt) {
				
				System.out.println(" ");
				
				System.out.println("Il punteggio supera il punteggio massimo.");
				
				break;
			}
			
			Punteggio s3 = new Punteggio (desc, punt, maxPunt);
			
			s3.OttieniPunteggio(punt);
			
			System.out.println(" ");
			
			System.out.println("Che cosa si desidera fare?");
			System.out.println(" ");
			System.out.println("Digitare 1 per cambiare il punteggio.");
			System.out.println("Digitare 2 per vedere il masimo punteggio disponibile. ");
			
			int scelta = s2.nextInt();

			switch(scelta) {
			
			case 1:
				
				System.out.println("Inserire il nuovo punteggio: ");
				int npunt = s2.nextInt();
				
				if (s3.Punt(npunt) == true) {
					System.out.println("Il nuovo punteggio è: " + npunt);
				}
				else {
					System.out.println("Il punteggio inserito è troppo grande.");
				}
				
				System.out.println(" ");
				
				System.out.println(s3.punt_print());
				
				break;
				
			case 2:

				System.out.println(" ");
				
				System.out.println("Il punteggio massimo è: " + s3.MaxPunt());
				
				System.out.println(" ");
				
				System.out.println(s3.punt_print());
				
				break;
				
			default: 
				
				System.out.println("Selezione sbagliata.");
				
				break;
				
			}
			
			System.out.println(" ");
			
			System.out.println("Se si desidera fare altre operazioni digitare 'si' altimenti, no.");
			sentinella = s1.next();

		}while (sentinella.equals("si"));	
		
		
	}
}