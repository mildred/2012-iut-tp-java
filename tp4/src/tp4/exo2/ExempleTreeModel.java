/*
 * Created on 5 mars 2005
 * @author : Madjid KETFI LP - Programmation par composants
 */

package tp4.exo2;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;

/**
 * @author Madjid KETFI Nom : Description :
 */
public class ExempleTreeModel extends DefaultTreeModel
{
	private static final long	serialVersionUID	= -5615455056385171389L;

	public ExempleTreeModel(TreeNode root)
	{
		super(root);
		DefaultMutableTreeNode exo1 = new DefaultMutableTreeNode("Exo1");
		DefaultMutableTreeNode exo2 = new DefaultMutableTreeNode("Exo2");
		DefaultMutableTreeNode exo3 = new DefaultMutableTreeNode("Exo3");
		DefaultMutableTreeNode exo3_p1 = new DefaultMutableTreeNode("Partie1");
		DefaultMutableTreeNode exo3_p2 = new DefaultMutableTreeNode("Partie2");
		((DefaultMutableTreeNode) root).add(exo1);
		((DefaultMutableTreeNode) root).add(exo2);
		((DefaultMutableTreeNode) root).add(exo3);
		exo3.add(exo3_p1);
		exo3.add(exo3_p2);
	}
}
