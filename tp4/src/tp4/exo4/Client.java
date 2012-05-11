package tp4.exo4;

import java.text.DateFormat;
import java.util.Date;

import javax.swing.JFrame;

public class Client extends JFrame implements MAJListener
{
	private static final long	serialVersionUID	= -4587889840050997779L;
	private javax.swing.JPanel	jContentPane		= null;
	private int num;

	public Client(String nom)
	{
		super();
		num = 0;
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

	@Override
	public void evenementRecu(MAJEvent evt) {
		num++;
		DateFormat f = DateFormat.getInstance();
		setTitle(Integer.toString(num) + " - " + f.format(new Date()) + evt.nom);
	}
}