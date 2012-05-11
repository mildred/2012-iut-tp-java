package tp4.exo4;

import java.util.EventObject;

public class MAJEvent extends EventObject {

	public String nom;
	public int version;
	public int taille;
	public String URL;
	
	public MAJEvent(Object source, String n, int v, int t, String u) {
		super(source);
		nom = n;
		version = v;
		taille = t;
		URL = u;
	}
	
	public String getNom() { return nom; }
	public int    getVer() { return version; }
	public int    getTai() { return taille; }
	public String getURL() { return URL; }
}
