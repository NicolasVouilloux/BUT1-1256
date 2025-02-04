/*
 * 
 */
package JODES.controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import JODES.modeles.Administrateur;
import JODES.vues.AjouterEpreuve;


/**
 * The Class ControleurBtnAjEpreuve.
 *
 * @author Emma Escoffier
 */
public class ControleurBtnAjEpreuve implements ActionListener {

	/** The admin. */
	Administrateur admin;
	
	/** The vue. */
	protected JFrame _vue;
	
	/**
	 * Instantiates a new controleur btn aj epreuve.
	 *
	 * @param vue the vue
	 * @param admin the admin
	 */
	public ControleurBtnAjEpreuve(JFrame vue, Administrateur admin) {
		this._vue = vue;
		this.admin = admin;
	}

	/**
	 * Action performed.
	 *
	 * @param e the e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		new AjouterEpreuve(admin);
		_vue.dispose();
	}

}
