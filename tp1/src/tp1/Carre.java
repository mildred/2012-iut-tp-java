package tp1;

public class Carre implements Forme {

	private String offset = ""; 

	@Override
	public void setOffset(int n) {
		offset = new String(new char[n]).replace("\0", " ");
	}

	@Override
	public void afficher() {
		System.out.println(offset + "***");
		System.out.println(offset + "***");
		System.out.println(offset + "***");
	}

}
