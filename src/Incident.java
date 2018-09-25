public class Incident {

    private String type;
    private int ID;
    private boolean active;
    private Officer officer;

    Incident(String type, int ID, boolean active, Officer officer) {
        this.type = type;
        this.ID = ID;
        this.active = active;
        this.officer = officer;
    }

    public String getType() {
        return type;
    }

    public int getID() {
        return ID;
    }

    public boolean isActive() {
        return active;
    }

    public Officer getOfficer() {
        return officer;
    }
}
