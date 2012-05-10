package tp1;

public class ClientDessin {

	private FormeFactory factory;
	
	public void setFactory(FormeFactory factory) {
		this.factory = factory;
	}
	
	public void afficherFormes(){
		Forme forme = factory.creerForme();
		forme.afficher();
		forme.setOffset(8);
		forme.afficher();
		forme.setOffset(16);
		forme.afficher();
	}
	
}
