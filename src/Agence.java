import java.util.List;

public class Agence {


    private String adresse;
    private List<Personne> employes;
    private String horaires;
    //    private LocalDateTime heureOuverture;
    private List<Client> clients;

    //constructor
    public Agence(String adresse, List<Personne> employes, String horaires, List<Client> clients) {
        this.adresse = adresse;
        this.employes = employes;
        this.horaires = horaires;
        this.clients = clients;
    }

    public Agence() {

    }

    //getters


    public String getAdresse() {
        return adresse;
    }

    public List<Personne> getEmployes() {
        return employes;
    }

    public String getHoraires() {
        return horaires;
    }

    public List<Client> getClients() {
        return clients;
    }


}
