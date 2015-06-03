
public class Vetement{
  
    private String nom;
    private int encombrement;
    private int[] solidite;
    

//*******************CONSTRUCTEUR PAR DEFAUT************************ 
    
    public Vetement (){
        this.nom = "default";
    	this.encombrement = 0;
    	this.solidite = new int[2];
    }
    
//***************CONSTRUCTEUR CHAMPS A CHAMPS**********************
    
   public Vetement(String nom,int encombrement,int[] solidite){
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
    
    
   public int getEncombrement() {
        return this.encombrement;
    }
    
  public  int[] getSolidite() {
        return this.solidite;
    }
//****************MUTATEUR************************************

   public void setNom(String nom){
        this.nom = nom;
    }
    
   public void setEncombrement(int value) {
        this.encombrement = value;
    }
    
   public void setSolidite(int[] value) {
        this.solidite = value;
    }
   //********************TO STRING******************************
   public String toString(){
      	return "le nom"+this.nom+"encombrement"+this.encombrement+"solidite"+this.solidite;
      }

}
	
