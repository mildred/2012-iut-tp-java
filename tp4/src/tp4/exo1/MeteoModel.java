/*
 * Created on 3 mars 2005
 * @author : Madjid KETFI LP - Programmation par composants
 */

package tp4.exo1;

import java.util.Observable;

/**
 * @author Madjid KETFI Nom : MeteoModel Description : représente le modèle
 *         de données météo
 */
public class MeteoModel extends Observable
{
	private int	tempVille1	= 0;
	private int	tempVille2	= 0;
	private int	tempVille3	= 0;

	/**
	 * @return Returns the tempVille1.
	 */
	public int getTempVille1()
	{
		return tempVille1;
	}

	/**
	 * @param tempVille1
	 *            The tempVille1 to set.
	 */
	public void setTempVille1(int tempVille1)
	{
		if (tempVille1 < -20 || tempVille1 > 20)
			return;
		this.tempVille1 = tempVille1;
		setChanged();
		notifyObservers();
	}

	/**
	 * @return Returns the tempVille2.
	 */
	public int getTempVille2()
	{
		return tempVille2;
	}

	/**
	 * @param tempVille2
	 *            The tempVille2 to set.
	 */
	public void setTempVille2(int tempVille2)
	{
		if (tempVille2 < -20 || tempVille2 > 20)
			return;
		this.tempVille2 = tempVille2;
		setChanged();
		notifyObservers();
	}

	/**
	 * @return Returns the tempVille2.
	 */
	public int getTempVille3()
	{
		return tempVille3;
	}

	/**
	 * @param tempVille2
	 *            The tempVille2 to set.
	 */
	public void setTempVille3(int tempVille3)
	{
		if (tempVille3 < -20 || tempVille3 > 20)
			return;
		this.tempVille3 = tempVille3;
		setChanged();
		notifyObservers();
	}
}
