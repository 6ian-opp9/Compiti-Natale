import java.util.Scanner;
public class IndirizzoPersonaDemo {

	public static void main (String [] Args) {
		
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		String sentinella;
		
		System.out.print("Inserisci il nome della perosna: ");
		String nome = s1.nextLine();
		
		System.out.print("Inserisci il cognome della perosna: ");
		String cognome = s1.nextLine();
		
		System.out.print("Inserisci l'e-mail della persona: ");
		String mail = s1.nextLine();
		
		System.out.print("Inserisci il numero cellulare della perosna: ");
		long cell = s2.nextLong();
		
		IndirizzoPersona s3 = new IndirizzoPersona (nome, cognome, mail, cell);
		
		s3.to_string();
		
		System.out.println("Che cosa si desidera fare? ");
		System.out.println(" ");
		System.out.println("Digitare 1 per cambiare la mail.");
		System.out.println("Digitare 2 per cambiare il numero di telefono.");
		System.out.println(" ");
		
		int scelta = s2.nextInt();		
		
		System.out.println(" ");
		
		do {
			switch (scelta) {
			
			case 1: 
				
				System.out.print("Inserire la nuova mail: ");
				String nmail = s1.nextLine();
				
				s3.CambiaMail(nmail);
				
				s3.to_string();
				
				break;
				
			case 2:
				
				System.out.print("Inserire il nuovo numero: ");
				int nCell = s2.nextInt();
				
				s3.CambiaCell(nCell);
				
				s3.to_string();
				
				break;
				
			default:
				
				System.out.println("Inserimento sbaglito.");
				
				break;
			
		    }

			System.out.println(" ");
			
			System.out.println("Se si desidera fare altre operazioni digitare si altimenti, no.");
			sentinella = s1.next();
			
			System.out.println(" ");
			
		}while (sentinella.equals("si"));
	}
}