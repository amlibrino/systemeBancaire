public class Client extends Personne{

    private CompteBanquaire compteBanquaire;
    private String numClient;

    //constuctor

    public Client(String nom, String prenom, String mail, CompteBanquaire compteBanquaire, String numClient) {
        super(nom, prenom, mail);
        this.compteBanquaire = compteBanquaire;
        this.numClient = numClient;
    }

    // getters


    public CompteBanquaire getCompteBanquaire() {
        return compteBanquaire;
    }

    public String getNumClient() {
        return numClient;
    }




}
