import java.awt.*;

public class Principale implements ConstantesJeu {
	public static void main(String[] args) {
    Parcourir parcourt = new ParcourtNormal();
    //Parcourir parcourt = new ParcourtFort();
    JeuDeLaVie jeu = new JeuDeLaVie(NBR_LIGNES, NBR_COLONNES, parcourt);
    JeuDeLaVieGUI vie = new JeuDeLaVieGUI("Le Jeu de la Vie",jeu,Color.red, Color.black);
  }
}
