/*
 * Created on 5 mars 2005
 * @author : Madjid KETFI LP - Programmation par composants
 */

package tp4.exo1;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JScrollBar;

/**
 * @author Madjid KETFI Nom : Description :
 */
public class MonAuditeur extends JFrame
{
	private static final long	serialVersionUID	= -8413226520808086107L;
	private javax.swing.JPanel	jContentPane	= null;

	public MonAuditeur()
	{
		super();
		initialize();
		this.setVisible(true);
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize()
	{
		this.setSize(300, 210);
		this.setContentPane(getJContentPane());
		this.setTitle("Vue Graphique");
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
		}
		return jContentPane;
	}

	public static void main(String[] args)
	{
		MonAuditeur test = new MonAuditeur();
	}
}