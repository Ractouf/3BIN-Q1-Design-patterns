public class Main {
    public static void main(String[] args) {
        Magasin magasinDVD = new Magasin(new MagasinDeDVD());
        Magasin magasinLivre = new Magasin(new MagasinDeLivre());

        magasinDVD.ajouter("test1", 2000);
        magasinDVD.ajouter("test2", 2001);

        magasinLivre.ajouter("test3", 2002);
        magasinLivre.ajouter("test4", 2003);
    }
}
