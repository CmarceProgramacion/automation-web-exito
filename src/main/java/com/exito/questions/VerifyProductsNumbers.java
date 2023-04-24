package com.exito.questions;

import com.exito.models.ProductModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

import static com.exito.userinterfaces.ShoppingCartPage.LABEL_PRODUCT_UNITS;

public class VerifyProductsNumbers implements Question<Boolean> {
    private List<ProductModel> modelList;


    public VerifyProductsNumbers(List<ProductModel> modelList) {
        this.modelList = modelList;

    }

    public static VerifyProductsNumbers verify(List<ProductModel> modelList) {
        return new VerifyProductsNumbers(modelList);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        int expectedUnits = 0;
        int actualUnits = 0;
        for (ProductModel model : modelList) {
            actualUnits = Integer.parseInt(LABEL_PRODUCT_UNITS.resolveFor(actor).getText().replaceAll("[^\\d]", ""));
            expectedUnits += model.getUnitValue();
        }

        return expectedUnits == actualUnits;
    }
}
