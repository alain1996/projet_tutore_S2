package projet_tutore;

import java.util.Scanner;

public class Grille {
   
	
    private int tailleAbscisse;
    private int tailleOrdonnee;
    private String[] carte;
    
    public static final int ABSCISSE = 20;
    public static final int ORDONNEE = 20;
    
    public static final int HAUT=1;
    public static final int BAS =2;
    public static final int DROITE=3;
    public static final int GAUCHE=4;
 
    // constructeur par défaut
    public Grille() { 
    	this.tailleAbscisse = ABSCISSE;
    	this.tailleOrdonnee = ORDONNEE;
    	this.carte = new String[400];
    }
   
    // construteur champs à champs
    public Grille(int tailleAbscisse, int tailleOrdonnee, String[] carte){
    	this.tailleAbscisse = tailleAbscisse;
    	this.tailleOrdonnee = tailleOrdonnee;
    	this.carte = carte;
    }
    
    public void initGrille() {
    	this.carte= new String[this.tailleAbscisse*this.tailleOrdonnee];
    	for(int i=0;i<this.tailleAbscisse*this.tailleOrdonnee;i++){
    		this.carte[i]=" ";
    	}
    	for(int i=0;i<this.tailleAbscisse;i++){
    		this.carte[i]="#";
    	}
    	for(int i=(this.tailleOrdonnee-1)*this.tailleAbscisse;i<this.tailleOrdonnee*this.tailleAbscisse;i++){
    		this.carte[i]="#";
    	}
    	for(int i=0;i<this.tailleOrdonnee*this.tailleAbscisse;i+=this.tailleAbscisse){
    		this.carte[i]="#";
    	}
    	for(int i=this.tailleAbscisse-1;i<this.tailleOrdonnee*this.tailleAbscisse;i+=this.tailleAbscisse){
    		this.carte[i]="#";
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
    		this.carte[x+y*this.tailleAbscisse]="#";
    	}
    }
    
    public String valeurCase(int x, int y){
    	if(caseValide(x,y)){
    		return(this.carte[x+this.tailleAbscisse*y]);
    	}
    	else{ 
    		return("-2");
    	}
    }

    public void modifierCase(int x, int y, String valeur){
    	if(valeurCase(x,y) != "-2"){
    		this.carte[x+this.tailleAbscisse*y] = valeur;
    	}
    }
    
    public void genererMurAleatoire(int nombre){
    	for(int i=0;i<nombre;i++){
    		this.carte[(int) (Math.random()*this.tailleAbscisse*this.tailleOrdonnee)]="#";
    	}
    }
    
    public void affichageGrille(){
    	for(int i=0;i<this.tailleOrdonnee;i++){
    		for(int j=0;j<this.tailleAbscisse;j++){
    			System.out.print(this.carte[j+i*this.tailleAbscisse]);
    		}
    		System.out.print('\n');
    	}
    }
     //*******************SE DEPLACER******************************
    
    public void seDeplacer(int Direction, Personnage p) {
                if(Direction ==HAUT){                                                      
                          if(valeurCase(p.getAbscisse(),p.getOrdonnee()-1) == "0"){ 
                              p.setOrdonnee(p.getOrdonnee()-1);        
                         }
                }
                if(Direction ==GAUCHE){                                                     
                          if(valeurCase(p.getAbscisse()-1,p.getOrdonnee()) == "0"){ 
                              p.setAbscisse(p.getAbscisse()-1);        
                         }
                  } 
                if(Direction ==DROITE){                                                     
                         if(valeurCase(p.getAbscisse()+1,p.getOrdonnee()) == "0"){  
                              p.setAbscisse(p.getAbscisse()+1);        
                         }
                 }
                 if(Direction ==BAS){                                                       
                          if(valeurCase(p.getAbscisse(),p.getOrdonnee()+1) == "0"){ 
                              p.setOrdonnee(p.getOrdonnee()+1);        
                         }
                 }
        
    }
     //*******************INIT DEPLACER******************************
    
    public void initDeplacer(Personnage personnage){
        int a=0;
        do{
            Scanner sc= new Scanner(System.in);
            System.out.println("Veuillez Saisir le déplacement");
            a= sc.nextInt();
            if(a>0&&a<5){
              seDeplacer(a,personnage);
            }
            else{
                System.out.println("Erreur saisie n'est pas bon");
            }
            sc.close();
        }while (a<1||a>4);
    }
    
    public void identificationObjet(int x, int y){
        String a = valeurCase(x,y);
        if (a=="#"){
            System.out.println("mur");
        }
        if (a==" "){
            System.out.println("Case Vide");
        }
        if (a=="S"){
            System.out.println("Squelette");
        }
        if (a=="G"){
            System.out.println("Gobelin");
        }
        if (a=="1"){
            System.out.println("Joueur 1");
        }
        if (a=="2"){
            System.out.println("Joueur 2");
        }
        if (a=="3"){
            System.out.println("Potion de force");
        }
        if (a=="4"){
            System.out.println("Potion de resistance");
        }
        if (a=="5"){
            System.out.println("Potion d'adresse");
        }
        if (a=="6"){
            System.out.println("Potion de vie");
        }
        if (a=="7"){
            System.out.println("Potion d'action");
        }
        if (a=="8"){
            System.out.println("Vetements en cuir");
        }
        if (a=="9"){
            System.out.println("Vetements en maille");
        }
        if (a=="10"){
            System.out.println("Vetements en fer");
        }
        if (a=="11"){
            System.out.println("Epee en bois");
        }
        if (a=="12"){
            System.out.println("Epee en pierre");
        }
        if (a=="13"){
            System.out.println("Epee en fer");
        }
    }



// mutateurs et accesseurs
    
   public  int getTailleAbscisse() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.tailleAbscisse;
    }

   public  void setTailleAbscisse(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.tailleAbscisse = value;
    }

  public   int getTailleOrdonnee() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.tailleOrdonnee;
    }

   public  void setTailleOrdonnee(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.tailleOrdonnee = value;
    }
    
   public String[] getCarte() {
    	return this.carte;
    }

   public  void setCarte(String[] value){
    	this.carte = value;
    }
    
}
