import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("85027495-16e8-4b24-807d-686372abd03a")
public class Grille {
    @objid ("b942a6bc-4b32-4f4f-9161-530ec1dc9632")
    private int tailleAbscisse;

    @objid ("66fb2834-274c-4657-a063-e0fb8b9508ca")
    private int tailleOrdonnee;

    @objid ("db56e7f3-7603-4b7b-b037-06fc240cb0ef")
    public void initGrille() {
    }

    @objid ("d00ae0aa-998a-4df2-a1a8-0d979d8721b4")
    public void affichage() {
    }

    @objid ("b613b8eb-fe95-4b3f-9f67-c8e642685004")
    public boolean caseVide(int abscisse, int ordonnee) {
    }

    @objid ("35fddacf-8c75-43ce-ac36-07c01c9ff2be")
    int getTailleAbscisse() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.tailleAbscisse;
    }

    @objid ("395e860d-3c99-4fe9-a2c4-dbac2c95b747")
    void setTailleAbscisse(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.tailleAbscisse = value;
    }

    @objid ("801fa341-55cf-4b8f-b22b-4a2774cd24bb")
    int getTailleOrdonnee() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.tailleOrdonnee;
    }

    @objid ("e58eb97a-2cf4-473a-ab34-ec380a45d005")
    void setTailleOrdonnee(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.tailleOrdonnee = value;
    }

}
