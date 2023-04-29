package com.exito.questions;

import com.exito.models.ProductModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static com.exito.userinterfaces.ShoppingCartPage.LABEL_PRODUCT_NAMES;

public class VerifyProductNames implements Question<Boolean> {
    private List<ProductModel> modelList;

    public VerifyProductNames(List<ProductModel> modelList) {
        this.modelList = modelList;
    }

    public static VerifyProductNames verify(List<ProductModel> modelList) {
        return new VerifyProductNames(modelList);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        for (ProductModel model : modelList) {
            actor.attemptsTo(WaitUntil.the(LABEL_PRODUCT_NAMES.of(model.getIdProduct()), WebElementStateMatchers.isCurrentlyVisible()).forNoMoreThan(5).seconds());
            if (!model.getName().equals(LABEL_PRODUCT_NAMES.of(model.getIdProduct()).resolveFor(actor).getText())) {
                return false;
            }
        }
        return true;
    }
}
