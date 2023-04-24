package com.exito.questions;

import com.exito.models.ProductModel;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.time.Duration;
import java.util.List;

import static com.exito.userinterfaces.ShoppingCartPage.LABEL_PRODUCT_VALUE;

public class VerifyProductPrices implements Question<Boolean> {

    private List<ProductModel> modelList;

    public VerifyProductPrices(List<ProductModel> modelList) {
        this.modelList = modelList;
    }

    public static VerifyProductPrices verify(List<ProductModel> modelList) {
        return new VerifyProductPrices(modelList);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Serenity.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        for (ProductModel model : modelList) {
            int expectedProductPrice = model.getUnitValue() * model.getUnitAmount();
            int actualProductPrice = Integer.parseInt(LABEL_PRODUCT_VALUE.of(model.getIdProduct()).resolveFor(actor).getText().replaceAll("[^\\d]", ""));
            System.out.println("fffñ "+actualProductPrice);
            if (expectedProductPrice != actualProductPrice) {
                return false;
            }
        }
        return true;
    }
}
