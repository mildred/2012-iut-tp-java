/*
 * Created on 18 mars 2005
 * @author : Madjid KETFI LP - Programmation par composants
 */

package tp3;

import javax.swing.JFrame;
import java.io.*;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 * @author Madjid KETFI Nom : Description :
 */
public class Administrateur extends JFrame
{
	private static final long	serialVersionUID	= 1381505744347163446L;

	/**
	 * Cette méthode doit permettre de sérialiser la banque
	 */
	private void serialiserBanque()
	{
		try {
			FileOutputStream out = new FileOutputStream("banque.data"); 
		    ObjectOutputStream os;
			os = new ObjectOutputStream(out);
			os.writeObject(banque);
			os.flush();
	    	os.close();
	    	out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Cette méthode doit permettre de dé-sérialiser la banque
	 * 
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
	private void deserialiserBanque()
	{
		try {
			FileInputStream in = new FileInputStream("banque.data"); 
			ObjectInputStream is = new ObjectInputStream(in);
			banque = (Banque) is.readObject();
			automate.setBanque(banque);
			is.close();
			in.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private Banque				banque				= null;
	private Automate			automate			= null;

	private javax.swing.JPanel	jContentPane		= null;
	private JButton				boutonSerialiser	= null;
	private JTextField			champSortie			= null;
	private JButton				boutonDeserialiser	= null;
	private JTextField			champEntree			= null;

	/**
	 * This method initializes boutonSerialiser
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBoutonSerialiser()
	{
		if (boutonSerialiser == null)
		{
			boutonSerialiser = new JButton();
			boutonSerialiser.setBounds(14, 11, 169, 25);
			boutonSerialiser.setText("Sérialiser Banque");
			boutonSerialiser.addActionListener(new java.awt.event.ActionListener()
			{
				public void actionPerformed(java.awt.event.ActionEvent e)
				{
					serialiserBanque();
				}
			});
		}
		return boutonSerialiser;
	}

	/**
	 * This method initializes champSortie
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getChampSortie()
	{
		if (champSortie == null)
		{
			champSortie = new JTextField();
			champSortie.setBounds(15, 42, 282, 26);
		}
		return champSortie;
	}

	/**
	 * This method initializes boutonDeserialiser
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBoutonDeserialiser()
	{
		if (boutonDeserialiser == null)
		{
			boutonDeserialiser = new JButton();
			boutonDeserialiser.setBounds(18, 92, 165, 25);
			boutonDeserialiser.setText("Restaurer Banque");
			boutonDeserialiser.addActionListener(new java.awt.event.ActionListener()
			{
				public void actionPerformed(java.awt.event.ActionEvent e)
				{
					deserialiserBanque();
				}
			});
		}
		return boutonDeserialiser;
	}

	/**
	 * This method initializes champEntree
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getChampEntree()
	{
		if (champEntree == null)
		{
			champEntree = new JTextField();
			champEntree.setBounds(19, 124, 277, 26);
		}
		return champEntree;
	}

	public static void main(String[] args)
	{}

	/**
	 * This is the default constructor
	 */
	public Administrateur(Banque banque, Automate autom)
	{
		super();
		this.banque = banque;
		this.automate = autom;
		initialize();
		setVisible(true);
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize()
	{
		this.setSize(321, 204);
		this.setContentPane(getJContentPane());
		this.setTitle("Administrateur");
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
			jContentPane.add(getBoutonSerialiser(), null);
			jContentPane.add(getChampSortie(), null);
			jContentPane.add(getBoutonDeserialiser(), null);
			jContentPane.add(getChampEntree(), null);
		}
		return jContentPane;
	}
} // @jve:decl-index=0:visual-constraint="10,10"