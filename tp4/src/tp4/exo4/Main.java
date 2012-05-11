package tp4.exo4;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fournisseur f = new Fournisseur();
		Client c1 = new Client("Client 1");
		f.addMAJListener(c1);
		Client c2 = new Client("Client 2");
		f.addMAJListener(c2);
		Client c3 = new Client("Client 3");
		f.addMAJListener(c3);
	}

}
