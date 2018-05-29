package domaine;
/**
 * 
 */

/**
 * @author Adminl
 *
 */
public class ComptePayant extends Compte {
	
	private double taux;
	
	

	public ComptePayant() {
		super();
	}

	public ComptePayant(double solde, double taux) {
		super(solde);
		this.taux = taux;
	}

	public ComptePayant(int idCompte, double solde, double taux) {
		super(idCompte, solde);
		this.taux = taux;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ComptePayant "+super.toString()+"taux=" + taux*100 + "%]"; 
	}
	
	
	

}
