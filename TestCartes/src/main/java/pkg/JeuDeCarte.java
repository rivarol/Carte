package pkg;

public class JeuDeCarte {
	private Carte[] jeuDeCarte;
	
	public void initialiser() {
		jeuDeCarte= new Carte[52];
		
		//Initialisation des trèfles
		for(int i=0; i<9;i++) {
			jeuDeCarte[i]=new Trefle(i+2, "trèfle");
		}
		jeuDeCarte[9]=new Trefle(11, "Valet de trèfle");
		jeuDeCarte[10]=new Trefle(12, "Dame de trèfle");
		jeuDeCarte[11]=new Trefle(13, "Roi de trèfle");
		jeuDeCarte[12]=new Trefle(14, "As de trèfle");
		
		//Initialisation des coeur
		for(int i=0; i<9;i++) {
			jeuDeCarte[13+i]=new Coeur(i+2, "coeur");
		}
		jeuDeCarte[22]=new Coeur(23, "Valet de coeur");
		jeuDeCarte[23]=new Coeur(24, "Dame de coeur");
		jeuDeCarte[24]=new Coeur(25, "Roi de coeur");
		jeuDeCarte[25]=new Coeur(26, "As de coeur");
		
		//Initialisation des carreau
		for(int i=0; i<9;i++) {
			jeuDeCarte[26+i]=new Carreau(i+2, "carreau");
		}
		jeuDeCarte[35]=new Carreau(36, "Valet de carreau");
		jeuDeCarte[36]=new Carreau(37, "Dame de carreau");
		jeuDeCarte[37]=new Carreau(38, "Roi de carreau");
		jeuDeCarte[38]=new Carreau(39, "As de carreau");
		
		//Initialisation des pique
		for(int i=0; i<9;i++) {
			jeuDeCarte[39+i]=new Pique(i+2, "pique");
		}
		jeuDeCarte[48]=new Pique(49, "Valet de pique");
		jeuDeCarte[49]=new Pique(50, "Dame de pique");
		jeuDeCarte[50]=new Pique(51, "Roi de pique");
		jeuDeCarte[51]=new Pique(52, "As de pique");
	}
	
	public Carte[] getJeuDeCarte() {
		return jeuDeCarte;
	}
	
	public void setJeuDeCarte(Carte[] jeuDeCarte) {
		this.jeuDeCarte = jeuDeCarte;
	}
	
	
}
