package projet_tutore;

public class Personnage {

    private static final int Personnage_constant = 0;
	private int force;
    private int adresse;
    private int pointsAction;
    private String nom;
    private Equipements inventaireObjets[];
    private int pointsExperience;
    private int resistance;
    private int abscisse;
    private int ordonnee;

    public Personnage(){
        this.force = 0;
        this.adresse = 0;
        this.pointsAction = 0;
        this.nom = "";
      //  this.inventaireObjets[]= new Equipements[Personnage.manque la taille du tableau];
        /* for (int i=0;i<this.inventaireObjets.length;i++)
         * {
         * 	this.inventaireObjets[i]=new Equipements();
         * }
         */
        this.pointsExperience = 0;
        this.resistance = 0;
        this.abscisse = 0;
        this.ordonnee = 0;
    }

    public Personnage(int force, int adresse, int pointsAction, String nom, Equipements inventaireObjet[], int pointsExperience, int resistance, int abscisse, int ordonnee){
        this.force = force;
        this.adresse = adresse;
        this.pointsAction = pointsAction;
        this.nom = nom;
      //  Equipements inventaireObjets[] = new inventaireObjet[];
        //this.inventaireObjets= inventaireObjet;
        this.pointsExperience = pointsExperience;
        this.resistance = resistance;
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }


    public int calculInitiave() {
    }
    public int calculAttaque() {
    }
    public int calculEsquive() {
    }
    public int calculDefense() {
    }
    public int calculDegats() {
    }
    public void attaquer(Personnage cible, String main) {
    }
    public void seDeplacer(int abscisse, int ordonnee) {
    }
    public void utiliserEquipement() {
    }
    public void deposerEquipement() {
    }
    public void ramasserEquipement() {
    }
    public void finirTour() {
    }
    public void niveauBlessure() {
    }
    public void lancerDes() {
    }
    public void calculDegats () {
    }
    public void perdreObjets() {
    }
    void setForce(int value) {
        this.force = value;
    }
    int getForce() {
        return this.force;
    }
    int getAdresse() {
        return this.adresse;
    }
    void setAdresse(int value) {
        this.adresse = value;
    }
    int getPointsAction() {
        return this.pointsAction;
    }
    void setPointsAction(int value) {
        this.pointsAction = value;
    }
    String getNom() {
        return this.nom;
    }
    void setNom(String value) {
        this.nom = value;
    }
    void setInventaireObjets(Equipements value) {
        this.inventaireObjets = value;
    }
    Equipements getInventaireObjets() {
        return this.inventaireObjets;
    }
    int getPointsExperience() {
        return this.pointsExperience;
    }
    void setPointsExperience(int value) {
        this.pointsExperience = value;
    }
    int getResistance() {
        return this.resistance;
    }
    void setResistance(int value) {
        this.resistance = value;
    }
    int getAbscisse() {
        return this.abscisse;
    }
    void setAbscisse(int value) {
        this.abscisse = value;
    }
    int getOrdonnee() {
        return this.ordonnee;
    }
    void setOrdonnee(int value) {
        this.ordonnee = value;
    }

}

