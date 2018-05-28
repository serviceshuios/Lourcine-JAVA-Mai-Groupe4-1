package domaine;

public class Personne {

		private int IdPersonne;
		private String nom;
		private String prenom;
		private int age;
		
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
		

		
		
		
		
		
		
}