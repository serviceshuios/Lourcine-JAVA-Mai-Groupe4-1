package presentation;

import java.util.Hashtable;
import java.util.Map;

import domaine.Personne;
import service.Iservice;
import service.ServiceImpl;

public class Lanceur {

	public static void main(String[] args) {

		Iservice service = new ServiceImpl();
		
		Map<Integer, Personne> resultats = new Hashtable<Integer, Personne>();
		
		System.out.println("Affichage Map avant ajout");
		service.listePersonne(resultats);		
		System.out.println("Ajout d'une personne");
		Personne p = new Personne(1, "ZEC", "UNION", 47);
		resultats = service.createPersonne(p);
		System.out.println("Affichage Map apres ajout");
		service.listePersonne(resultats);
	}

}
