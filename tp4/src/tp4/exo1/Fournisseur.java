package tp4.exo1;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Fournisseur extends JFrame
{
	private static final long	serialVersionUID	= -4089633633824821356L;
	private javax.swing.JPanel	jContentPane		= null;
	private javax.swing.JButton	jButton				= null;

	public Fournisseur()
	{
		super();
		initialize();
		this.setVisible(true);
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
	// TODO
	}
}