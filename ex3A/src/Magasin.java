import java.util.HashMap;
import java.util.Map;

public abstract class Magasin {
	private Map<String, Article> bac = new HashMap<>();

	public void ajouter(String name, int anneeDeParution) {
		Article article = this.ajouterArticle(name, anneeDeParution);

		bac.put(name, article);
	}

	public Article retourneDVD(String name) {
		return bac.get(name);
	}

	public abstract Article ajouterArticle(String name, int anneeParution);
}
