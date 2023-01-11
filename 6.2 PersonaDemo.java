import java.util.Scanner;
public class PersonaDemo {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		Persona Pers1 = new Persona();
		Persona Pers2 = new Persona();
		
		System.out.print("Inserisci il nome della prima persona: ");
		Pers1.setNome(s1.next());
		
		System.out.print("Inserisci l'età: ");
		Pers1.setEta(s1.nextInt());
		
		System.out.print("Inserisci il nome della seconda persona: ");
		Pers2.setNome(s1.next());
		
		System.out.print("Inserisci l'età: ");
		Pers2.setEta(s1.nextInt());
		
		System.out.println(" ");
		
		Pers1.Verifiche (Pers1.getNome(), Pers2.getNome(), Pers1.getEta(), Pers2.getEta());
		
		Pers1.Anzianita (Pers1.getNome(), Pers2.getNome(), Pers1.getEta(), Pers2.getEta());
	}

}
