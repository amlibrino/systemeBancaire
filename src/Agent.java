
public class Agent extends Personne{
    private String numAgent;
    private Role role;
    private Agence agence; // lieu de travail


    //constructor
    public Agent(String nom, String prenom, String mail, String numAgent, Role role, Agence agence) {
        super(nom, prenom, mail);
        this.numAgent = numAgent;
        this.role = role;
        this.agence = agence;
    }

    //getters
    public String getNumAgent() {
        return numAgent;
    }

    public Role getRole() {
        return role;
    }

    public Agence getAgence() {
        return agence;
    }
}
