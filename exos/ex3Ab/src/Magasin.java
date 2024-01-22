import java.util.HashMap;
import java.util.Map;

public class Magasin {
	private Map<String, Article> bac = new HashMap<>();
	private AbstractFactory abstractFactory;

	public Magasin(AbstractFactory abstractFactory) {
		this.abstractFactory = abstractFactory;
	}

	public void ajouter(String name, int anneeDeParution) {
		Article article = abstractFactory.ajouterArticle(name, anneeDeParution);

		bac.put(name, article);
	}

	public Article retourne(String name) {
		return bac.get(name);
	}
}
