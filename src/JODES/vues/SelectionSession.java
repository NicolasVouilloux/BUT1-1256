//correct package - Emma
package JODES.vues;
import JODES.JO2024;
import JODES.controleurs.ControleurBtnRetour;
import JODES.controleurs.ControleurBtnSelectSession;
import JODES.controleurs.RetourVue;
import java.awt.*;
import javax.swing.*;

public class SelectionSession extends JFrame implements RetourVue {
    
    private static final long serialVersionUID = 1L;
    protected ComboBoxSession combo;
    protected JButton valider;
    protected JPanel panelDel;
    protected JLabel indicationDelete;
    protected JPanel panelIndication;

    public SelectionSession() {
        // Create main frame
        super("JODES");
        setSize(800, 450);
        setLayout(new BorderLayout());

        // Title
        PanelTitle panelTitle = new PanelTitle("Sessions");
        add(panelTitle,BorderLayout.NORTH);

        // Initialize elements
        valider = new JButton("✔");
        combo = new ComboBoxSession(JO2024.getSessions());
        valider.addActionListener(new ControleurBtnSelectSession(combo, ControleurBtnSelectSession.MODIF));
        indicationDelete = new JLabel("Veuillez sélectionner la session à modifier :",JLabel.CENTER);

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
        new SelectionSession();
    }
//Nicolas
	@Override
	public void retour() {
		new SessionFrame();
		this.dispose();
	}
}
