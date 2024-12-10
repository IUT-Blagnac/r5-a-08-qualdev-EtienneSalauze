package dojo;

import java.util.List;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CocktailSteps {
    private Order order;

    @Given("{string} who wants to buy a drink")
    public void romeo_who_wants_to_buy_a_drink(String ownerName) {
        order = new Order();
        order.declareOwner(ownerName);
    }

    @When("an order is declared for {string} with {int} cocktails")
    public void an_order_is_declared_for_juliette(String targetName, int numberOfCocktails) {
        order.declareTarget(targetName);
    }

    @Then("there are {int} cocktails in the order")
    public void there_are_cocktails_in_the_order(int expectedCocktailCount) {
        List<String> cocktails = order.getCocktails();
        assertEquals(expectedCocktailCount, cocktails.size());
    }
}
