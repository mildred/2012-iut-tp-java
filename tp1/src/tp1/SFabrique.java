package tp1;

public class SFabrique implements ISFabrique {

	@Override
	public IServeur creerServeur() {
		return new Serveur();
	}

}
