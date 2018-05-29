package presentation;

import domaine.Personne;
import service.Iservice;

public class Lanceur {

	public static void main(String[] args) {

		Iservice service = new ServiceImpl();
		
		Map<Integer, Personne> resultats = new Hashtable<Integer, Personne>();
		
		System.out.println("Affichage Map avant ajout");
		service.listePaersonne(resultats);		
		System.out.println("Ajout d'une personne");
		Personne p = new Personne(1, "ZEC", "UNION");
		service.createPersonne(p);
		System.out.println("Affichage Map apres ajout");
		service.listePaersonne(resultats);
	}

}
