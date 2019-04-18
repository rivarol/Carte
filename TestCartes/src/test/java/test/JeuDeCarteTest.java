package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pkg.Carte;
import pkg.JeuDeCarte;

public class JeuDeCarteTest {
	private JeuDeCarte jeuDeCarte;
	private Carte[] jeu;
	
	@Before
	public void setUp() throws Exception {
		jeuDeCarte=new JeuDeCarte();
		jeuDeCarte.initialiser();
		jeu=jeuDeCarte.getJeuDeCarte();
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		//Vérification de la taille du tableau
		assertEquals(52, jeu.length);
		
	}
	
	@Test
	public void testAfficheCarte() {
		for(Carte c : jeu )
			System.out.println(c.toString());
	}

}
