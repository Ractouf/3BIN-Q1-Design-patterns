import java.util.HashMap;
import java.util.Map;

public abstract class MagasinDeDVD {
	private Map<String, Article> bac = new HashMap<>();
	public void ajouterDVD(String name, int anneeDeParution){
		Article article = this.ajouterArticle(name, anneeDeParution);
		bac.put(name, article);
	}

	public abstract Article ajouterArticle(String name, int anneeParution);
	public Article retourneDVD(String name){
		return bac.get(name);
	}
}
