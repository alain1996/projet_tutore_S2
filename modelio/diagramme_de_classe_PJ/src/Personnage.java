import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("6c66cc8d-e079-43bb-81c7-2ac48ee60c96")
public class Personnage {
    @objid ("c50bddf5-da37-433e-b06a-e33952a9a2c3")
    private int force;

    @objid ("5be7d715-3465-4000-a170-2b40a061ed18")
    private int adresse;

    @objid ("80b1cd7f-749b-47df-822d-ccb41c484bf4")
    private int pointsAction;

    @objid ("0c745892-05d9-4ade-8f19-a933b7dd093e")
    private String nom;

    @objid ("3078f084-b654-436a-9450-09db1f935a6a")
    private Equipements inventaireObjets;

    @objid ("6ad4d95a-6fb4-4535-aeab-d3807e979433")
    private int pointsExperience;

    @objid ("9e572907-3996-41b9-b436-e24596272c63")
    private int resistance;

    @objid ("adfd3613-cd1e-4a89-8990-c6ca4b5fcc31")
    private int abscisse;

    @objid ("785d5aa4-2309-4380-a410-b643c6e35fc8")
    private int ordonnee;

    @objid ("2245a9a0-12c1-4aad-87a9-efc57f032411")
    public Equipements equipements;

    @objid ("6a5bf82d-55b8-481f-930c-6e22dadd78c1")
    public Grille grille;

    @objid ("8326a733-d708-41eb-8d2b-854db46d2678")
    public int calculInitiave() {
    }

    @objid ("3f72ed5a-642c-47eb-a41e-31b5b8b00444")
    public int calculAttaque() {
    }

    @objid ("ead1bacd-1b2d-40e6-be84-886ae85c3728")
    public int calculEsquive() {
    }

    @objid ("c67c3543-2ee0-4467-a13e-fd1a73e53b32")
    public int calculDefense() {
    }

    @objid ("61a1c59f-127b-4fc0-82dc-8bd4551d7bc8")
    public int calculDegats() {
    }

    @objid ("881dabe4-be87-4a3c-9811-5ba0d88ef85a")
    public void attaquer(Personnage cible, String main) {
    }

    @objid ("2e21750a-22fc-45ca-bc47-bbd0cec1e40e")
    public void seDeplacer(int abscisse, int ordonnee) {
    }

    @objid ("938af229-87d1-4826-addd-ba383321719a")
    public void utiliserEquipement() {
    }

    @objid ("ac7438e4-cc41-4a39-b4e8-db38a0928ec9")
    public void deposerEquipement() {
    }

    @objid ("e7ed5aea-8dab-475f-bc5f-ad0bdd598eac")
    public void ramasserEquipement() {
    }

    @objid ("97679e72-a3cd-4a7c-b71f-7ef6cb6d3792")
    public void finirTour() {
    }

    @objid ("5de836c1-99c8-447d-9b91-3b87e885a956")
    public void niveauBlessure() {
    }

    @objid ("43f013ae-7080-4a35-80a2-919a8863640e")
    public void lancerDes() {
    }

    @objid ("d5c63a7b-062a-40c7-881d-cbb4fcd9e591")
    public void calculDegats () {
    }

    @objid ("52baed10-b7b6-4fba-9893-99780453b254")
    public void perdreObjets() {
    }

    @objid ("56347f97-a847-42a7-b693-2a4c188f279d")
    void setForce(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.force = value;
    }

    @objid ("aac4b325-34c4-4b38-92e7-454f8a88098f")
    int getForce() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.force;
    }

    @objid ("b8712b31-7c22-4dd4-845f-8c633e9e50bc")
    int getAdresse() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.adresse;
    }

    @objid ("f1efc382-07fe-4875-860d-597fa92846ed")
    void setAdresse(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.adresse = value;
    }

    @objid ("4cc40def-cdd2-4c59-bf6d-b01e234cacc8")
    int getPointsAction() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.pointsAction;
    }

    @objid ("d731423b-73f9-4c80-a734-9072e8e7e92d")
    void setPointsAction(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.pointsAction = value;
    }

    @objid ("d15f0e3e-c38d-4376-ab94-73d0b40eb20c")
    String getNom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nom;
    }

    @objid ("0d6817eb-662a-43ad-916c-6556151167ca")
    void setNom(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nom = value;
    }

    @objid ("2cba5e89-f437-4316-90db-7eeece4f0a08")
    void setInventaireObjets(Equipements value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.inventaireObjets = value;
    }

    @objid ("93b6624c-8dac-4eab-95be-89a8f4ce25ec")
    Equipements getInventaireObjets() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.inventaireObjets;
    }

    @objid ("5404013c-a7fb-4d44-8add-81e6f0f6ebf8")
    int getPointsExperience() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.pointsExperience;
    }

    @objid ("7651f7bb-434c-4512-9839-e031b9cd5a94")
    void setPointsExperience(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.pointsExperience = value;
    }

    @objid ("f9d1ac24-a892-4029-91a3-a0fa9b4253c8")
    int getResistance() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.resistance;
    }

    @objid ("20ff3759-f604-44b6-be78-a2232a6a179f")
    void setResistance(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.resistance = value;
    }

    @objid ("cbff9dec-f1d4-44be-924f-b6750597d068")
    int getAbscisse() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.abscisse;
    }

    @objid ("f11e7581-f542-4153-ad14-d782a0d05d7f")
    void setAbscisse(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.abscisse = value;
    }

    @objid ("8c2c4d58-ce8b-4d91-802b-b6fa457f8805")
    int getOrdonnee() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.ordonnee;
    }

    @objid ("f5276f7d-9c2c-4d17-a252-4c134997a2a4")
    void setOrdonnee(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.ordonnee = value;
    }

}
