/*
 * Created on 5 mars 2005
 * @author : Madjid KETFI LP - Programmation par composants
 */

package tp4.exo2;

import javax.swing.JTree;
import javax.swing.event.TreeModelEvent;
import javax.swing.tree.DefaultMutableTreeNode;


/**
 * @author Madjid KETFI Nom : Description :
 */
public class SwingObserver
{
	public SwingObserver()
	{
		MyFrame frame = new MyFrame();

		JTree tree = new JTree(); // cr�er l'arbre

		// Cr�er le mod�le
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Exo2Tree");
		ExempleTreeModel myModel = new ExempleTreeModel(root);

		// Associer le mod�le � l'arbre
		tree.setModel(myModel);

		// Autoriser l'�dition des noms des noeuds
		tree.setEditable(true);

		// Ajouter l'arbre au frame et affichage
		frame.ajouterTree(tree);
		frame.setVisible(true);
	}

	public static void main(String[] args)
	{
		SwingObserver test = new SwingObserver();
	}
}
