
package tp1;

/**
 * @author e-veyren
 */
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

/**
 * Cette classe représente un serveur pour l'encodage et le décodage de codes
 * Morse
 */
public class Serveur implements IServeur
{
	private Hashtable<Character, String>	hMorse	= new Hashtable<Character, String>(47);

	public Serveur()
	{
		initHMorse();
	}

	/**
	 * Initialiser les codes Morse
	 */
	private void initHMorse()
	{
		hMorse.put(new Character('A'), ".-");
		hMorse.put(new Character('B'), "-...");
		hMorse.put(new Character('C'), "-.-.");
		hMorse.put(new Character('D'), "-..");
		hMorse.put(new Character('E'), ".");
		hMorse.put(new Character('F'), "..-.");
		hMorse.put(new Character('G'), "--.");
		hMorse.put(new Character('H'), "....");
		hMorse.put(new Character('I'), "..");
		hMorse.put(new Character('J'), ".---");
		hMorse.put(new Character('K'), "-.-");
		hMorse.put(new Character('L'), ".-..");
		hMorse.put(new Character('M'), "--");
		hMorse.put(new Character('N'), "-.");
		hMorse.put(new Character('O'), "---");
		hMorse.put(new Character('P'), ".--.");
		hMorse.put(new Character('Q'), "--.-");
		hMorse.put(new Character('R'), ".-.");
		hMorse.put(new Character('S'), "...");
		hMorse.put(new Character('T'), "-");
		hMorse.put(new Character('U'), "..-");
		hMorse.put(new Character('V'), "...-");
		hMorse.put(new Character('W'), ".--");
		hMorse.put(new Character('X'), "-..-");
		hMorse.put(new Character('Y'), "-.--");
		hMorse.put(new Character('Z'), "--..");
		hMorse.put(new Character('1'), ".----");
		hMorse.put(new Character('2'), "..---");
		hMorse.put(new Character('3'), "...--");
		hMorse.put(new Character('4'), "....-");
		hMorse.put(new Character('5'), ".....");
		hMorse.put(new Character('6'), "-....");
		hMorse.put(new Character('7'), "--...");
		hMorse.put(new Character('8'), "---..");
		hMorse.put(new Character('9'), "----.");
		hMorse.put(new Character('0'), "-----");
		hMorse.put(new Character('.'), ".-.-.-");
		hMorse.put(new Character(','), "--..--");
		hMorse.put(new Character(':'), "---...");
		hMorse.put(new Character('?'), "..--..");
		hMorse.put(new Character('\''), ".----.");
		hMorse.put(new Character('-'), "-....-");
		hMorse.put(new Character('/'), "-..-.");
		hMorse.put(new Character('('), "-.--.-");
		hMorse.put(new Character(')'), "-.--.-");
		hMorse.put(new Character('"'), ".-..-.");
		hMorse.put(new Character(' '), " ");
	}

	/**
	 * Permet d'encoder un texte fourni en argument
	 */
	public String encode(String message)
	{
		String code = new String();
		for (int i = 0; i < message.length(); i++)
		{
			String tok = hMorse.get(new Character(message.charAt(i)));
			code += tok + " ";
		}

		/* A Compléter */

		return code;
	}

	/**
	 * Permet de retourner le texte qui correspond à une suite de codes Morse
	 * fournis en arguments (sous forme d'une chaine)
	 */
	public String decode(String code)
	{
		String array[] = split(code);
		String message = new String();
		Set<Entry<Character, String>> sMorse = hMorse.entrySet();

		for (int i = 0; i < array.length; i++)
		{
			for (Iterator<Entry<Character, String>> it = sMorse.iterator(); it.hasNext();)
			{
				Entry<Character, String> entry = it.next();
				if ((entry.getValue()).equals(array[i]))
				{
					message += entry.getKey();
					break;
				}
			}
		}
		return message;
	}

	/**
	 * Découpe une chaine représentant une suite de codes morse en plusieurs
	 * items (codes)
	 */
	private String[] split(String code)
	{
		ArrayList<String> list = new ArrayList<String>();
		int i = 0;
		while (i < code.length())
		{
			String token = new String();
			while (i < code.length() && code.charAt(i) != ' ')
			{
				token += code.charAt(i++);
			}
			list.add(token);
			int j = 0;
			while (i < code.length() && code.charAt(i) == ' ')
			{
				i++;
				j++;
			}
			if (j > 1)
				list.add(new String(" "));
		}
		String array[] = new String[list.size()];
		i = 0;
		for (Iterator<String> it = list.iterator(); it.hasNext();)
			array[i++] = it.next();
		return array;
	}
}