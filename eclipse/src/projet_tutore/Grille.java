public class Grille {
   
	// declaration des variables
    private int tailleAbscisse;
    private int tailleOrdonnee;
    private char[] carte;
 
    // constructeur par défaut
    public Grille() { 
    	this.tailleAbscisse = 50;
    	this.tailleOrdonnee = 20;
    	this.carte = new char[400];
    }
   
    // construteur champs à champs
    public Grille(int tailleAbscisse, int tailleOrdonnee, char[] carte){
    	this.tailleAbscisse = tailleAbscisse;
    	this.tailleOrdonnee = tailleOrdonnee;
    	this.carte = carte;
    }
    
    public void initGrille() {
    	this.carte= new char[this.tailleAbscisse*this.tailleOrdonnee];
    	for(int i=0;i<this.tailleAbscisse*this.tailleOrdonnee;i++){
    		this.carte[i]=' ';
    	}
    	for(int i=0;i<this.tailleAbscisse;i++){
    		this.carte[i]='#';
    	}
    	for(int i=(this.tailleOrdonnee-1)*this.tailleAbscisse;i<this.tailleOrdonnee*this.tailleAbscisse;i++){
    		this.carte[i]='#';
    	}
    	for(int i=0;i<this.tailleOrdonnee*this.tailleAbscisse;i+=this.tailleAbscisse){
    		this.carte[i]='#';
    	}
    	for(int i=this.tailleAbscisse-1;i<this.tailleOrdonnee*this.tailleAbscisse;i+=this.tailleAbscisse){
    		this.carte[i]='#';
    	}
    }

    public boolean caseValide(int x, int y){
    	if(x>=0 && x<this.tailleAbscisse && y>=0 && y<this.tailleOrdonnee){
    		return(true);
    	}
    	else{
    		return(false);
    	}
    }

    public void ajoutMur(int x, int y){
    	if(caseValide(x,y)){
    		this.carte[x+y*this.tailleAbscisse]='#';
    	}
    }
    
    public int valeurCase(int x, int y){
    	if(caseValide(x,y)){
    		return(this.carte[x+this.tailleAbscisse*y]);
    	}
    	else{ 
    		return(-2);
    	}
    }

    public void modifierCase(int x, int y, char valeur){
    	if(valeurCase(x,y) != -2){
    		this.carte[x+this.tailleAbscisse*y] = valeur;
    	}
    }
    
    public void affichage(){
    	String Newligne=System.getProperty("line.separator");
    	for(int i=0;i<this.tailleOrdonnee;i++){
    		for(int j=0;j<this.tailleAbscisse;j++){
    			System.out.print(this.carte[j+i*this.tailleAbscisse]);
    		}
    		System.out.print(Newligne);
    	}
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
    
    char[] getCarte() {
    	return this.carte;
    }

    void setCarte(char[] value){
    	this.carte = value;
    }
    
}