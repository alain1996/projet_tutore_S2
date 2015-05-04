package projet_tutore;

public class Grille {
   
	// declaration des variables
    private int tailleAbscisse;

    private int tailleOrdonnee;
 
    // constructeur par défaut
    
    public Grille() { 
    	this.tailleAbscisse = 0;
    	this.tailleOrdonnee = 0;
    } 
    
    // construteur champs à champs
    public Grille(int tailleAbscisse, int tailleOrdonne){
        
    	this.tailleAbscisse = tailleAbscisse;
    	this.tailleOrdonnee =tailleOrdonnee;
    }
    
    public void initGrille() {
    }


    public void affichage() {
    }


    public boolean caseVide (int abscisse, int ordonnee) {
    	
    	return false;
    }

// methode d'acces
    
    int getTailleAbscisse() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.tailleAbscisse;
    }

    void setTailleAbscisse(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.tailleAbscisse = value;
    }


    int getTailleOrdonnee() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.tailleOrdonnee;
    }


    void setTailleOrdonnee(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.tailleOrdonnee = value;
    }

}
