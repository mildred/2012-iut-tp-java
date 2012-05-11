/*
 * Created on 5 mars 2005
 * @author : Madjid KETFI LP - Programmation par composants
 */

package tp4.exo2;

import javax.swing.JFrame;

import javax.swing.JTree;
import javax.swing.JScrollPane;

/**
 * @author Madjid KETFI Nom : Description :
 */
public class MyFrame extends JFrame
{
	private static final long	serialVersionUID	= 7270048033577675692L;
	private javax.swing.JPanel	jContentPane		= null;
	private JScrollPane			jScrollPane			= null;

	/**
	 * This is the default constructor
	 */
	public MyFrame()
	{
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize()
	{
		this.setSize(330, 200);
		this.setContentPane(getJContentPane());
		this.setTitle("Swing Exemple");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private javax.swing.JPanel getJContentPane()
	{
		if (jContentPane == null)
		{
			jContentPane = new javax.swing.JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getJScrollPane(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jScrollPane
	 * 
	 * @return javax.swing.JScrollPane
	 */
	private JScrollPane getJScrollPane()
	{
		if (jScrollPane == null)
		{
			jScrollPane = new JScrollPane();
			jScrollPane.setBounds(6, 5, 167, 156);
		}
		return jScrollPane;
	}

	/**
	 * Une simple m�tode qui permet d'ajouter l'arbre � l'interface graphique
	 * 
	 * @param tree
	 *            l'arbre � ajouter
	 */
	public void ajouterTree(JTree tree)
	{
		jScrollPane.setViewportView(tree);
	}
}
