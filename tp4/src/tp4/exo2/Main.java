/*
 * Created on 3 mars 2005
 * @author : Madjid LP - Programmation par composants
 */

package tp4.exo2;

import tp4.exo1.MeteoModel;
import tp4.exo1.MyGUIView;


/**
 * @author Madjid Nom : Description :
 */
public class Main
{
	public static void main(String[] args)
	{
		MeteoModel model = new MeteoModel();
		MyGUIView guiView = new MyGUIView(model);
	}
}
