public class MagasinDeDVD extends Magasin {
    @Override
    public Article ajouterArticle(String name, int anneeParution) {
        return new DVD(name, anneeParution);
    }
}
