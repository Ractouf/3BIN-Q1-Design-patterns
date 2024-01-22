public class MagasinDeLivre implements AbstractFactory {
	@Override
	public Article ajouterArticle(String name, int anneeParution) {
		return new Livre(name, anneeParution);
	}
}
