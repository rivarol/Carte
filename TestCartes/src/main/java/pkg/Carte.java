package pkg;

public class Carte {
	private int valeur;
	private String couleur;
	
	public Carte(int valeur, String couleur) {
		this.valeur=valeur;
		this.couleur=couleur;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		if((valeur <= 10) || (valeur>=15 && valeur<=21) || (valeur>=27 && valeur<=34) || (valeur>=40 && valeur<=47)) {
			return valeur + " de " + couleur;
		}
		else {
			if((valeur==14) || (valeur==26) || (valeur==39)) {
				return couleur+"\n";
			}
			else {
				return couleur;
			}
		}
	}
	
}
