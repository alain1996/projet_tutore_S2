
public class Potion{
  
    private String nom;
    private int numeroCaracteristique;
    private int bonus;

//***************************CONSTRUCTEUR PAR DEFAUT******************************
    public Potion (){
    		this.nom = "";
    		this.numeroCaracteristique = 0;
    		this.bonus=0;
    }

//***************************CONSTRUCTEUR CHAMPS A CHAMPS*************************
    
    public Potion(String nom,int numeroCaracteristique,int bonus){ 
    	
    	this.nom = nom;
    	this.numeroCaracteristique = numeroCaracteristique;
    	this.bonus=bonus;
    }
    

    public void utiliser() {
    }

//************************ACCESSEUR************************************************
    public int getnumeroCaracteristique() {	
        return this.numeroCaracteristique;
    }
    public int getBonus() {
        return this.bonus;
    }
    public String getNom(){
        return this.nom;
    }

 //*********************MUTATEUR***************************************************
   
    public void setNumeroCaracteristique(int value) {
        this.numeroCaracteristique = value;
    }
    
    public void setBonus(int value) {
        this.bonus = value;
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }

}
