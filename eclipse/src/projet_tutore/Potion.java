package projet_tutore;


public class Potion extends Equipements {
  
    private String caracteristique;


    private int bonus;

    // constructeur par défaut 
    public Potion (){
    		super();
    		this.caracteristique = "";
    		this.bonus=0;
    }
    // constructeur champs a champs
    public Potion(String caracteristique,String nom,int bonus){ 
    	
    	super(nom);
    	this.caracteristique= caracteristique;
    	this.bonus=bonus;
    }
    

    public void utiliser() {
    }


    String getCaracteristique() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.caracteristique;
    }


    void setCaracteristique(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.caracteristique = value;
    }

    
    int getBonus() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.bonus;
    }

    
    void setBonus(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.bonus = value;
    }

}
