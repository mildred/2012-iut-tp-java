/**
 * 
 */

package tp2;

import java.lang.reflect.Method;

/**
 * @author e-veyren
 */
public class ExempleReflexion
{
	public static void main(String[] args)
	{
		Class<Serveur> clsServ = Serveur.class;

		// déterminer l'objet "Class" qui correspond au serveur
		try
		{
			Method encodeM = clsServ.getDeclaredMethod("encode", new Class[] {String.class});

			// appeler la méthode
			if (encodeM != null)
			{
				String message = new String("MON DEUXIEME TP");
				String code = (String) encodeM.invoke(new Serveur(), new Object[] {message});

				System.out.println("Résultat : " + code);
			}
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}