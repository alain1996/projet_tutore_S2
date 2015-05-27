public class Personnage {

    public static final int Personnage_constant = 0;

    private String nom;
    private int force;
    private int adresse;
    private int resistance;
    private int pointsAction;
    private int pointsExperience;
    private int niveauBlessure;
    private int abscisse;
    private int ordonnee;
    private Potion[] inventairePotions;
    private Vetement vetement;
    private Arme armeGauche;
    private Arme armeDroite;
    
     //*******************CONSTRUCTEUR PAR DEFAUT******************************
     
    public Personnage(){
        this.nom = "default";
        this.force = 0;
        this.adresse = 0;
        this.resistance = 0;
        this.pointsAction = 0;
        this.pointsExperience = 0;
        this.niveauBlessure = 0;
        this.abscisse = 0;
        this.ordonnee = 0;
        this.inventairePotions[0] =new Potion();
        for(int i=0;i<this.inventairePotions.length;i++){
        	this.inventairePotions[i]=new Potion();
        }
        this.vetement = new Vetement();
        this.armeGauche = new Arme();
        this.armeDroite = new Arme();
    }
    
     //*******************CONSTRUCTEUR CHAMPS A CHAMPS******************************
     
    public Personnage(String nom, int force, int adresse, int resistance, int pointsAction, int pointsExperience, int niveauBlessure, int abscisse, int ordonnee, Potion[] inventairePotions, Vetement vetement, Arme armeGauche, Arme armeDroite){
    	this.nom = nom;
    	this.force = force;
        this.adresse = adresse;
        this.resistance = resistance;
        this.pointsAction = pointsAction;
        this.pointsExperience = pointsExperience;
        this.niveauBlessure = niveauBlessure;
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
        this.inventairePotions = inventairePotions;
        this.vetement = vetement;
        this.armeGauche = armeGauche;
        this.armeDroite = armeDroite;

    }
    
    //*******************CONSTRUCTEUR PAR COPIE******************************
    
    public Personnage(Personnage p){
    	this.nom = p.getNom();
    	this.force = p.force;
        this.adresse = p.adresse;
        this.resistance = p.resistance;
        this.pointsAction = p.pointsAction;
        this.pointsExperience = p.pointsExperience;
        this.niveauBlessure = p.niveauBlessure;
        this.abscisse = p.abscisse;
        this.ordonnee = p.ordonnee;
        this.inventairePotions = p.getInventairePotions();
        this.vetement = p.getVetement();
        this.armeGauche = p.getArmeGauche();
        this.armeDroite = p.getArmeDroite();

    }
    
    //*******************CALCUL INITIAVE******************************

    public int calculInitiative() {
        int x = this.adresse-this.vetement.getEncombrement();
        return (x);
    }
    
    //*******************CALCUL ATTAQUE********************************

    public int calculAttaque(Arme armeUtilisee) {
        int x = this.adresse+armeUtilisee.getManiabilite()[1];
        
                  int y=0;
                  for(int i=0;i<armeUtilisee.getManiabilite()[0];i++){
                     y+=tirageAleatoire();
        }
        return (x+y);
    }
    
    //*******************CALCUL ESQUIVE******************************
    
    public int calculEsquive() {
        int x = this.adresse-this.vetement.getEncombrement();
        return (x);
    }
    
    //*******************CALCUL DEFENSE*******************************
    
    public int calculDefense() {
        int x = this.resistance+this.vetement.getSolidite()[1];
        int y = 0;
        for(int i=0;i<this.vetement.getSolidite()[0];i++){
            y+=tirageAleatoire();
        }
        return (x+y);
    }
    
    //*******************CALCUL DEGATS******************************
    
    public int calculDegats(Arme armeUtilisee) {
        int x = this.force+armeUtilisee.getImpact()[1];
        int y = 0;
        for(int i=0;i<armeUtilisee.getImpact()[0];i++){
            y+=tirageAleatoire();
        }
        return (x+y);
    }
    
    //*******************ATTAQUER******************************
    
    public void attaquer(Personnage cible, Arme armeUtilisee) {
        int x = calculAttaque(armeUtilisee);
        int y = cible.calculEsquive();
        System.out.println("Tirage attaque = "+x);
        System.out.println("Tirage esquive = "+y);
        if(y>=x){
            System.out.println("Raté");
        }
        else{
            System.out.println("Touché");
            int z = cible.calculDefense();
            int a = calculDegats(armeUtilisee);
            System.out.println("Tirage Defense = "+z);
            System.out.println("Tirage Degats = "+a);
            if(z<a){
                System.out.println("Blessure : +"+(a-z));
                cible.setNiveauBlessure(cible.getNiveauBlessure()
						+ (a-z));
            }
            else{
                System.out.println("Pas blessé");
            }
        }
    }
    
   
    
   
    //*******************UTILISER POTION*****************************
    
    public void utiliserPotion(Potion potion){
        potion.utiliser();
    }
    
    //*******************DEPOSER OBJET*******************************
    
    public void deposerObjet(){
    }
    
    //*******************RAMASSER OBJET******************************
    
    public void ramasserObjet(){
    }
    //*******************FINIR TOUR**********************************
    
    public void finirTour() {
    }
     //*******************TIRAGE ALÉATOIRE***************************
    public int tirageAleatoire() {
            return((int) (Math.random()*6+1));
    }
    
    //*******************PERDRE OBJETS******************************
    
    public void perdreObjets() {
    }

    //*************************ACCESSEUR****************************
    
   public  int getForce() {
        return this.force;
    }
    public int getAdresse() {
        return this.adresse;
    }
    
    public int getPointsAction() {
        return this.pointsAction;
    }
   
    public String getNom() {
        return this.nom;
    }
    
   public  int getPointsExperience() {
        return this.pointsExperience;
    }
   
   public  int getResistance() {
        return this.resistance;
    }
   
    public int getAbscisse() {
        return this.abscisse;
    }
    
    public int getOrdonnee() {
        return this.ordonnee;
    }
    
    public Potion[] getInventairePotions() {
    	return this.inventairePotions;
    }
    
    public Vetement getVetement(){
    	return this.vetement;
    }
    
     //*************************MUTATEUR***************************
     
    public void setOrdonnee(int value) {
        this.ordonnee = value;
    }
    public void setForce(int value) {
        this.force = value;
    }
    public void setAbscisse(int value) {
        this.abscisse = value;
    }
    public  void setResistance(int value) {
        this.resistance = value;
    }
    public  void setPointsExperience(int value) {
        this.pointsExperience = value;
    }
     public void setPointsAction(int value) {
        this.pointsAction = value;
    }
    public void setNom(String value) {
        this.nom = value;
    }
    public void setAdresse(int value) {
        this.adresse = value;
    }

	public Arme getArmeDroite() {
		return this.armeDroite;
	}

	public void setArmeDroite(Arme armeDroite) {
		this.armeDroite = armeDroite;
	}

	public Arme getArmeGauche() {
		return this.armeGauche;
	}

	public void setArmeGauche(Arme armeGauche) {
		this.armeGauche = armeGauche;
	}

	public int getNiveauBlessure() {
		return this.niveauBlessure;
	}

	public void setNiveauBlessure(int niveauBlessure) {
		this.niveauBlessure = niveauBlessure;
	}
	
	public void setInventairePotions(Potion[] inventairePotions) {
    	this.inventairePotions = inventairePotions;
    }
	
	public void setVetement(Vetement vetement){
		this.vetement = vetement;
	}
}

