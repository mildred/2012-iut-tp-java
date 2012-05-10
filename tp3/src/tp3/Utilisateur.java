/*
 * Created on 16 mars 2005
 * @author : Madjid KETFI LP - Programmation par composants
 */

package tp3;

import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author Madjid KETFI
 */
public class Utilisateur extends JFrame
{
	private static final long	serialVersionUID	= 834729251135193369L;
	private Automate			automate			= null;

	public void consulter()
	{
		try
		{
			int code = Integer.parseInt(champNumCompte.getText());
			int solde = automate.consulter(code);
			champSolde.setText(String.valueOf(solde));
			if (solde != -1)
				champStatut.setText("Consultation bien déroulée...");
			else
				champStatut.setText("Consultation mal déroulée...");
		}
		catch (NumberFormatException e)
		{
			champStatut.setText("Attention: saisie incorrecte !");
		}
	}

	/**
	 * Créditer un compte
	 * 
	 * @param code
	 * @param somme
	 * @return
	 */
	public void crediter()
	{
		try
		{
			int code = Integer.parseInt(champNumCompte.getText());
			int somme = Integer.parseInt(champSomme.getText());
			champSomme.setText("");
			boolean resultat = automate.crediter(code, somme);
			if (resultat)
				champStatut.setText("Opération bien déroulée.");
			else
				champStatut.setText("Opération mal déroulée.");
		}
		catch (NumberFormatException e)
		{
			champStatut.setText("Attention : saisie incorrecte !");
		}
	}

	/**
	 * Débiter une somme d'un compte
	 * 
	 * @param code
	 * @param somme
	 * @return
	 */
	public void debiter()
	{
		try
		{
			int code = Integer.parseInt(champNumCompte.getText());
			int somme = Integer.parseInt(champSomme.getText());
			champSomme.setText("");
			boolean resultat = automate.debiter(code, somme);
			if (resultat)
				champStatut.setText("Opération bien déroulée.");
			else
				champStatut.setText("Opération mal déroulée.");
		}
		catch (NumberFormatException e)
		{
			champStatut.setText("Attention : saisie incorrecte !");
		}
	}

	private javax.swing.JPanel	jContentPane	= null;
	private JLabel				jLabel			= null;
	private JTextField			champNumCompte	= null;
	private JButton				jButton			= null;
	private JTextField			champSolde		= null;
	private JTextField			champSomme		= null;
	private JPanel				jPanel			= null;
	private JLabel				jLabel1			= null;
	private JButton				jButton1		= null;
	private JButton				jButton2		= null;

	private JLabel				champStatut		= null;

	/**
	 * This is the default constructor
	 */
	public Utilisateur(Automate autom)
	{
		super();
		this.automate = autom;
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
		this.setSize(346, 246);
		this.setContentPane(getJContentPane());
		this.setTitle("Utilisateur");
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
			champStatut = new JLabel();
			jLabel = new JLabel();
			jContentPane = new javax.swing.JPanel();
			jContentPane.setLayout(null);
			jLabel.setBounds(15, 12, 93, 27);
			jLabel.setText("Num Compte :");
			champStatut.setBounds(15, 172, 300, 27);
			champStatut.setText("Statut");
			champStatut.setFont(new java.awt.Font("Dialog", java.awt.Font.BOLD, 10));
			champStatut.setForeground(java.awt.Color.red);
			jContentPane.add(jLabel, null);
			jContentPane.add(getChampNumCompte(), null);
			jContentPane.add(getJButton(), null);
			jContentPane.add(getChampSolde(), null);
			jContentPane.add(getJPanel(), null);
			jContentPane.add(champStatut, null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes champNumCompte
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getChampNumCompte()
	{
		if (champNumCompte == null)
		{
			champNumCompte = new JTextField();
			champNumCompte.setBounds(114, 13, 157, 26);
		}
		return champNumCompte;
	}

	/**
	 * This method initializes jButton
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton()
	{
		if (jButton == null)
		{
			jButton = new JButton();
			jButton.setBounds(15, 50, 91, 26);
			jButton.setText("Consulter");
			jButton.addActionListener(new java.awt.event.ActionListener()
			{
				public void actionPerformed(java.awt.event.ActionEvent e)
				{
					consulter();
				}
			});
		}
		return jButton;
	}

	/**
	 * This method initializes champSolde
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getChampSolde()
	{
		if (champSolde == null)
		{
			champSolde = new JTextField();
			champSolde.setBounds(113, 50, 156, 25);
			champSolde.setForeground(java.awt.Color.blue);
			champSolde.setEditable(false);
		}
		return champSolde;
	}

	/**
	 * This method initializes champSomme
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getChampSomme()
	{
		if (champSomme == null)
		{
			champSomme = new JTextField();
			champSomme.setBounds(96, 11, 184, 24);
		}
		return champSomme;
	}

	/**
	 * This method initializes jPanel
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel()
	{
		if (jPanel == null)
		{
			jPanel = new JPanel();
			jLabel1 = new JLabel();
			jPanel.setLayout(null);
			jPanel.setBounds(15, 85, 299, 81);
			jPanel.setBorder(javax.swing.BorderFactory
					.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
			jLabel1.setBounds(13, 11, 76, 24);
			jLabel1.setText("Somme :");
			jPanel.add(getChampSomme(), null);
			jPanel.add(jLabel1, null);
			jPanel.add(getJButton1(), null);
			jPanel.add(getJButton2(), null);
		}
		return jPanel;
	}

	/**
	 * This method initializes jButton1
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton1()
	{
		if (jButton1 == null)
		{
			jButton1 = new JButton();
			jButton1.setBounds(54, 45, 106, 24);
			jButton1.setText("Créditer");
			jButton1.addActionListener(new java.awt.event.ActionListener()
			{
				public void actionPerformed(java.awt.event.ActionEvent e)
				{
					crediter();
				}
			});
		}
		return jButton1;
	}

	/**
	 * This method initializes jButton2
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton2()
	{
		if (jButton2 == null)
		{
			jButton2 = new JButton();
			jButton2.setBounds(176, 46, 106, 22);
			jButton2.setText("Débiter");
			jButton2.addActionListener(new java.awt.event.ActionListener()
			{
				public void actionPerformed(java.awt.event.ActionEvent e)
				{
					debiter();
				}
			});
		}
		return jButton2;
	}
} // @jve:decl-index=0:visual-constraint="10,10"