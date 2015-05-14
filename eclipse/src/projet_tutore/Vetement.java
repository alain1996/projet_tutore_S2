public class Vetement{
  
    private String nom;
    private int[] encombrement;
    private int[] solidite;

//*******************CONSTRUCTEUR PAR DEFAUT************************ 
    
    public Vetement (){
        this.nom = "default";
    	this.encombrement = new encombrement[2];
    	this.solidite = 0;
    }
    
//***************CONSTRUCTEUR CHAMPS A CHAMPS**********************
    
   public Vetement(String nom,int encombrement,int solidite){
	   this.nom = nom;
	   this.encombrement =encombrement;
	   this.solidite=solidite;
   }
//*********************EQUIPER*************************************
    public void equiper() {
    }

//********************DESQUIPER************************************
    public void desequiper () {
    }

//*******************ACCESSEUR************************************
    public String getNom(){
        return this.nom;
    }
    
    
   public int[] getEncombrement() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.encombrement;
    }
    
  public  int[] getSolidite() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.solidite;
    }
//****************MUTATEUR************************************

   public void setNom(String nom){
        this.nom = nom;
    }
    
   public void setEncombrement(int[] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.encombrement = value;
    }
    
   public void setSolidite(int[] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.solidite = value;
    }

}
	
