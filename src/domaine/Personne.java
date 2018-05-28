package domaine;

public class Personne {

		private int IdPersonne;
		private String nom;
		private String prenom;
		private int age;
		
		// ************* CONSTRUCTEURS ************* //
		public Personne() {
			super();
			// TODO Auto-generated constructor stub
		}


		public Personne(int idPersonne, String nom, String prenom, int age) {
			super();
			IdPersonne = idPersonne;
			this.nom = nom;
			this.prenom = prenom;
			this.age = age;
		}

		
		// ************* GETTERS & SETTERS ************* //

		public int getIdPersonne() {
			return IdPersonne;
		}


		public void setIdPersonne(int idPersonne) {
			IdPersonne = idPersonne;
		}


		public String getNom() {
			return nom;
		}


		public void setNom(String nom) {
			this.nom = nom;
		}


		public String getPrenom() {
			return prenom;
		}


		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}
		
		
		
}
