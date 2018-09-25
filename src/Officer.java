public class Officer {

    private String name;
    private int ID;
    private boolean working;
    private Incident incident;

    Officer(String name, int ID, boolean working, Incident incident) {
        this.name = name;
        this.ID = ID;
        this.working = working;
        this.incident = incident;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public boolean isWorking() {
        return working;
    }

    public Incident getIncident() {
        return incident;
    }
}
