public class MagasinDeLivre extends Magasin {
	@Override
	public Article ajouterArticle(String name, int anneeParution) {
		return new Livre(name, anneeParution);
	}
}
