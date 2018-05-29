/**
 * 
 */
package domaine;

/**
 * @author Adminl
 *
 */
public abstract class Compte {
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "[idCompte=" + idCompte + ", solde=" + solde+ ", " ;
	}


	private int idCompte;
	protected double solde;
	
	protected Personne proprietaire;
	
	public Compte() {
		super();
	}


	public Compte(double solde) {
		super();
		this.solde = solde;
	}


	public Compte(int idCompte, double solde) {
		super();
		this.idCompte = idCompte;
		this.solde = solde;
	}
	
	
	public int getIdCompte() {
		return idCompte;
	}
	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}


	public Personne getProprietaire() {
		return proprietaire;
	}


	public void setPropriotaire(Personne proprietaire) {
		this.proprietaire = proprietaire;
	}
		

}
