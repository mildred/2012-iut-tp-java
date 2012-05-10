package tp1;

public class RondFactory implements FormeFactory {

	@Override
	public Forme creerForme() {
		return new Rond();
	}

}
