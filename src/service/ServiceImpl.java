/**
 * 
 */
package service;

import java.util.Hashtable;
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
public class ServiceImpl implements Iservice {

	// Déclarer et initialiser la liste des personnes et de comptes

	private Map<Integer, Personne> personnes = new Hashtable<Integer, Personne>();

	private Map<Integer, Compte> comptes = new Hashtable<Integer, Compte>();

	/**
	 * @return the personnes
	 */
	public Map<Integer, Personne> getPersonnes() {
		return personnes;
	}

	/**
	 * @param personnes
	 *            the personnes to set
	 */
	public void setPersonnes(Map<Integer, Personne> personnes) {
		this.personnes = personnes;
	}

	@Override
	public Map<Integer, Personne> createPersonne(Personne p) {
		// TODO Auto-generated method stub
		personnes.put(p.getIdPersonne(), p);
		return personnes;
	}

	@Override
	public void readPersonne(Personne p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePersonne(Personne p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePersonne(Personne p) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Personne> listPersonnes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map <Integer, Compte> createCompte(Compte c) {
		// TODO Auto-generated method stub
		comptes.put(c.getIdCompte(), c);
		return comptes;
	}

	@Override
	public void readCompte(Compte c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateCompte(Compte c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCompte(Compte c) {
		// TODO Auto-generated method stub

	}

	
	@Override
	public void createClub(Club club) {
		// TODO Auto-generated method stub

	}

	@Override
	public void readClub(Club club) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateClub(Club club) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteClub(Club club) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Club> listClubs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createLogin(Login login) {
		// TODO Auto-generated method stub

	}

	@Override
	public void readLogin(Login login) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateLogin(Login login) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteLogin(Login login) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Login> listLogins() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void attribuerCompte(Personne p, Compte c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void affilierClub(Personne p, Club club) {
		// TODO Auto-generated method stub

	}

	@Override
	public void crediterCompte(Compte c, double mt) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debiterCompte(Compte c, double mt) {
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimerCompte(Compte c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void ajouterTitulaire(Compte c, Personne p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void ajouterPersonneClub(Personne p, Club club) {
		// TODO Auto-generated method stub

	}

	@Override
	public void listePersonne(Map<Integer, Personne> personnes) {
		for (Integer cle : personnes.keySet()) {
			System.out.println(" personne " + personnes.get(cle));
		}

	}


	@Override
	public void listeComptes(Map<Integer, Compte> comptes) {
		// TODO Auto-generated method stub
		for (Integer key : comptes.keySet()) {
			System.out.println(comptes.get(key));
		}
		
	}

}
