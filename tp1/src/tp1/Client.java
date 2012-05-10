package tp1;

public class Client {
	private IServeur serveur = null;
	
	public Client(ISFabrique fabrique) {
		serveur = fabrique.creerServeur();
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
		ISFabrique fabrique = new SFabrique();
		Client client1 = new Client(fabrique);
		client1.appelerServeur();
	}

}
