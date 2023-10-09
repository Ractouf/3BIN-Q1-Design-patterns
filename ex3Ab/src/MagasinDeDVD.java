public class MagasinDeDVD implements AbstractFactory {
    @Override
    public Article ajouterArticle(String name, int anneeParution) {
        return new DVD(name, anneeParution);
    }
}
