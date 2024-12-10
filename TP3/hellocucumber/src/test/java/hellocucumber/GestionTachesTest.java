import io.cucumber.java.en.*;
import static org.junit.Assert.*;

import java.util.*;

public class GestionTachesTest {

    private List<String> taches = new ArrayList<>();
    private List<String> tachesTerminees = new ArrayList<>();

    @Given("L'utilisateur est connecté à l'application de gestion des tâches")
    public void utilisateur_connecte_application() {
        System.out.println("L'utilisateur est connecté à l'application de gestion des tâches");
    }

    @When("L'utilisateur ajoute une tâche intitulée {string}")
    public void utilisateur_ajoute_tache(String tache) {
        taches.add(tache);
        System.out.println("Tâche ajoutée : " + tache);
    }

    @Then("La tâche {string} doit apparaître dans la liste des tâches")
    public void tache_apparait_dans_liste(String tache) {
        assertTrue("La tâche devrait apparaître dans la liste", taches.contains(tache));
    }

    @Given("L'utilisateur a une tâche intitulée {string} dans la liste")
    public void utilisateur_a_tache(String tache) {
        taches.add(tache);
    }

    @When("L'utilisateur marque la tâche {string} comme terminée")
    public void utilisateur_marke_tache_terminée(String tache) {
        if (taches.contains(tache)) {
            tachesTerminees.add(tache);
            taches.remove(tache);
            System.out.println("Tâche marquée comme terminée : " + tache);
        }
    }

    @Then("La tâche {string} doit être marquée comme terminée")
    public void tache_terminee(String tache) {
        assertTrue("La tâche devrait être marquée comme terminée", tachesTerminees.contains(tache));
    }

    @When("L'utilisateur supprime la tâche {string}")
    public void utilisateur_supprime_tache(String tache) {
        taches.remove(tache);
        System.out.println("Tâche supprimée : " + tache);
    }

    @Then("La tâche {string} ne doit plus apparaître dans la liste des tâches")
    public void tache_supprimee(String tache) {
        assertFalse("La tâche ne devrait plus apparaître dans la liste", taches.contains(tache));
    }
}
