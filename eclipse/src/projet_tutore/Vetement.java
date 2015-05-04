package projet_tutore;


public class Vetement extends Equipements {
  
    private int encombrement;


    private int solidite;

 // constructeur par défaut 
    
    public Vetement (){
    	super();
    	
    }
    
   // constructeur champs à champs
    
   public Vetement(String nom,int encombrement,int solidite){
	   super(nom);
	   this.encombrement =encombrement;
	   this.solidite=solidite;
   }
    public void equiper() {
    }


    public void desequiper () {
    }

// méthode d'accées
    int getEncombrement() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.encombrement;
    }

   
    void setEncombrement(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.encombrement = value;
    }


    int getSolidite() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.solidite;
    }

   
    void setSolidite(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.solidite = value;
    }

}
	
