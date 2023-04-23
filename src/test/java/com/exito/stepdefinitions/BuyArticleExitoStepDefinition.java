package com.exito.stepdefinitions;

import com.exito.interactions.SelectArticles;
import com.exito.tasks.SelectArticleTask;
import com.exito.tasks.VerifyArticle;
import com.exito.userinterfaces.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuyArticleExitoStepDefinition {
    @Given("that I access the platform of the Exito")
    public void thatIAccessThePlatformOfTheExito() {
        theActorInTheSpotlight().wasAbleTo(Open.browserOn().the(HomePage.class));
    }

    @When("I select the items for purchase")
    public void iSelectTheItemsForPurchase(List<List<String>> dataArticle) {
        theActorInTheSpotlight().attemptsTo(SelectArticleTask.whitData(dataArticle.get(0).get(0), dataArticle.get(0).get(1)));
    }

    @Then("Verification of the items in my shopping cart")
    public void verificationOfTheItemsInMyShoppingCart() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyArticle.verify(SelectArticles.getListArticleModels())));
    }
}
