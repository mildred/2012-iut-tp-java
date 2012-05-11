/*
 * Created on 3 mars 2005
 * @author : Madjid LP - Programmation par composants
 */

package tp4.exo1;



/**
 * @author Madjid Nom : Description :
 */
public class Main
{
	public static void main(String[] args)
	{
		MeteoModel model = new MeteoModel();
		MyGUIView guiView = new MyGUIView(model);
		MyView view = new MyView(model);
	}
}
