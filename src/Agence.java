import java.util.*;

public class Agence {

    private int nbEtoile;
    private String adresse;
    private List<Personne> employes;
    private String horaires;
    // private LocalDateTime heureOuverture;
    private List<Client> clients;
    // private List<CompteBancaire> compteBancaires;
    private Map<Integer, CompteBancaire> compteBancaireById;

    //constructor
    public Agence(String adresse, List<Personne> employes, String horaires, List<Client> clients, int nbEtoile) {
        this.adresse = adresse;
        this.employes = employes;
        this.horaires = horaires;
        this.clients = clients;
        this.nbEtoile = nbEtoile;
    }

    // methode ajout compte bancaire
    public void ajouterCompteBancaire(int numCompte, int soldeCompte) {
        CompteBancaire compte1 = new CompteBancaire(numCompte, soldeCompte);
        compteBancaireById.put(numCompte, compte1);
    }

    //methode pour chercher la valeur selon sa clef avec une map
    public CompteBancaire getById(int id) {
        return compteBancaireById.get(id);
    }

    // methode pour retourner les id des compte banacaire (elle cherche les cléfs dans la map)
    public Set<Integer> getAccountIds(int id){
        return (Set<Integer>) compteBancaireById.get(id);
    }

    //
    public void removeAccount(int id){
        compteBancaireById.remove(id);
    }

    //getters
    public int getNbEtoile() {
        return nbEtoile;
    }

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


    public CompteBancaire getAccountById(int id) {
        for (int i = 0; i <= compteBancaires.size(); i++) {
            if (id == compteBancaires.get(i).getNumDeCompte()) {
                return compteBancaires.get(i);
            }
        }
        return null;
    }

    public CompteBancaire getAccountByBinarySearch(int id) {
        Collections.sort(compteBancaires);
        int debut = 0;
        int fin = compteBancaires.size() - 1;
        while (debut < fin) {
            int mid = (debut + fin) / 2;
            if (compteBancaires.get(mid).getNumDeCompte() == id) {
                return compteBancaires.get(mid);
            } else if (compteBancaires.get(mid).getNumDeCompte() > id) {
                debut = mid + 1;
            } else {
                fin = mid - 1;
            }
        }
        return null;
    }


}
