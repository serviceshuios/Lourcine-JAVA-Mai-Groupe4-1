/**
 * 
 */
package domaine;

/**
 * @author Adminl
 *
 */
public class CompteSimple extends Compte {
	
	
	private double decouvert;
	
	
	

	public CompteSimple() {
		super();
	}


	public CompteSimple(int idCompte, double solde, double decouvert) {
		super(idCompte, solde);
		this.decouvert = decouvert;
	}


	public CompteSimple(double solde, double decouvert) {
		super(solde);
		this.decouvert = decouvert;
	}


	public double getDecouvert() {
		return decouvert;
	}


	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	
	
	
	

}
