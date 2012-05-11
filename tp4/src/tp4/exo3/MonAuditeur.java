/*
 * Created on 5 mars 2005
 * @author : Madjid KETFI LP - Programmation par composants
 */

package tp4.exo3;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JScrollBar;

/**
 * @author Madjid KETFI Nom : Description :
 */
public class MonAuditeur extends JFrame implements MouseMotionListener
{
	private static final long	serialVersionUID	= -8413226520808086107L;
	private javax.swing.JPanel	jContentPane	= null;

	public MonAuditeur()
	{
		super();
		initialize();
		this.setVisible(true);
		this.addMouseMotionListener(this);
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

	@Override
	public void mouseDragged(MouseEvent e) {
		this.setTitle("Mouse Dragged: " + Integer.toString(e.getX()) + " - " + Integer.toString(e.getY()));
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		this.setTitle("Mouse Moved: " + Integer.toString(e.getX()) + " - " + Integer.toString(e.getY()));
	}

}