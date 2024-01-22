import java.util.List;

public class EstVivante extends Situation {
	private static EstVivante instance = null;

	private EstVivante() {
	}

	public static EstVivante getInstance() {
		if (instance == null)
			instance = new EstVivante();
		return instance;
	}

	public Situation vit() {
		return this;
	}

	public Situation meurt() {
		return EstMorte.getInstance();
	}

	public boolean estVivante() {
		return true;
	}

	public Situation toggle() {
		return meurt();
	}

	public void ajouterAuxVoisinsVivants(List<Situation> voisinsVivants) {
		voisinsVivants.add(this);
	}

	public void generer(Cellule cellule, JeuDeLaVie jeu, List<Activite> activites, Parcourir parcourt) {
		parcourt.parcourtCelluleVivante(cellule, jeu, activites);
	}
}
