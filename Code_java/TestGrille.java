public class TestGrille {
	public static void main(String args[]){
		Grille g = new Grille();
		g.initGrille();
		g.genererMurAleatoire(80);
		Personnage p1 = new Personnage(g.creerPersonnage());
		g.affichageGrille();
		g.initDeplacer(p1);
		g.affichageGrille();
		
		
	}
}