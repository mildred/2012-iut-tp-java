/*
 * Created on 17 mars 2005
 * @author : Madjid KETFI
 */

package tp3;

/**
 * @author Madjid KETFI
 */
public class Automate
{
	private static Automate	automate	= null;
	private Banque			banque		= null;

	Automate(Banque banque)
	{
		this.banque = banque;
	}

	public static Automate creerAutomate(Banque banque)
	{
		if (automate == null)
			automate = new Automate(banque);
		return automate;
	}

	public void setBanque(Banque banque)
	{
		this.banque = banque;
	}

	/**
	 * Consulter un compte
	 * 
	 * @param code
	 *            du compte
	 * @return
	 */
	public int consulter(int code)
	{
		int solde = banque.consulter(code);
		return solde;
	}

	/**
	 * Créditer un compte
	 * 
	 * @param code
	 * @param somme
	 * @return
	 */
	public boolean crediter(int code, int somme)
	{
		boolean resultat = banque.crediter(code, somme);
		return resultat;
	}

	/**
	 * Débiter une somme d'un compte
	 * 
	 * @param code
	 * @param somme
	 * @return
	 */
	public boolean debiter(int code, int somme)
	{
		boolean resultat = banque.debiter(code, somme);
		return resultat;
	}
}