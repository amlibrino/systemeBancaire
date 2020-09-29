import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    //psvm pour creer la class main

    public static void main(String[] args) {

        List<Personne> employes = new ArrayList<>();
        List<Client> clients = new LinkedList<>();


        Agence bnp = new Agence("paris",employes, "de 8h à 18h", clients, 5);

    }
}
