public class TestGrille {
	public static void main(String args[]){
		
		Grille g = new Grille();
		g.initGrille();
		g.genererMurAleatoire(210);
		g.apparaitreObjetAleatoire(10);
		g.modifierCase(5,3,"5");
		Personnage p1 = new Personnage(g.creerPersonnage());
		Personnage M = new Personnage(g.apparaitreMonstre());
		g.affichageGrille();
		//g.initDeplacer(p1);
		//M.attaquer(p1,new Arme());
		System.out.println("Calcul Initiative "+M.calculInitiative());
		System.out.println("Calcul Esquive "+M.calculEsquive());
		System.out.println("Calcul Attaque "+M.calculAttaque(p1.getArmeGauche()));
		System.out.println("Calcul Defense "+M.calculDefense());
		System.out.println("Calcul Degats "+M.calculDefense());
		 
		
	}
}