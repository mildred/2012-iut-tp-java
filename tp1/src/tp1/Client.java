package tp1;

public class Client {
	private IServeur serveur = null;
	
	public Client() {
		serveur = new Serveur();
	}
	
	public void appelerServeur() {
		System.out.println("\t*** Appel du Serveur ***");
		String message = new String("MON PREMIER TP");
		String codeResultat = serveur.encode(message);
		System.out.println("Message initial : " + message);
		System.out.println("Code résultat : " + codeResultat);
		String messageResultat = serveur.decode(codeResultat);
		System.out.println("Message résultat : " + messageResultat);
	}
	
	public static void main(String[] args) {
		Client client1 = new Client();
		client1.appelerServeur();
	}

}
