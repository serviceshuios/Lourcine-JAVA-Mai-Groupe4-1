/**
 * 
 */
package service;

import java.util.List;
import java.util.Map;

import domaine.Club;
import domaine.Compte;
import domaine.Login;
import domaine.Personne;

/**
 * @author Adminl
 *
 */
public interface Iservice {
	
	//CRUD Personne	
	
	public Map<Integer, Personne > createPersonne(Personne p);
	public void readPersonne(Personne p);
	public void updatePersonne(Personne p);
	public void deletePersonne(Personne p);
	public List<Personne> listPersonnes();
	public void listePersonne(Map<Integer, Personne > personnes );
	
	//CRUD Compte
	public void createCompte(Compte c);
	public void readCompte(Compte c);
	public void updateCompte(Compte c);
	public void deleteCompte(Compte c);
	public List<Compte> listComptes();
	
	//CRUD Club
	public void createClub(Club club);
	public void readClub(Club club);
	public void updateClub(Club club);
	public void deleteClub(Club club);
	public List<Club> listClubs();
	
	
	//CRUD Login
	public void createLogin(Login login);
	public void readLogin(Login login);
	public void updateLogin(Login login);
	public void deleteLogin(Login login);
	public List<Login> listLogins();
	
	//méthodes métiers
	public void attribuerCompte(Personne p, Compte c);
	public void affilierClub(Personne p, Club club);
	public void crediterCompte(Compte c, double mt);
	public void debiterCompte(Compte c, double mt);
	public void supprimerCompte(Compte c);
	public void ajouterTitulaire(Compte c, Personne p);
	public void ajouterPersonneClub(Personne p, Club club);
	

}
