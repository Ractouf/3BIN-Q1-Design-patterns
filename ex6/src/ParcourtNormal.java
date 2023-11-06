import java.util.List;

public class ParcourtNormal extends Parcourir {
	// Une cellule devient vivante si :
	// soit elle �tait vivante et a 2 ou 3 voisins vivants // soit elle �tait morte
	// et a exactement 3
	// voisins vivants.
	// Dans les autres cas la cellule meurt ou reste morte.
	public void parcourtCelluleVivante(Cellule cellule, JeuDeLaVie jeu, List<Activite> activites) {
		int n = cellule.nombreDeVoisins(jeu);
		if (n != 2 && n != 3) {
			activites.add(new Meurt(cellule));
		}
	}

	public void parcourtCelluleMorte(Cellule cellule, JeuDeLaVie jeu, List<Activite> activites) {
		int n = cellule.nombreDeVoisins(jeu);
		if (n == 3) {
			activites.add(new Vit(cellule));
		}
	}
}
