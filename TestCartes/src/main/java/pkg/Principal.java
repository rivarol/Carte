package pkg;

public class Principal {

	public static void main(String[] args) {
		JeuDeCarte jDc=new JeuDeCarte();
		jDc.initialiser();
		Carte[] jeu=jDc.getJeuDeCarte();
		
		System.out.println(jeu.length);
		for(Carte c : jeu) {
			System.out.println(c.toString());
		}
	}

}
