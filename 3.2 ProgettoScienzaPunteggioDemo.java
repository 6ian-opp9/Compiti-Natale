import java.util.Scanner;
public class ProgettoScienzaPunteggioDemo {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		
		//Inizializzo variabili
		
		System.out.print("Nome del Progetto: ");
		String NProg = s1.nextLine();
		
		System.out.print("Descrizione del Progetto: ");
		String Desc = s1.nextLine();
		
		System.out.print("Proprietario Progetto: ");
		String NomeP = s1.nextLine();
		
		System.out.print("Inserisci i punteggi per: ");
		
		System.out.println(" ");
		
		System.out.print("L'abilità creativa(max 30) :");
		double Creat = s2.nextDouble();
		
		System.out.print("Il valore Scientifico(max 15): ");
		double VSci = s2.nextDouble();
		
		System.out.print("La completezza(max 15): ");
		double Fin = s2.nextDouble();
		
		System.out.print("La chiarezza(max 10): ");
		double Chir = s2.nextDouble();
		
		
		//Creazione dell'oggetto
		ProgettoScienzaPunteggio Progetto = new ProgettoScienzaPunteggio(NProg, Desc, NomeP, Creat, VSci, Fin, Chir);
		
		System.out.println(" ");
		
		Progetto.Punteggio_Totale();
		
		Progetto.Stampa();
		
	}

}