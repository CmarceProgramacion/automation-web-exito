package com.exito.stepdefinitions;

import com.exito.interactions.SelectProduct;
import com.exito.tasks.SelectProductTask;
import com.exito.questions.VerifyProductNames;
import com.exito.userinterfaces.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CartProductsExitoStepDefinition {
    @Given("that I access the platform of the Exito")
    public void thatIAccessThePlatformOfTheExito() {
        theActorInTheSpotlight().wasAbleTo(Open.browserOn().the(HomePage.class));
    }

    @When("I select the items for purchase")
    public void iSelectTheItemsForPurchase(List<List<String>> dataArticle) {
        theActorInTheSpotlight().attemptsTo(SelectProductTask.whitData(dataArticle.get(0).get(0), dataArticle.get(0).get(1)));
    }

    @Then("Verification of the items in my shopping cart")
    public void verificationOfTheItemsInMyShoppingCart() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyProductNames.verify(SelectProduct.getListProductModels())));
    }
}
