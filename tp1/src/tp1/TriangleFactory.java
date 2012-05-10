package tp1;

public class TriangleFactory implements FormeFactory {

	@Override
	public Forme creerForme() {
		return new Triangle();
	}

}
