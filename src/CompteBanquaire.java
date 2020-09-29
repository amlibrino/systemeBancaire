public class CompteBanquaire {


    private int numDeCompte;
    private int soldeCompte; // argent dans son compte bancaire; en euro

    public CompteBanquaire(int numDeCompte, int soldeCompte) {
        this.numDeCompte = numDeCompte;
        this.soldeCompte = soldeCompte;
    }

    public int getNumDeCompte() {
        return numDeCompte;
    }

    public int getSoldeCompte() {
        return soldeCompte;
    }

    // retrait et ajout de somme à son compte bancaire
    public void retirerSomme(int retrait) {
        this.soldeCompte -= retrait;
    }

    public void ajouterSomme(int ajout) {
        this.soldeCompte += ajout;
    }

    public void retraitArgent() {
        System.out.println( " veut retirer de l'argent! " );
    }

    public void depotArgent(){
        System.out.println( " veut déposer de l'argent!  ");

    }

    public void creerCompte() {
        System.out.println(" veut creer un compte ");
    }


}
