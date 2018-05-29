package domaine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Personne {

		private int IdPersonne;
		private String nom;
		private String prenom;
		private int age;
		private Login login;
		private Collection<Compte> comptes = new HashSet<Compte>();
		private Collection<Club> clubs = new ArrayList<Club>();
		
		// ************* CONSTRUCTEURS ************* //
		/**
		 * @param idPersonne
		 * @param nom
		 * @param prenom
		 * @param age
		 */
		public Personne(int idPersonne, String nom, String prenom, int age) {
			super();
			IdPersonne = idPersonne;
			this.nom = nom;
			this.prenom = prenom;
			this.age = age;
		}

		/**
		 * 
		 */
		public Personne() {
			super();
			// TODO Auto-generated constructor stub
		}

		// ************* GETTERS & SETTERS ************* //	
		
		
		
		/**
		 * @return the idPersonne
		 */
		public int getIdPersonne() {
			return IdPersonne;
		}

		/**
		 * @return the login
		 */
		public Login getLogin() {
			return login;
		}

		/**
		 * @param login the login to set
		 */
		public void setLogin(Login login) {
			this.login = login;
		}

		/**
		 * @return the comptes
		 */
		public Collection<Compte> getComptes() {
			return comptes;
		}

		/**
		 * @param comptes the comptes to set
		 */
		public void setComptes(Collection<Compte> comptes) {
			this.comptes = comptes;
		}

		/**
		 * @return the clubs
		 */
		public Collection<Club> getClubs() {
			return clubs;
		}

		/**
		 * @param clubs the clubs to set
		 */
		public void setClubs(Collection<Club> clubs) {
			this.clubs = clubs;
		}

		/**
		 * @param idPersonne the idPersonne to set
		 */
		public void setIdPersonne(int idPersonne) {
			IdPersonne = idPersonne;
		}

		/**
		 * @return the nom
		 */
		public String getNom() {
			return nom;
		}

		/**
		 * @param nom the nom to set
		 */
		public void setNom(String nom) {
			this.nom = nom;
		}

		/**
		 * @return the prenom
		 */
		public String getPrenom() {
			return prenom;
		}

		/**
		 * @param prenom the prenom to set
		 */
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		/**
		 * @return the age
		 */
		public int getAge() {
			return age;
		}

		/**
		 * @param age the age to set
		 */
		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "Personne [IdPersonne=" + IdPersonne + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
		}


		

		
		
		
		
		
		
}