public class Main {
    public static void main(String[] args) {
        Magasin magasinDVD = new MagasinDeDVD();
        magasinDVD.ajouter("test1", 2000);
        magasinDVD.ajouter("test2", 2001);

        Magasin magasinLivre = new MagasinDeLivre();
        magasinLivre.ajouter("test3", 2002);
        magasinLivre.ajouter("test4", 2003);
    }
}
