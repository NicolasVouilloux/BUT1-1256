//correct package - Emma
package JODES.vues;
import JODES.JO2024;
import JODES.controleurs.ControleurBtnRetour;
import JODES.controleurs.ControleurBtnSelectEpreuve;
import JODES.controleurs.RetourVue;
import JODES.modeles.Administrateur;

import java.awt.*;
import javax.swing.*;

//correct naming of class - Emma
public class SelectionEpreuve extends JFrame implements RetourVue {

    private static final long serialVersionUID = 1L;
    protected ComboBoxEpreuve combo;
    protected JButton valider;
    protected JPanel panelDel;
    protected JLabel indicationDelete;
    protected JPanel panelIndication;
    Administrateur admin;

    public SelectionEpreuve(Administrateur admin) {
        // Create main frame
        super("Selection d'une épreuve");
        this.admin = admin;
        setSize(800, 450);
        setLayout(new BorderLayout());

        // Title
        PanelTitle panelTitle = new PanelTitle("Épreuves");
        add(panelTitle,BorderLayout.NORTH);
        
        // Elements
        valider = new JButton("✔");
        combo = new ComboBoxEpreuve(JO2024.getEpreuves());
        valider.addActionListener(new ControleurBtnSelectEpreuve(combo, ControleurBtnSelectEpreuve.MODIF, admin));
        indicationDelete = new JLabel("Veuillez sélectionner l'épreuve à modifier :",JLabel.CENTER);

        // Panel
        panelDel = new JPanel();
        panelDel.setLayout(new GridLayout(2,1));
        panelDel.add(indicationDelete);
        
        JPanel panelChoix = new JPanel(new GridLayout(2,2));
        panelChoix.add(combo, BorderLayout.LINE_START);
        panelChoix.add(valider, BorderLayout.PAGE_END);
        panelChoix.add(new JLabel()); // to create empty space
        
        panelDel.add(panelChoix);
        add(panelDel,BorderLayout.CENTER);

        //Nicolas 
        JButton button = new JButton("Retour" + "\u21A9");
        ControleurBtnRetour BtnRetour = new ControleurBtnRetour(this);
        button.addActionListener(BtnRetour);
        add(button,BorderLayout.SOUTH);
        
        // Make the frame visible
        setSize(800, 450);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
    	Administrateur admin = new Administrateur("admin", "", "tst", "ttest");
        new SelectionEpreuve(admin);
    }

	@Override
	public void retour() {
		new EpreuveFrame(admin);
		this.dispose();
	}
}


