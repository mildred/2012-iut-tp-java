package tp4.exo4;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Fournisseur extends JFrame
{
	private static final long	serialVersionUID	= -4089633633824821356L;
	private javax.swing.JPanel	jContentPane		= null;
	private javax.swing.JButton	jButton				= null;
	private ArrayList<MAJListener> listeners;

	public Fournisseur()
	{
		super();
		listeners = new ArrayList<MAJListener>();
		initialize();
		this.setVisible(true);
	}

	public void addMAJListener(MAJListener l) {
		listeners.add(l);
	}

	public void removeMAJListener(MAJListener l) {
		listeners.remove(l);
	}
	
	private void initialize()
	{
		this.setSize(150, 75);
		this.setContentPane(getJContentPane());
		this.setTitle("Fournisseur");
		jContentPane.add(getJButton(), null);
	}

	private javax.swing.JPanel getJContentPane()
	{
		if (jContentPane == null)
		{
			jContentPane = new javax.swing.JPanel();
			jContentPane.setLayout(null);
		}
		return jContentPane;
	}

	private JButton getJButton()
	{
		if (jButton == null)
		{
			jButton = new JButton();
			jButton.setBounds(0, 0, 124, 28);
			jButton.setText("Mise-à-jour");
			jButton.addActionListener(new java.awt.event.ActionListener()
			{
				public void actionPerformed(java.awt.event.ActionEvent e)
				{
					boutonClique();
				}
			});
		}
		return jButton;
	}

	private void boutonClique()
	{
		notifier();
	}
	
	private void notifier()
	{
		MAJEvent evt = new MAJEvent(this, "Test", 1, 1, "URL");
		for(MAJListener l : listeners) {
			l.evenementRecu(evt);
		}
	}
}