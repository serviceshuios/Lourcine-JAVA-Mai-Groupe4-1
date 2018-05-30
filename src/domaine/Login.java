package domaine;

public class Login {

	private int IdLogin;
	private String pseudo;
	private String mdp;
	private Personne personne;
	
	// ************* CONSTRUCTEURS ************* //	
	/**
	 * @param idLogin
	 * @param pseudo
	 * @param mdp
	 */
	public Login(int idLogin, String pseudo, String mdp) {
		super();
		IdLogin = idLogin;
		this.pseudo = pseudo;
		this.mdp = mdp;
	}

	/**
	 * @param idLogin
	 * @param pseudo
	 * @param mdp
	 * @param personne
	 */
	public Login(int idLogin, String pseudo, String mdp, Personne personne) {
		super();
		IdLogin = idLogin;
		this.pseudo = pseudo;
		this.mdp = mdp;
		this.personne = personne;
	}





	/**
	 * 
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	// ************* GETTERS & SETTERS ************* //	
	/**
	 * @return the personne
	 */
	public Personne getPersonne() {
		return personne;
	}


	/**
	 * @param personne the personne to set
	 */
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	/**
	 * @return the idLogin
	 */
	public int getIdLogin() {
		return IdLogin;
	}


	/**
	 * @param idLogin the idLogin to set
	 */
	public void setIdLogin(int idLogin) {
		IdLogin = idLogin;
	}


	/**
	 * @return the pseudo
	 */
	public String getPseudo() {
		return pseudo;
	}


	/**
	 * @param pseudo the pseudo to set
	 */
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}


	/**
	 * @return the mdp
	 */
	public String getMdp() {
		return mdp;
	}


	/**
	 * @param mdp the mdp to set
	 */
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Login [IdLogin=" + IdLogin + ", pseudo=" + pseudo + ", mdp=" + mdp + ", personne=" + personne + "]";
	}
	
	
}
