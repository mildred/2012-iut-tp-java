package tp1;

import java.util.Scanner;

public class Appli {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClientDessin c = new ClientDessin();
		Scanner in = new Scanner(System.in);

		FormeFactory f;
		
			while(true) {
			
			System.out.println("****** Application de dessin de formes ******");
			System.out.println("*** Menu :");
			System.out.println("1 : Dessiner des triangles");
			System.out.println("2 : Dessiner des carrés");
			System.out.println("3 : Dessiner des ronds");
			System.out.println("4 : Dessiner la forme précédante");
			System.out.println("5 : Quitter");
			System.out.println("*** Faites votre choix :");
			int n = in.nextInt();
			
			switch(n) {
			case 1:
				c.setFactory(new TriangleFactory());
				c.afficherFormes();
				break;
			case 2:
				c.setFactory(new CarreFactory());
				c.afficherFormes();
				break;
			case 3:
				c.setFactory(new RondFactory());
				c.afficherFormes();
				break;
			case 4:
				c.afficherFormes();
				break;
			case 5:
				return;
			}
		
		}
		
	}

}
