public class Potion{
  
    private String nom;
    private int numeroCaracteristique;
    private int bonus;

    // constructeur par défaut 
    public Potion (){
    		this.nom = "";
    		this.numeroCaracteristique = 0;
    		this.bonus=0;
    }
    // constructeur champs a champs
    public Potion(int numeroCaracteristique,String nom,int bonus){ 
    	
    	this.nom = nom;
    	this.numeroCaracteristique = numeroCaracteristique;
    	this.bonus=bonus;
    }
    

    public void utiliser() {
    }


    public int getnumeroCaracteristique() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.numeroCaracteristique;
    }


    public void setNumeroCaracteristique(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.numeroCaracteristique = value;
    }

    
    public int getBonus() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.bonus;
    }

    
    public void setBonus(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.bonus = value;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }

}
