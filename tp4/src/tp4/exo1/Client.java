package tp4.exo1;

import javax.swing.JFrame;

public class Client extends JFrame
{
	private static final long	serialVersionUID	= -4587889840050997779L;
	private javax.swing.JPanel	jContentPane		= null;

	public Client(String nom)
	{
		super();
		initialize();
		this.setTitle(nom);
		this.setVisible(true);
	}

	private void initialize()
	{
		this.setSize(350, 75);
		this.setContentPane(getJContentPane());
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
}