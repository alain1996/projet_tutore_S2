public class TestGrille {
	public static void main(String args[]){
		Grille g = new Grille();
		g.initGrille();
		g.caseValide(13,3);
		g.ajoutMur(13,3);
		
		g.affichage();
		System.out.println(g.valeurCase(13, 3));
		
		
	}
}