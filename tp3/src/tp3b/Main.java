package tp3b;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// créer une banque
		Banque banque = new Banque("Crédit pour Tous");

		// créer quelques comptes
		banque.ajouterCompte(1001, "client1");
		banque.ajouterCompte(1002, "client2");
		banque.ajouterCompte(1003, "client3");

		// créer un automate et l'associer à la banque
		Automate automate = new Automate(banque);

		// créer l'utilisateur de l'ATM
		Utilisateur user = new Utilisateur(automate);

		// créer un administrateur de la banque
		Administrateur admin = new Administrateur(banque, automate);
	}

}
