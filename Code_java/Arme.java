public class Arme{

	
	
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
    // accesseur et mutateur.
    public int []getImpact() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.impact;
    }
    public String getNom(){
        return this.nom;
    }
    public int[] getManiabilite() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.maniabilite;
    }

//****************MUTATEUR************************************

   public  void setImpact(int [] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.impact = value;
    }

    public void setManiabilite(int []value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.maniabilite = value;
    }
    
    public void setNom(String nom){
        this.nom=nom;
    }

}

