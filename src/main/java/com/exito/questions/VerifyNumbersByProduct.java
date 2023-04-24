package com.exito.questions;

import com.exito.models.ProductModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

import static com.exito.userinterfaces.ShoppingCartPage.LABEL_PRODUCT_VALUE;

public class VerifyNumbersByProduct implements Question<Boolean> {

    private List<ProductModel> modelList;

    public VerifyNumbersByProduct(List<ProductModel> modelList) {
        this.modelList = modelList;
    }

    public static VerifyNumbersByProduct verify(List<ProductModel> modelList) {
        return new VerifyNumbersByProduct(modelList);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        for (ProductModel model : modelList) {
            int unit = (Integer.parseInt(LABEL_PRODUCT_VALUE.of(model.getIdProduct()).resolveFor(actor).getText().replaceAll("[^\\d]", "")) / model.getUnitAmount());
            if (model.getUnitValue() != unit)
                return false;
        }
        return true;
    }

}
