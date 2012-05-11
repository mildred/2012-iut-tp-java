package tp2;

import java.awt.Component;
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

			Component o = (Component) cls.newInstance();
			DynamicInterface iface = new DynamicInterface();
			iface.setVisible(true);
			iface.add(o);

			Method methods[] = cls.getMethods();
			for (int i = 0; i < methods.length; i++)
				System.out.println("-> " + i + " : " + methods[i]);

			System.out.print("Méthode :");
			int n = Integer.parseInt(in.readLine());
			Method m = methods[n];
			System.out.println(m);
			
			Class types[] = m.getParameterTypes();
			Object args1[] = new Object[types.length];
			for (int i = 0; i < types.length; i++) {
				System.out.print("arg " + i + " " + types[i] + " : ");
				if(types[i] == String.class) {
					args1[i] = in.readLine();
				}else if(types[i] == Integer.class) {
					args1[i] = new Integer(in.readLine());
				} else {
					System.out.println("null");
					args1[i] = null;
				}
			}

			m.invoke(o, args1);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
