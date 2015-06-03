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
 
//******************************CONSTRUCTEUR PAR DEFAUT****************************
    public Grille() { 
    	this.tailleAbscisse = ABSCISSE;
    	this.tailleOrdonnee = ORDONNEE;
    	this.carte = new String[ABSCISSE*ORDONNEE];
    }
   
//******************************CONSTRUCTEUR CHAMPS A CHAMPS***********************
    public Grille(int tailleAbscisse, int tailleOrdonnee, String[] carte){
    	this.tailleAbscisse = tailleAbscisse;
    	this.tailleOrdonnee = tailleOrdonnee;
    	this.carte = carte;
    }
//******************************INITGRILLE**************************************
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
//*************************CASE VALIDE****************************************
    public boolean caseValide(int x, int y){
    	if(x>=0 && x<this.tailleAbscisse && y>=0 && y<this.tailleOrdonnee){
    		return(true);
    	}
    	else{
    		return(false);
    	}
    }
//*************************AJOUTE_MUR****************************************
    public void ajoutMur(int x, int y){
    	if(caseValide(x,y)){
    		this.carte[x+y*this.tailleAbscisse]="#";
    	}
    }
//***************************VALEUR_CASE**************************************
    public String valeurCase(int x, int y){
    	if(caseValide(x,y)){
    		return(this.carte[x+this.tailleAbscisse*y]);
    	}
    	else{ 
    		return("-1");
    	}
    }
//*************************MODIFIER_CASE*************************************
    public void modifierCase(int x, int y, String valeur){
    	if(valeurCase(x,y) != "-1"){
    		this.carte[x+this.tailleAbscisse*y] = valeur;
    	}
    }
//************************GENERATEUR_ALEATOIRE*******************************  
    public void genererMurAleatoire(int nombre){
    	for(int i=0;i<nombre;i++){
    		this.carte[(int) (Math.random()*this.tailleAbscisse*this.tailleOrdonnee)]="#";
    	}
    }
//************************APPARAITRE_MONSTRE*********************************   
    public Personnage apparaitreMonstre(){
    	int x;
    	int a,b,c;
    	int[] d = new int[2];
    	int[] y = new int[2];
   		x = (int)(Math.random()*2);
    	y = caseAleatoireVide();
    	d[0] = 1;
		d[1] = 2;
		String nom = new String();
		String symbole = new String();
    	if(x==0){    	    		
    		a =(int)(Math.random()*4+4);
       		b =(int)(Math.random()*4+3);
       		c =(int)(Math.random()*4);
   	    	nom = "Squelette";
   	    	symbole = "S";
    	}
    	else{
    		a =(int)(Math.random()*4+2);
   	    	b =(int)(Math.random()*4+1);
   	   		c =(int)(Math.random()*4+4);
   	   		nom = "Gobelin";
   	   		symbole = "G";
    	}
    	Personnage p = new Personnage(nom,a,b,c,0,0,0,y[0],y[1],new Potion[0],new Vetement(),new Arme("Epee en bois",d,d),new Arme());	
		modifierCase(y[0],y[1],symbole);    	
    	return(p);
    }
//**************************************APPARAITRE_OBJET_ALEATOIRE*********************************
    public void apparaitreObjetAleatoire(int nombre){           
    	int x;
    	String z;
    	int y=0;
    	for(int i=0;i<nombre;i++){
    		x =(int)(Math.random()*11);
    		z = convertirObjet(x);
    		y = (int) (Math.random()*this.tailleAbscisse*this.tailleOrdonnee);
    		if (carte[y]==" "){
    			this.carte[y]=z;
    		}
    	}
    }
//*******************************CONVERTIR_OBJETS**********************************************	   
    public String convertirObjet(int valeur){
    	if(valeur==0){
    		return("3");
    	}
    	if(valeur==1){
    		return("4");
    	}
    	if(valeur==2){
    		return("5");
    	}
    	if(valeur==3){
    		return("6");
    	}
    	if(valeur==4){
    		return("7");
    	}
    	if(valeur==5){
    		return("8");
    	}
    	if(valeur==6){
    		return("9");
    	}
    	if(valeur==7){
    		return("10");
    	}
    	if(valeur==8){
    		return("11");
    	}
    	if(valeur==9){
    		return("12");
    	}
    	if(valeur==10){
    		return("13");
    	}
    	return null;
    	
    }
//************************AFFICHAGE_GRILLE*********************************
    public void affichageGrille(){
    	
    	for(int i=0;i<this.tailleAbscisse;i++){
    		for(int j=0;j<this.tailleOrdonnee;j++){
    			if(valeurCase(i,j)=="3"||valeurCase(i,j)=="4"||valeurCase(i,j)=="5"||valeurCase(i,j)=="6"||valeurCase(i,j)=="7"){
    				System.out.print("p");
    			}
    			else if(valeurCase(i,j)=="8"||valeurCase(i,j)=="9"||valeurCase(i,j)=="10"){
    				System.out.print("v");
    			}
    			else if(valeurCase(i,j)=="11"||valeurCase(i,j)=="12"||valeurCase(i,j)=="13"){
    				System.out.print("a");
    			}
    			else{
    				System.out.print(valeurCase(i,j));
    			}
    		}
    		System.out.print('\n');
    	}
    	
    }
//********************************AFFICHAGE_CARACTERISTIQUE***********************
    public void affichageCaracteristique(Personnage p1){
    	Grille g=new Grille();
    	g.initGrille();
        System.out.println("Vos caractÈristique");
        System.out.println("Force: "+p1.getForce());
        System.out.println("Adresse: "+p1.getAdresse());
		System.out.println("Resistance: "+p1.getResistance());
		System.out.println("Point D'action: "+p1.getPointsAction());
		System.out.println("Points D'expÈrience: "+p1.getPointsExperience());
		System.out.println("Niveau de Blessure: "+p1.getNiveauBlessure());
        
    }
