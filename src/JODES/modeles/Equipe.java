package JODES.modeles;

import java.util.*;

public class Equipe extends Entite {

	protected ArrayList<Athlete> sesAthletes;
	protected Pays sonPays;
	
	// ----------- Constructors -----------
	
	public Equipe(String nom, Pays sonPays, ArrayList<Athlete> sesAthletes) {
		super(nom);
		this.sesAthletes = sesAthletes;
		this.sonPays = sonPays;
	}
	
	public Equipe(String nom, Pays sonPays) {
		this(nom, sonPays, new ArrayList<Athlete>());
	}
	
	// ----------- Getters & setters -----------
	
	public ArrayList<Athlete> getSesAthletes() {
		return sesAthletes;
	}

	public void setSesAthletes(ArrayList<Athlete> sesAthletes) {
		this.sesAthletes = sesAthletes;
	}
	
	// ----------- Methods -----------

	@Override
	public void menuModification() {
		return;
	}

	@Override
	public void menuModificationVisuel() {
		return;
	}

}