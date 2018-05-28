package domaine;

public class Login {

	private int IdLogin;
	private String pseudo;
	private String mdp;
	
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
	 * 
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	// ************* GETTERS & SETTERS ************* //	

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
	
	
}
