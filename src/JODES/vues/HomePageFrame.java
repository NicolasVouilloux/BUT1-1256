// ESCOFFIER Emma
package JODES.vues;
import javax.swing.*;
import JODES.controleurs.*;
import JODES.modeles.Administrateur;
import java.awt.*;

public class HomePageFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	JPanel p = new JPanel();
	
	PanelTitle title = new PanelTitle("JODES");
	JButton planning = new JButton("Planning");
	JButton equipes = new JButton("Equipes");
	JButton sessions = new JButton("Sessions");
	JButton epreuves = new JButton("Epreuves");
	Administrateur admin;

	public HomePageFrame(Administrateur admin){
		this.admin = admin;
		setTitle("JODES");
		setSize (800, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		add(title, BorderLayout.NORTH);
		
		setButtonColors(planning);
		setButtonColors(equipes);
		setButtonColors(sessions);
		setButtonColors(epreuves);
		p.setLayout(new GridLayout(4, 1, 10, 10));

		p.add(planning);
		p.add(equipes);
		p.add(sessions);
		p.add(epreuves);
		
		add(p);

		ControleurBtnPlanning ctrlBtnPlann = new ControleurBtnPlanning(this, admin);
		ControleurBtnEpreuve ctrlBtnEpr = new ControleurBtnEpreuve(this, admin);
		ControleurBtnEquipe ctrlBtnEqu = new ControleurBtnEquipe(this, admin);
		ControleurBtnSession ctrlBtnSes = new ControleurBtnSession(this, admin);
		
		epreuves.addActionListener(ctrlBtnEpr);
		planning.addActionListener(ctrlBtnPlann);
		equipes.addActionListener(ctrlBtnEqu);
		sessions.addActionListener(ctrlBtnSes);
		
		setVisible(true);
	}
	
	protected void setButtonColors(JButton button) {
		button.setBackground(Color.lightGray);
		button.setForeground(Color.WHITE);
	}
}