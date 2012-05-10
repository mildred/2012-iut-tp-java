package tp1;

public class CarreFactory implements FormeFactory {

	@Override
	public Forme creerForme() {
		return new Carre();
	}

}
