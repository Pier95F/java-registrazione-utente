package jana60.registrazione;

public class Utente {

	/* 	Creare una classe Utente con attributi nome, cognome, email, password ed età.
		Aggiungere un costruttore con parametri e metodi getter e setter.
		Implementare dei metodi di validazione in modo che:
		
		- email contenga un carattere @ e un .
		- password sia lunga tra 8 e 12 caratteri
		- età sia maggiore di 18 anni
		
		In caso i parametri non siano validi, impedire che vengano valorizzati gli attributi nei metodi e nel costruttore, sollevando opportune eccezioni. */

	// Definisco gli attributi della classe:
		
	private String nome, cognome, email, password;
	private int eta;
	
	// Costruttori:
	
	public Utente(String nome, String cognome, String email, String password, int eta) throws Exception {
		
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
		this.eta = eta;
		
		this.validaMail();
		this.validaPassword();
		this.validaEta();
		
	}
	
	// Imposto i getter e i setter:

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}
	
	// Definisco i metodi di validazione per gli input dell'utente:
	
	public void validaMail() throws Exception {
		
		if(!email.contains("@") || !email.contains("."))
				throw new Exception ("L'email deve contenere una @ e almeno un .");
	}
	
	public void validaPassword() throws Exception {
		
		if(password.length() <8 || password.length() >12)
				throw new Exception ("La lunghezza della password deve essere compresa tra 8 e 12 caratteri");
	}
	
	public void validaEta() throws Exception {
		
		if (eta<18)
			throw new Exception ("L'utente deve essere maggiorenne");
	}
	
	@Override
	public String toString() {
		
		return "Nuovo utente: " + nome + " " + cognome + "\nE-mail: " + email + "\nPassword: " + password + "\nEta: " + eta + " anni";
	}
	
	

}
