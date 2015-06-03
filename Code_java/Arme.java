

public class Arme {
	
	private String nom;
    private int[] impact;
    private int[] maniabilite;
    
//*******************CONSTRUCTEUR PAR DEFAUT**********************
    
    public Arme(){
    	super();
    	this.impact = new int[2];
    	this.maniabilite= new int[2];
    }
    
//****************CONSTRUCTEUR CHAMPS A CHAMPS******************
    
   public Arme(String nom,int[] impact,int[] maniabilite){
	   super();
	   this.impact=impact;
	   this.maniabilite=maniabilite;
   }
//*********************EQUIPER*************************************
    public void equiper() {
        
    }
//********************DESQUIPER************************************
    
    public void desequiper() {
        
    }
//*******************ACCESSEUR************************************
   
    public int []getImpact() {
        return this.impact;
    }
    public String getNom(){
        return this.nom;
    }
    public int[] getManiabilite() {
        return this.maniabilite;
    }

//****************MUTATEUR****************************************

   public  void setImpact(int [] value) {
        this.impact = value;
    }

    public void setManiabilite(int []value) {
        this.maniabilite = value;
    }
    
    public void setNom(String nom){
        this.nom=nom;
    }
 //*******************TO STRING**********************************
    public String toString(){
       	return "le nom"+this.nom+"impact:"+this.impact+"maniabilite"+this.maniabilite;
       }

}

