/*
 * Created on 17 mars 2005
 * @author : Madjid KETFI
 */

package tp3b;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Madjid KETFI
 */
public class Compte implements Serializable
{
	private int		code		= 0;
	private String	client		= null;
	private Date	d_ouverture	= null;
	private int		solde		= 0;

	public Compte()
	{}

	public Compte(int code, String client)
	{
		this.code = code;
		this.client = client;
		this.d_ouverture = Calendar.getInstance().getTime();
	}

	/**
	 * Consulter le compte
	 * 
	 * @return
	 */
	public int getCode()
	{
		return this.code;
	}

	/**
	 * Consulter le compte
	 * 
	 * @return
	 */
	public int consulter()
	{
		return this.solde;
	}

	/**
	 * Créditer le compte
	 * 
	 * @param somme
	 * @return
	 */
	public boolean crediter(int somme)
	{
		this.solde += somme;
		return true;
	}

	/**
	 * Débiter une somme de ce compte
	 * 
	 * @param somme
	 * @return
	 */
	public boolean debiter(int somme)
	{
		if (somme < this.solde)
		{
			this.solde -= somme;
			return true;
		}
		return false;
	}
}