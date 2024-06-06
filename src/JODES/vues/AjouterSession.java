package JODES.vues;

import javax.swing.*;

import JODES.JO2024;
import JODES.controleurs.ControleurBTNRetour;
import JODES.controleurs.RetourVue;

import java.awt.*;
import java.util.Properties;

public class AjouterSession extends JFrame implements RetourVue{

	public AjouterSession() {
        super("Gestion des Session - Paris 2024");
        
        PanelTitle panelTitle = new PanelTitle("Session Création");
        JButton button = new JButton("retour");
        ControleurBTNRetour btnretour = new ControleurBTNRetour(this);
        add(button, BorderLayout.SOUTH);
        JButton buttonSave = new JButton("Sauvegarder et quitter");
      
        add(panelTitle, BorderLayout.NORTH);
        button.addActionListener(btnretour);
        
        JPanel panelSaveRetour = new JPanel();
        panelSaveRetour.setLayout(new GridLayout(2,1));
        panelSaveRetour.add(buttonSave);
        panelSaveRetour.add(button);
        add(panelSaveRetour,BorderLayout.SOUTH);
        
        
        JPanel panelDuMilieu = new JPanel();
        panelDuMilieu.setLayout(new GridLayout(3,2));
		panelDuMilieu.add(new GridFormField(new JTextField(""),new JLabel("Nom Epreuve :")));
		panelDuMilieu.add(new GridFormField(new ComboBoxSession(JO2024.getSessions()),new JLabel("Session :")));
		panelDuMilieu.add(new GridFormField(new ComboBoxHoraires(),new JLabel("Horaire Debut :")));
		panelDuMilieu.add(new GridFormField(new ComboBoxHoraires(),new JLabel("Horaire Fin :")));
		
		add(panelDuMilieu,BorderLayout.CENTER);
        
      
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