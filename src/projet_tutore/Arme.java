package projet_tutore;


public class Arme extends Equipements {

	
	//déclaration des variables
    private int impact;
    private int maniabilite;
    
    // constructeur par défaut
    
    public Arme(){
    	super();
    	
    }
    
    //constructeur champs a champs
    
   public Arme(int impact,int maniabilite,String nom){
	   super(nom);
	   this.impact=impact;
	   this.maniabilite=maniabilite;
   }
    
    public void equiper() {
    }

    
    public void desequiper() {
    }

    
    int getImpact() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.impact;
    }

    
    void setImpact(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.impact = value;
    }


    int getManiabilite() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.maniabilite;
    }


    void setManiabilite(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.maniabilite = value;
    }

}

