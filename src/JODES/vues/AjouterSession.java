package JODES.vues;

import javax.swing.*;

import JODES.controleurs.ControleurBTNRetour;
import JODES.controleurs.RetourVue;

import java.awt.*;

public class AjouterSession extends JFrame implements RetourVue{

	public AjouterSession() {
        super("JODES");
        
        PanelTitle panelTitle = new PanelTitle("Session Création");
        JButton button = new JButton("Retour" + "\u21A9");
        ControleurBTNRetour btnretour = new ControleurBTNRetour(this);
        
        add(button, BorderLayout.SOUTH);
        add(panelTitle, BorderLayout.NORTH);
        button.addActionListener(btnretour);
        
        setSize(800, 450);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        AjouterSession testAffichage = new AjouterSession();
    }
    //Nicolas
	@Override
	public void retour() {
		new SessionFrame();
		(this).dispose();
	}
}