import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("aa3f8606-3217-4360-9df0-ca27a90a04b2")
public class Potion extends Equipements {
    @objid ("03596406-2330-432b-97fa-3b18eeaf6e82")
    private String caracteristique;

    @objid ("a127afe3-a877-44ed-96da-8f2d14054a03")
    private int bonus;

    @objid ("52de878c-5d58-4725-8806-d458d6ad59d1")
    public void utiliser() {
    }

    @objid ("39f9b37e-2163-4953-b97c-c7b0f0ed1f53")
    String getCaracteristique() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.caracteristique;
    }

    @objid ("08d57e92-a670-417a-9750-6b0c52637538")
    void setCaracteristique(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.caracteristique = value;
    }

    @objid ("23534579-5a58-46b9-888d-16bfbda99dd4")
    int getBonus() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.bonus;
    }

    @objid ("6a0a97ee-14fa-47a0-9b50-fd64ba6b38d2")
    void setBonus(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.bonus = value;
    }

}
