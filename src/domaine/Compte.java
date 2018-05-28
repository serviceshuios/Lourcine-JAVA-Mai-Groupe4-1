/**
 * 
 */
package domaine;

/**
 * @author Adminl
 *
 */
public class Compte {
	
	private int idCompte;
	private double solde;
	
	
	
	
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
	
	
	

}
