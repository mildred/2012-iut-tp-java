package tp2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

public class Appli {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InputStreamReader converter = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(converter);
		try {
		
			System.out.print("Nom [javax.swing.JButton] :");
			String nom = in.readLine();
			if(nom.equals("")) nom = "javax.swing.JButton";
			
			Class cls = Class.forName(nom);
			Class c = cls.getSuperclass();
			while(c != java.awt.Component.class && c != null) {
				c = c.getSuperclass();
			}
			if(c == null) {
				System.out.println("erreur java.awt.Component");
				return;
			}

			Method m[] = cls.getMethods();
			for (int i = 0; i < m.length; i++)
				System.out.println("-> " + i + " : " + m[i]);

			System.out.print("Méthode :");
			int n = Integer.parseInt(in.readLine());
			
			System.out.println(m[n]);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
