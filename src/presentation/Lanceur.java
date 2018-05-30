package presentation;

import java.util.Hashtable;
import java.util.Map;

import domaine.Compte;
import domaine.CompteEpargne;
import domaine.ComptePayant;
import domaine.CompteSimple;
import domaine.Login;
import domaine.Personne;
import service.Iservice;
import service.ServiceImpl;

public class Lanceur {

	public static void main(String[] args) {

		Iservice service = new ServiceImpl();
		
		Map<Integer, Personne> resultats = new Hashtable<Integer, Personne>();
		Map<Integer, Compte> ListeComptes = new Hashtable<Integer, Compte>();
		Map<Integer, Login> ListeLogins = new Hashtable<Integer, Login>();
		
		System.out.println("Affichage Map avant ajout");
		service.listePersonne(resultats);		
		System.out.println("Ajout d'une personne");
		Personne p = new Personne(1, "ZEC", "UNION", 47);
		Personne p1 = new Personne(2, "Kam", "JEE", 47);
		resultats = service.createPersonne(p);
		resultats = service.createPersonne(p1);
		System.out.println("Affichage Map apres ajout");
		service.listePersonne(resultats);
		
		System.out.println("Affichage Map avant ajout des comptes");
		service.listeComptes(ListeComptes);
		Compte c1 = new CompteEpargne(1,2500,6);
		System.out.println(c1.hashCode());
		Compte c4 = new CompteEpargne(1,2500,5);
		System.out.println(c4.hashCode());
		Compte c2 = new CompteSimple(2, 5000, 600);
		Compte c3 = new ComptePayant(3, 9000, 0.4);
		System.out.println("Affichage Map après ajout des comptes");
		ListeComptes = service.createCompte(c1);
		ListeComptes = service.createCompte(c2);
		ListeComptes = service.createCompte(c3);
		service.listeComptes(ListeComptes);

		// ASSOCIER UN COMPTE A UNE PERSONNE
		System.out.println("**************************************");
		service.ajouterTitulaire(c1, p);
		service.ajouterTitulaire(c2, p);
		service.ajouterTitulaire(c1, p);
		service.ajouterTitulaire(c4, p);
		service.ajouterTitulaire(c3, p1);
		resultats = service.createPersonne(p);
		service.listePersonne(resultats);
		
		// Créer un login
		System.out.println("Ajout des Logins");
		Login login1 = new Login(1, "Bobby", "123456", p);
		Login login2 = new Login(2, "Toto", "987654", p1);
		ListeLogins = service.createLogin(login1);
		ListeLogins = service.createLogin(login2);
		System.out.println("Affichage des logins");
		service.ListeLogins(ListeLogins);
		
		
		
	}

}
