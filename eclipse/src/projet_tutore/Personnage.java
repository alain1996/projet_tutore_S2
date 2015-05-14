package projet_tutore;

import java.util.Random;

public class Personnage {

    public static final int Personnage_constant = 0;

    
    private int force;
    private int adresse;
    private int pointsAction;
    private String nom;
    private int pointsExperience;
    private int resistance;
    private int abscisse;
    private int ordonnee;
    private Potion inventairePotions[];
    private Vetement vetement;
    private Arme armeDroite;
    private Arme armeGauche;
    private int niveauBlessure;
    
     //*******************CONSTRUCTEUR PAR DEFAUT******************************
     
    public Personnage(){
        this.force = 0;
        this.adresse = 0;
        this.pointsAction = 0;
        this.nom = "default";
        this.inventairePotions = new Potion[];
        this.pointsExperience = 0;
        this.resistance = 0;
        this.abscisse = 0;
        this.ordonnee = 0;
        this.vetement = new Vetement();
        this.armeGauche = new Arme();
        this.armeDroite = new Arme();
        this.niveauBlessure = 0;
    }
    
     //*******************CONSTRUCTEUR CHAMPS A CHAMPS******************************
     
    public Personnage(int force, int adresse, int pointsAction, String nom, Potion[] inventairePotions, Arme armeGauche, Arme armeDroite, Vetement vetement,int niveauBlessure, int pointsExperience, int resistance, int abscisse, int ordonnee){
        this.force = force;
        this.adresse = adresse;
        this.pointsAction = pointsAction;
        this.nom = nom;
        this.inventairePotions = inventairePotions;
        this.armeGauche = armeGauche;
        this.armeDroite = armeDroite;
        this.pointsExperience = pointsExperience;
        this.resistance = resistance;
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
        this.vetement = vetement;
        this.niveauBlessure = niveauBlessure;
    }
    
    //*******************CALCUL INITIAVE******************************

    public int calculInitiave() {
        int x = this.adresse-this.vetement.getEncombrement[2]);
        int y=0;
        for(int i=0;i<this.vetement.getEncombrement[1];i++){
            y+=tirageAleatoire();
        }
        return (x+y);;
    }
    
    //*******************CALCUL ATTAQUE********************************

    public int calculAttaque(Arme armeUtilisee) {
        int x = this.adresse+armeUtilisee.getManiabilite}[2];
        
                  int y=0;
                  for(int i=0;i<armeUtilisee.getManiabilite[1];i++){
                     y+=tirageAleatoire();
        }
        return (x+y);
    }
    
    //*******************CALCUL ESQUIVE******************************
    
    public int calculEsquive() {
        int x = this.adresse-this.vetement.getEncombrement[2]);
        int y=0;
        for(int i=0;i<this.vetement.getEncombrement[1];i++){
            y+=tirageAleatoire();
        }
        return (x+y);
    }
    
    //*******************CALCUL DEFENSE*******************************
    
    public int calculDefense() {
        int x = this.resistance+this.vetement.getSolidite[2];
        int y = 0;
        for(int i=0;i<this.vetement.getSolidite[1];i++){
            y+=tirageAleatoire();
        }
        return (x+y);
    }
    
    //*******************CALCUL DEGATS******************************
    
    public int calculDegats(Arme armeUtilisee) {
        int x = this.force+armeUtilisee.getImpact[2];
        int y = 0;
        for(int i=0;i<armeUtilisee.getImpact[1];i++){
            y+=tirageAleatoire();
        }
        return (x+y);
    }
    
    //*******************ATTAQUER******************************
    
    public void attaquer(Personnage cible, Arme armeUtilisee) {
        int x = calculAttaque();
        int y = cible.calculEsquive();
        system.out.println("Tirage attaque = "+x);
        system.out.println("Tirage esquive = "+y);
        if(y>=x){
            system.out.println("Raté");
        }
        else{
            system.out.println("Touché");
            int z = cible.calculDefense();
            int a = calculDegats();
            system.out.println("Tirage Defense = "+z);
            system.out.println("Tirage Degats = "+a);
            if(z<a){
                system.out.println("Blessure : +"+(a-z));
                cible.niveauBlessure += (a-z);
            }
            else{
                system.out.println("Pas blessé");
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
    
   public Equipements getInventaireObjets() {
        return this.inventaireObjets;
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
    public void setInventaireObjets(Equipements value) {
        this.inventaireObjets = value;
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
}

