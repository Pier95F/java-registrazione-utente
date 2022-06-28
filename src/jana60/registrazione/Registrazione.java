package jana60.registrazione;

import java.util.Scanner;

public class Registrazione {

	public static void main(String[] args) throws Exception {
		
	/* Creare una classe Registrazione con metodo main in cui, tramite Scanner, vengono chieste le informazioni all’utente e si prova a creare un nuovo oggetto Utente.
	   Gestire tramite try e catch eventuali errori in fase di creazione in modo che il programma non si interrompa bruscamente ma chieda all’utente di inserire dei dati corretti. */
		
		String nome, cognome, mail, password;
		int eta;
		boolean procedi = false;
		
		// Importo lo scanner:
		
		Scanner scan = new Scanner (System.in);

		// Creo un ciclo do-while per richiedere i dati all'utente, con try e catch per gestire eventuali errori:
		
		do {
			
			try {
					System.out.println("Inserisci il nome: ");
					nome = scan.nextLine();
					
					System.out.println("Inserisci il cognome: ");
					cognome = scan.nextLine();
					
					System.out.println("Inserisci l'e-mail: ");
					mail = scan.nextLine();
					
					System.out.println("Inserisci la password: ");
					password = scan.nextLine();
					
					System.out.println("Inserisci l'età: ");
					eta = Integer.parseInt(scan.nextLine());
					
					Utente nuovoUtente = new Utente (nome, cognome, mail, password, eta);
					procedi = true;
					
					System.out.println(nuovoUtente.toString());
					
			} catch (NumberFormatException nfe) {
				
					System.out.println("Hai inserito un carattere non valido.");
					System.out.println(nfe.getMessage());
					
			} catch (Exception exc) {
		    	
		    		System.out.println("Errore: non è possibile registrare l'utente. Ritenta.");
		    		System.out.println(exc.getMessage());
		    		
		    }
		}while (!procedi);
		
		scan.close();
}
}
