/*
 * Created on 5 mars 2005
 * @author : Madjid KETFI LP - Programmation par composants
 */

package tp4.exo1;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JScrollBar;

/**
 * @author Madjid KETFI Nom : Description :
 */
public class MyGUIView extends JFrame implements Observer
{
	private javax.swing.JPanel	jContentPane	= null;
	private JLabel				jLabel			= null;
	private MeteoModel			model;

	private JScrollBar			jScrollBar1		= null;
	private JLabel				jLabel1			= null;
	private JLabel				jLabel2			= null;
	private JLabel				jLabel3			= null;

	private JScrollBar			jScrollBar2		= null;
	private JLabel				jLabel4			= null;

	private JScrollBar			jScrollBar3		= null;
	private JLabel				jLabel5			= null;

	/**
	 * Constructor: a comme argument le modèle de données
	 */
	public MyGUIView(MeteoModel m)
	{
		super();
		this.model = m;
		model.addObserver(this); // ajouter cette vue comme auditeur
		initialize();
		this.setVisible(true);
	}

	/**
	 * Méthode qui doit répondre aux notifications du modèle => Lire les
	 * nouvelles valeurs du modèle et adapter la vue
	 */
	public void update(Observable m, Object obj)
	{
		jScrollBar1.setValue(model.getTempVille1());
		jScrollBar2.setValue(model.getTempVille2());
		jScrollBar3.setValue(model.getTempVille3());
	}

	/**
	 * This method initializes jScrollBar1
	 * 
	 * @return javax.swing.JScrollBar
	 */
	private JScrollBar getJScrollBar1()
	{
		if (jScrollBar1 == null)
		{
			jScrollBar1 = new JScrollBar();
			jScrollBar1.setBounds(89, 41, 264, 15);
			jScrollBar1.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
			jScrollBar1.setComponentOrientation(java.awt.ComponentOrientation.LEFT_TO_RIGHT);
			jScrollBar1.setVisibleAmount(0);
			jScrollBar1.setMaximum(20);
			jScrollBar1.setMinimum(-20);
			jScrollBar1.addAdjustmentListener(new java.awt.event.AdjustmentListener()
			{
				public void adjustmentValueChanged(java.awt.event.AdjustmentEvent e)
				{
					valeur1Changee();
				}
			});
		}
		return jScrollBar1;
	}

	/**
	 * Réaction aux changement du scrollbar 1
	 */
	private void valeur1Changee()
	{
		int newValue = jScrollBar1.getValue();
		model.setTempVille1(newValue);
	}

	/**
	 * This method initializes jScrollBar2
	 * 
	 * @return javax.swing.JScrollBar
	 */
	private JScrollBar getJScrollBar2()
	{
		if (jScrollBar2 == null)
		{
			jScrollBar2 = new JScrollBar();
			jScrollBar2.setBounds(89, 93, 264, 15);
			jScrollBar2.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
			jScrollBar2.setVisibleAmount(0);
			jScrollBar2.setMaximum(20);
			jScrollBar2.setMinimum(-20);
			jScrollBar2.setComponentOrientation(java.awt.ComponentOrientation.LEFT_TO_RIGHT);
			jScrollBar2.addAdjustmentListener(new java.awt.event.AdjustmentListener()
			{
				public void adjustmentValueChanged(java.awt.event.AdjustmentEvent e)
				{
					valeur2Changee();
				}
			});
		}
		return jScrollBar2;
	}

	/**
	 * Réaction aux changement du scrollbar 1
	 */
	private void valeur2Changee()
	{
		int newValue = jScrollBar2.getValue();
		model.setTempVille2(newValue);
	}

	private JScrollBar getJScrollBar3()
	{
		if (jScrollBar3 == null)
		{
			jScrollBar3 = new JScrollBar();
			jScrollBar3.setBounds(89, 141, 264, 15);
			jScrollBar3.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
			jScrollBar3.setComponentOrientation(java.awt.ComponentOrientation.LEFT_TO_RIGHT);
			jScrollBar3.setVisibleAmount(0);
			jScrollBar3.setMaximum(20);
			jScrollBar3.setMinimum(-20);
			jScrollBar3.addAdjustmentListener(new java.awt.event.AdjustmentListener()
			{
				public void adjustmentValueChanged(java.awt.event.AdjustmentEvent e)
				{
					valeur3Changee();
				}
			});
		}
		return jScrollBar3;
	}

	private void valeur3Changee()
	{
		int newValue = jScrollBar3.getValue();
		model.setTempVille3(newValue);
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize()
	{
		this.setSize(385, 210);
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
			jLabel4 = new JLabel();
			jLabel3 = new JLabel();
			jLabel2 = new JLabel();
			jLabel1 = new JLabel();
			jLabel = new JLabel();
			jLabel5 = new JLabel();
			jContentPane = new javax.swing.JPanel();
			jContentPane.setLayout(null);
			jLabel.setBounds(14, 36, 64, 23);
			jLabel.setText("Grenoble");
			jContentPane.setComponentOrientation(java.awt.ComponentOrientation.LEFT_TO_RIGHT);
			jLabel1.setBounds(87, 63, 40, 20);
			jLabel1.setText("-20");
			jLabel1.setForeground(java.awt.Color.red);
			jLabel2.setBounds(219, 63, 25, 17);
			jLabel2.setText("0");
			jLabel2.setForeground(java.awt.Color.red);
			jLabel3.setBounds(332, 62, 32, 18);
			jLabel3.setText("+20");
			jLabel3.setForeground(java.awt.Color.red);
			jLabel4.setBounds(13, 92, 60, 18);
			jLabel4.setText("Paris");
			jLabel5.setBounds(13, 141, 40, 20);
			jLabel5.setText("Lyon");

			jContentPane.add(jLabel, null);
			jContentPane.add(getJScrollBar1(), null);
			jContentPane.add(getJScrollBar2(), null);
			jContentPane.add(getJScrollBar3(), null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(jLabel5, null);
		}
		return jContentPane;
	}
}
