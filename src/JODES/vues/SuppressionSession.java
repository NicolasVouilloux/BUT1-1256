//correct package - Emma
package JODES.vues;
import JODES.JO2024;
import JODES.controleurs.ControleurBtnRetour;
import JODES.controleurs.ControleurBtnSelectSession;
import JODES.controleurs.ControleurBtnSelection;
import JODES.controleurs.RetourVue;
import JODES.controleurs.SelectionVue;
import JODES.modeles.Administrateur;
import java.awt.*;
import javax.swing.*;


/**
 * The Class SuppressionSession.
 *
 * @author Ash Merienne
 */
public class SuppressionSession extends JFrame implements RetourVue,SelectionVue {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    
    /** The combo. */
    protected ComboBoxSession combo;
    
    /** The valider. */
    protected JButton valider;
    
    /** The panel del. */
    protected JPanel panelDel;
    
    /** The indication delete. */
    protected JLabel indicationDelete;
    
    /** The panel indication. */
    protected JPanel panelIndication;
    
    /** The admin. */
    Administrateur admin;

    /**
     * Instantiates a new suppression session.
     *
     * @param admin the admin
     */
    public SuppressionSession(Administrateur admin) {
        // Create main frame
        super("JODES");
        this.admin = admin;
        setSize(800, 450);
        setLayout(new BorderLayout());

        // Title
        PanelTitle panelTitle = new PanelTitle("Supprimer session");
        add(panelTitle,BorderLayout.NORTH);

        // Initialize elements
        valider = new JButton("✔");
        
        ControleurBtnSelection contr = new ControleurBtnSelection(this); 
        valider.addActionListener(contr);
        
        combo = new ComboBoxSession(JO2024.getSessions());
        valider.addActionListener(new ControleurBtnSelectSession(this,combo, ControleurBtnSelectSession.SUPPR, admin));
        indicationDelete = new JLabel("Veuillez sélectionner la session à supprimer :",JLabel.CENTER);

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
    
    /**
     * Retour.
     * @author Nicolas Vouilloux
     */
	@Override
	public void retour() {
		new SessionFrame(admin);
		this.dispose();
	}
	
	/**
	 * Selection.
	 */
	@Override
	public void selection() {
		if (combo.isSelectedNull())
			javax.swing.JOptionPane.showMessageDialog(null,"Erreur Entite Null"); 
		else {
			this.dispose();
		}
	}
}