//*****************************CASE_ALEATOIRE_VIDE*********************************
    public int[] caseAleatoireVide(){
    	int[] res=new int[2];
    	res[1]=-1;
    	res[0]=-1;
        while(res[0]<0||res[1]<0||valeurCase(res[0],res[1])!=" "){
            res[0] = (int) (Math.random()*this.tailleAbscisse);
            res[1] = (int) (Math.random()*this.tailleOrdonnee);
        }
        return res;
    }
  //*****************************CREER_PERSONNAGE*********************************    
    public Personnage creerPersonnage(){
        int[] position = new int[2];
        position = caseAleatoireVide();
        Personnage p = new Personnage("Joueur",0,0,0,6,0,0,position[0],position[1],new Potion[0],new Vetement(),new Arme(),new Arme());
        modifierCase(position[0],position[1],"1");
        return(p);
    }
    
    
     //*******************SE DEPLACER******************************
    
    public boolean seDeplacer(int Direction, Personnage p) {
                if(Direction ==GAUCHE){                                                      
                         if(valeurCase(p.getAbscisse(),p.getOrdonnee()-1) == " "){ 
                        	 modifierCase(p.getAbscisse(),p.getOrdonnee()," ");
                             p.setOrdonnee(p.getOrdonnee()-1);      
                         }
                         else{
                        	 return(false);
                         }
                         
                }
                if(Direction ==HAUT){                                                     
                         if(valeurCase(p.getAbscisse()-1,p.getOrdonnee()) == " "){ 
                        	 modifierCase(p.getAbscisse(),p.getOrdonnee()," ");
                             p.setAbscisse(p.getAbscisse()-1);                          
                         }
                         else{
                        	 return(false);
                         }
                  } 
                if(Direction ==BAS){                                                     
                         if(valeurCase(p.getAbscisse()+1,p.getOrdonnee()) == " "){  
                        	 modifierCase(p.getAbscisse(),p.getOrdonnee()," ");
                        	 p.setAbscisse(p.getAbscisse()+1);                             
                         }
                         else{
                        	 return(false);
                         }
                 }
                 if(Direction ==DROITE){                                                       
                         if(valeurCase(p.getAbscisse(),p.getOrdonnee()+1) == " "){ 
                        	 modifierCase(p.getAbscisse(),p.getOrdonnee()," ");
                        	 p.setOrdonnee(p.getOrdonnee()+1);                              
                         }
                         else{
                        	 return(false);
                         }
                 }
                 modifierCase(p.getAbscisse(),p.getOrdonnee(),"1");
                 return(true);
    }
     //*******************INIT DEPLACER******************************
    
    public void initDeplacer(Personnage personnage){
        int a,i=0;
        boolean q;
        Scanner sc= new Scanner(System.in);
        do{
        	System.out.println("\n");
        	
        	System.out.println("\n");
        	do{
        		
        		System.out.println("Veuillez Saisir le deplacement:");
        		System.out.println("1-Haut");
        		System.out.println("2-Bas");
        		System.out.println("3-Droite");
        		System.out.println("4-Gauche");
        		a= sc.nextInt();
        		
        		if(a>0&&a<5){
        			q=seDeplacer(a,personnage);
        			if(q){
        				i++;
        			}
        		}
        		else{
        			System.out.println("Erreur saisie n'est pas bon");
        		}
        	}while (a<1||a>4);
        	affichageGrille();
        }while(i<5);
       
    }

  //*****************************IDENTIFICATION_OBJET*********************************
    public void identificationObjet(int x, int y){
        String a = valeurCase(x,y);
        switch (a){
        	case "#" : System.out.println("Mur");
        	case " " : System.out.println("Case Vide");
        	case "S" : System.out.println("Squelette");
        	case "G" : System.out.println("Gobelin");
        	case "1" : System.out.println("Joueur 1");
        	case "2" : System.out.println("Joueur 2");
        	case "3" : System.out.println("Potion de force");
        	case "4" : System.out.println("Potion de resistance");
        	case "5" : System.out.println("Potion d'adresse");
        	case "6" : System.out.println("Potion de vie");
        	case "7" : System.out.println("Potion d'action");
        	case "8" : System.out.println("Vetements en cuir");
        	case "9" : System.out.println("Vetements en maille");
        	case "10" : System.out.println("Vetements en fer");
        	case "11" : System.out.println("Epee en bois");
        	case "12" : System.out.println("Epee en pierre");
        	case "13" : System.out.println("Epee en fer");
        }
    }  

//*********************ACCESSEUR******************************
    
   public  int getTailleAbscisse() {
        return this.tailleAbscisse;
    }
   
   public String[] getCarte() {
    	return this.carte;
    }
  
  public   int getTailleOrdonnee() {
        return this.tailleOrdonnee;
    }
//*******************MUTATEUR*********************************
   public  void setTailleOrdonnee(int value) {
        this.tailleOrdonnee = value;
    }
   public  void setCarte(String[] value){
    	this.carte = value;
    }
   public  void setTailleAbscisse(int value) {
       this.tailleAbscisse = value;
   }
   
//************************TO STRING******************************
   public String toString(){
   	return "l'abscisse"+this.tailleAbscisse+"l'ordonnee"+this.tailleOrdonnee+"la carte"+this.carte;
   }
   
}
