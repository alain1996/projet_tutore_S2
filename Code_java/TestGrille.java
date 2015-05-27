public class TestGrille {
	public static void main(String args[]){
		Grille g = new Grille();
		g.initGrille();
		g.ajoutMur(4, 4);
		
		g.affichageGrille();
		g.identificationObjet(4,4);
		g.identificationObjet(13, 3);
	}
}