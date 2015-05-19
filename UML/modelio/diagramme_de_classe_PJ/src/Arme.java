import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("08194e3f-0dbe-4002-a9ed-897d56803826")
public class Arme extends Equipements {
    @objid ("79ce5480-e2d2-4300-b4a5-d12f95a511a1")
    private int impact;

    @objid ("b3cd7ba5-841f-4a48-88a6-7b098bb64169")
    private int maniabilite;

    @objid ("79ca5409-f583-4bf8-97cc-8d9403a69d2e")
    public void equiper() {
    }

    @objid ("4fad37e0-479b-4283-8244-375d88b585da")
    public void desequiper() {
    }

    @objid ("af89d645-aa7c-4e1f-82c4-861b5d154f64")
    int getImpact() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.impact;
    }

    @objid ("7ffab20d-0946-4ce3-994a-273861e07377")
    void setImpact(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.impact = value;
    }

    @objid ("98c5ae69-2b75-437d-9124-d35e6ce8132e")
    int getManiabilite() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.maniabilite;
    }

    @objid ("96b9d235-1c9f-4ca5-9183-f4b8b21450ad")
    void setManiabilite(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.maniabilite = value;
    }

}
