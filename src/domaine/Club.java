package domaine;

public class Club {

	private int IdClub;
	private String nomClub;
	
	
	
	// ************* CONSTRUCTEURS ************* //

	/**
	 * @param idClub
	 * @param nomClub
	 */
	public Club(int idClub, String nomClub) {
		super();
		IdClub = idClub;
		this.nomClub = nomClub;
	}


	/**
	 * 
	 */
	public Club() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	// ************* GETTERS & SETTERS ************* //
	
	/**
	 * @return the idClub
	 */
	public int getIdClub() {
		return IdClub;
	}


	/**
	 * @param idClub the idClub to set
	 */
	public void setIdClub(int idClub) {
		IdClub = idClub;
	}


	/**
	 * @return the nomClub
	 */
	public String getNomClub() {
		return nomClub;
	}


	/**
	 * @param nomClub the nomClub to set
	 */
	public void setNomClub(String nomClub) {
		this.nomClub = nomClub;
	}
	
	
}