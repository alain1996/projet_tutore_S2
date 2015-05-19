import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("6b79cc3d-f612-4563-ae26-b2a64cdd3b58")
public class Vetement extends Equipements {
    @objid ("b8653e8b-04dd-469b-9606-4c2eb4a106a9")
    private int encombrement;

    @objid ("a6f17354-2dbc-4540-be0c-7249b2065a41")
    private int solidite;

    @objid ("d85674f2-c7d5-4385-a19f-45168382ff36")
    public void equiper() {
    }

    @objid ("19e7aa38-7067-411b-b336-93e4a5dfba08")
    public void desequiper () {
    }

    @objid ("7c044954-d9e7-48d9-b8c5-7930eec4ae2a")
    int getEncombrement() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.encombrement;
    }

    @objid ("e31dd7ef-64c1-4b46-9d9b-22d286bf2305")
    void setEncombrement(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.encombrement = value;
    }

    @objid ("3ec21552-7560-4349-bd35-d1d1129675a8")
    int getSolidite() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.solidite;
    }

    @objid ("8e60822e-0d58-40cd-9d9d-09971dc9a774")
    void setSolidite(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.solidite = value;
    }

}
