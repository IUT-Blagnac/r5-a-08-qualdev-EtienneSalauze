package hellocucumber;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;

public class StepDefinitions {

    private String today;
    private String response;

    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

    @Given("Aujourd'hui c'est {string}")
    public void today_is(String day) {
        today = day.toLowerCase();  
    }

    @When("Je demande si nous sommes vendredi")
    public void i_ask_whether_it_s_friday_yet() {
        if (today.equals("vendredi")) {
            response = "TGIF";  
        } else {
            response = "Nope";  
        }
    }

    @Then("On devrait me répondre {string}")
    public void i_should_be_told(String expectedAnswer) {
        Assertions.assertEquals(expectedAnswer, response, "La réponse ne correspond pas à ce qui est attendu.");
    }
}
