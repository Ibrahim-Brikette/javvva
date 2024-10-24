package tp3;

public class Livre { 
	private String titre,auteur;
	private int nbPages;
	//Constructeur
	public Livre(String auteur,String titre) {
	this.auteur=auteur;
	this.titre=titre;
	}
	//Accesseur=Getteur
	public String getAuteur() {
		return(auteur);
		
	}
	//Setteur
	public void setNbPages(int nbPages) {
		this.nbPages=nbPages;
	}
	public String getTitre() {
		return(titre);
	}
	public int getNbPages() {
		return(nbPages);
	}
	public void setAuteur(String nAuteur) {
		auteur=nAuteur;
		
	}
	public void setTitre(String nTitre) {
		titre=nTitre;
	}
	void affichier() {
		System.out.println("le livre son titre est "+ getTitre()+"son auteur  est "+getAuteur()+" son nombre de pages est "+ getNbPages());

		
	}
}
