/**
 * 
 */
package domaine;

/**
 * @author Adminl
 *
 */
public class CompteEpargne extends Compte {
	
	private double pourcentage;
	
	

	public CompteEpargne() {
		super();
	}

	public CompteEpargne(double solde, double pourcentage) {
		super(solde);
		this.pourcentage = pourcentage;
	}

	public CompteEpargne(int idCompte, double solde, double pourcentage) {
		super(idCompte, solde);
		this.pourcentage = pourcentage;
	}

	public double getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(double pourcentage) {
		this.pourcentage = pourcentage;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CompteEpargne "+super.toString()+"pourcentage=" + pourcentage*100 + "%]"; 
	}
	

}
