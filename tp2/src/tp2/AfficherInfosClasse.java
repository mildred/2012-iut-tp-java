package tp2;

import java.lang.reflect.*;

public class AfficherInfosClasse {
	public static void main(String[] args)
	{
		if (args.length != 2)
		{
			System.out.println("Nombre d'arguments incorrect !");
			System.out.println("Usage : java AfficherInfosClasse classe [a|m|i]");
			return;
		}
		try
		{
			Class cls = Class.forName(args[0]);
			if (args[1].equals("a")) // attributs
			{
				Field fields[] = cls.getDeclaredFields();
				for (int i = 0; i < fields.length; i++)
					System.out.println("-> " + fields[i]);
			}
			else if (args[1].equals("m")) // methods
			{
				Method fields[] = cls.getDeclaredMethods();
				for (int i = 0; i < fields.length; i++)
					System.out.println("-> " + fields[i]);
			}
			else if (args[1].equals("i")) // interfaces
			{
				Class[] fields = cls.getInterfaces();
				for (int i = 0; i < fields.length; i++)
					System.out.println("-> " + fields[i]);
			}
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
