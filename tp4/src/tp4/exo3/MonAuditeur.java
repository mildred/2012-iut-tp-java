/*
 * Created on 5 mars 2005
 * @author : Madjid KETFI LP - Programmation par composants
 */

package tp4.exo3;

import java.awt.Color;
import java.awt.Graphics;
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
public class MonAuditeur extends JFrame
{
	private static final long	serialVersionUID	= -8413226520808086107L;
	private javax.swing.JPanel	jContentPane	= null;
	private int x = 0;
	private int y = 0;

	public MonAuditeur()
	{
		super();
		initialize();
		this.setVisible(true);
		this.addMouseMotionListener(new MouseMotionListener(){

			@Override
			public void mouseDragged(MouseEvent e) {
				dragMouse(e.getX(), e.getY());
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				moveMouse(e.getX(), e.getY());
			}
			
		});
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
			jContentPane = new javax.swing.JPanel(){
				public void paintComponent(Graphics g) {
			        super.paintComponent(g);       
			        g.drawString("X", x, y);
			    }
			};
			jContentPane.setLayout(null);
		}
		return jContentPane;
	}

	public static void main(String[] args)
	{
		MonAuditeur test = new MonAuditeur();
	}
	
	private void dragMouse(int x, int y){
		this.x = x;
		this.y = y;
		jContentPane.repaint();
		this.setTitle("Mouse Dragged: " + Integer.toString(x) + " - " + Integer.toString(y));
	}
	
	private void moveMouse(int x, int y){
		this.x = x;
		this.y = y;
		jContentPane.repaint();
		this.setTitle("Mouse Moved: " + Integer.toString(x) + " - " + Integer.toString(y));
	}

}