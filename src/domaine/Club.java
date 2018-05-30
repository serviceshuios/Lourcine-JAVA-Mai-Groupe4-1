package domaine;

import java.util.ArrayList;
import java.util.List;

public class Club {

	private int IdClub;
	private String nomClub;
	private List<Personne> personnes = new ArrayList<Personne>();
	
	
	
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
	 * @param idClub
	 * @param nomClub
	 * @param personnes
	 */
	public Club(int idClub, String nomClub, List<Personne> personnes) {
		super();
		IdClub = idClub;
		this.nomClub = nomClub;
		this.personnes = personnes;
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
	 * @return the personnes
	 */
	public List<Personne> getPersonnes() {
		return personnes;
	}


	/**
	 * @param personnes the personnes to set
	 */
	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
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


	@Override
	public String toString() {
		return "Club [IdClub=" + IdClub + ", nomClub=" + nomClub + "]";
	}
	
	
	
	
}