package tp4.exo2;

import javax.swing.JTree;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class SwingObserver2 extends MyTreeModelListenerAdapter
{
	public SwingObserver2()
	{
		MyFrame frame = new MyFrame();

		JTree tree = new JTree(); // créer l'arbre

		// Créer le modèle
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Exo2Tree");
		ExempleTreeModel myModel = new ExempleTreeModel(root);

		// Associer le modèle à l'arbre
		tree.setModel(myModel);

		// Autoriser l'édition des noms des noeuds
		tree.setEditable(true);
		
		// add listener
		myModel.addTreeModelListener(this);

		// Ajouter l'arbre au frame et affichage
		frame.ajouterTree(tree);
		frame.setVisible(true);
	}

	public static void main(String[] args)
	{
		SwingObserver test = new SwingObserver();
	}

	@Override
	public void treeNodesChanged(TreeModelEvent arg0) {
		System.out.println(arg0.getTreePath());
	}
}
