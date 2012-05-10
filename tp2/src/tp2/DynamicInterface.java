
package tp2;

import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 * Classe permettant de créer et afficher une fenêtre contenant un seul élément
 * graphique, ajouté via la méthode addElement.
 * 
 * @author Sofia Zaidenberg
 */
public class DynamicInterface extends JFrame
{
	private static final long	serialVersionUID	= -4497360239169255722L;
	private JPanel				jPanel;

	/**
	 * Constructeur par défaut. Se contente d'instancier la fenêtre, ne
	 * l'affiche pas et n'ajoute aucun élément graphique.
	 */
	public DynamicInterface()
	{
		setTitle("TP2");
		jPanel = new JPanel();
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jPanel.setLayout(new GridLayout(1, 1));
	}

	/**
	 * Permet d'ajouter l'élément graphique passé en argumenr à la fenêtre.
	 * S'occupe de la disposition de la fenêtre mais ne l'affiche pas.
	 * 
	 * @param instance
	 *            l'élément graphique à ajouter
	 */
	public void addElement(Component instance)
	{
		jPanel.add(instance);
		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 200,
								Short.MAX_VALUE));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 100,
								Short.MAX_VALUE));
		pack();
	}

	/**
	 * Permet d'afficher la fenêtre.
	 */
	public void afficher()
	{
		setVisible(true);
	}
}