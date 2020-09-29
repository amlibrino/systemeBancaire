public class Client extends Personne{

    private CompteBancaire compteBanquaire;
    private String numClient;

    //constuctor

    public Client(String nom, String prenom, String mail, CompteBancaire compteBanquaire, String numClient) {
        super(nom, prenom, mail);
        this.compteBanquaire = compteBanquaire;
        this.numClient = numClient;
    }

    // getters


    public CompteBancaire getCompteBanquaire() {
        return compteBanquaire;
    }

    public String getNumClient() {
        return numClient;
    }




}
