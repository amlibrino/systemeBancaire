public class Personne implements Comparable{
    private String nom;
    private String prenom;
    private int age;
    private String mail;
    private String tel;

    //constructeur
    public Personne(String nom, String prenom, String mail) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
    }

    //getters
    public String getMail() {
        return mail;
    }

    public String getTel() {
        return tel;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Object o) {
        Personne per = ((Personne)o);
        if (age == per.age){
            return 0;
        }else if (age> per.age){
            return 1;
        }else {
            return -1;
        }
    }
}
