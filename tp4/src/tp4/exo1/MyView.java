/*
 * Created on 3 mars 2005
 * @author : Madjid LP - Programmation par composants
 */

package tp4.exo1;

import java.util.Observable;
import java.util.Observer;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 * @author Madjid Nom : Description :
 */
public class MyView extends JFrame implements Observer
{
	private MeteoModel          model;
	private javax.swing.JPanel	jContentPane	= null;
	private JRadioButton		jRadioButton1	= null;
	private ButtonGroup			group			= new ButtonGroup();
	private JRadioButton		jRadioButton2	= null;
	private JRadioButton		jRadioButton3	= null;
	private JLabel				jLabel1			= null;
	private JLabel				jLabel2			= null;
	private JLabel				jLabel3			= null;
	private JButton				jButton			= null;
	private JButton				jButton1		= null;

	/**
	 * This is the default constructor
	 */
	public MyView(MeteoModel m)
	{
		super();
		this.model = m;
		model.addObserver(this); // ajouter cette vue comme auditeur
		initialize();
		this.setVisible(true);
	}

	/**
	 * Méthode appelée lorsque le bouton + est cliqué
	 */
	private void boutonPlusClique()
	{
		if (jRadioButton1.isSelected())
		{
			model.setTempVille1(model.getTempVille1() + 1);
		}
		else if (jRadioButton2.isSelected())
		{
			model.setTempVille2(model.getTempVille2() + 1);
		}
		else if (jRadioButton3.isSelected())
		{
			model.setTempVille3(model.getTempVille3() + 1);
		}
	}

	/**
	 * Méthode appelée lorsque le bouton - est cliqué
	 */
	private void boutonMoinsClique()
	{
		if (jRadioButton1.isSelected())
		{
			model.setTempVille1(model.getTempVille1() - 1);
		}
		else if (jRadioButton2.isSelected())
		{
			model.setTempVille2(model.getTempVille2() - 1);
		}
		else if (jRadioButton3.isSelected())
		{
			model.setTempVille3(model.getTempVille3() - 1);
		}
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize()
	{
		this.setSize(335, 189);
		this.setContentPane(getJContentPane());
		this.setTitle("Vue Texte");
		group.add(jRadioButton1);
		group.add(jRadioButton2);
		group.add(jRadioButton3);
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
			jLabel3 = new JLabel();
			jLabel2 = new JLabel();
			jLabel1 = new JLabel();
			jContentPane = new javax.swing.JPanel();
			jContentPane.setLayout(null);
			jLabel1.setBounds(124, 9, 85, 26);
			jLabel1.setText("?");
			jLabel2.setBounds(124, 38, 85, 23);
			jLabel2.setText("?");
			jLabel3.setBounds(124, 62, 85, 22);
			jLabel3.setText("?");
			jContentPane.add(getJRadioButton1(), null);
			jContentPane.add(getJRadioButton2(), null);
			jContentPane.add(getJRadioButton3(), null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getJButtonPlus(), null);
			jContentPane.add(getJButtonMoins(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jRadioButton1
	 * 
	 * @return javax.swing.JRadioButton
	 */
	private JRadioButton getJRadioButton1()
	{
		if (jRadioButton1 == null)
		{
			jRadioButton1 = new JRadioButton();
			jRadioButton1.setBounds(14, 6, 99, 35);
			jRadioButton1.setText("Grenoble");
		}
		return jRadioButton1;
	}

	/**
	 * This method initializes jRadioButton2
	 * 
	 * @return javax.swing.JRadioButton
	 */
	private JRadioButton getJRadioButton2()
	{
		if (jRadioButton2 == null)
		{
			jRadioButton2 = new JRadioButton();
			jRadioButton2.setBounds(14, 33, 102, 31);
			jRadioButton2.setText("Paris");
		}
		return jRadioButton2;
	}

	/**
	 * This method initializes jRadioButton3
	 * 
	 * @return javax.swing.JRadioButton
	 */
	private JRadioButton getJRadioButton3()
	{
		if (jRadioButton3 == null)
		{
			jRadioButton3 = new JRadioButton();
			jRadioButton3.setBounds(15, 60, 83, 29);
			jRadioButton3.setText("Lyon");
		}
		return jRadioButton3;
	}

	/**
	 * This method initializes jButton
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButtonPlus()
	{
		if (jButton == null)
		{
			jButton = new JButton();
			jButton.setBounds(45, 112, 124, 28);
			jButton.setText("Augmenter +");
			jButton.addActionListener(new java.awt.event.ActionListener()
			{
				public void actionPerformed(java.awt.event.ActionEvent e)
				{
					boutonPlusClique();
				}
			});
		}
		return jButton;
	}

	/**
	 * This method initializes jButton1
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButtonMoins()
	{
		if (jButton1 == null)
		{
			jButton1 = new JButton();
			jButton1.setBounds(189, 111, 103, 29);
			jButton1.setText("Diminuer -");
			jButton1.addActionListener(new java.awt.event.ActionListener()
			{
				public void actionPerformed(java.awt.event.ActionEvent e)
				{
					boutonMoinsClique();
				}
			});
		}
		return jButton1;
	}

	@Override
	public void update(Observable o, Object arg) {
		jLabel1.setText(Integer.toString(model.getTempVille1()));
		jLabel2.setText(Integer.toString(model.getTempVille2()));
		jLabel3.setText(Integer.toString(model.getTempVille3()));
	}
}
