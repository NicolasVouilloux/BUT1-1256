package JODES.vues;
import java.util.ArrayList;
import javax.swing.JComboBox;
import JODES.modeles.*;

public class ComboBoxStatutSession extends JComboBox {
    
    protected ArrayList<String> statut = new ArrayList<>();

    public ComboBoxStatutSession() {
        statut.add(Session.AMICAL);
        statut.add(Session.DEMIE);
        statut.add(Session.FINALE);
        statut.add(Session.HUITIEME);
        statut.add(Session.QUALIF);
        statut.add(Session.QUART);
        addItems();
    }

    protected void addItems() {
        this.addItem("");
        for (String s : statut)
        {
            this.addItem(s);
        }
    }
}

