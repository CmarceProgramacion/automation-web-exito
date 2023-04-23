package com.exito.interactions;

import com.exito.models.ProductModel;
import com.exito.utils.RandomElementsUtil;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.ArrayList;
import java.util.List;

import static com.exito.userinterfaces.HomePage.*;

public class SelectProduct implements Interaction {
    private List<Integer> listNumbers;
    private static List<ProductModel> listProductModels = new ArrayList<>();
    private int unit;


    public SelectProduct(List<Integer> listNumbers) {
        this.listNumbers = listNumbers;
        this.unit = unit;
    }

    public static Performable withData(List<Integer> listNumbers) {
        return Tasks.instrumented(SelectProduct.class, listNumbers);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        ProductModel productModel = new ProductModel();

        for (int location : listNumbers) {
            actor.attemptsTo(
                    Scroll.to(BUTTON_BUY.resolveAllFor(actor).get(location)).andAlignToBottom(),
                    Click.on(BUTTON_BUY.resolveAllFor(actor).get(location))
            );
            actor.attemptsTo(
                    Click.on(BUTTON_ADD)
            );

            int units = RandomElementsUtil.randomUnits();

            for (int x = 1; x < units; x++) {
                actor.attemptsTo(
                        Click.on(ICON_SELECT_PRODUCT_NUMBER)
                );
            }

            productModel.setName(LABEL_PRODUCT_NAME.resolveFor(actor).getText());
            productModel.setUnitAmount(units);
            productModel.setUnitValue(Integer.parseInt(LABEL_PRICE_PRODUCT_UNIT.resolveFor(actor).getText().replaceAll("[^\\d]", "")));
            listProductModels.add(productModel);

            actor.attemptsTo(
                    Click.on(LABEL_CONTINUE_SHOPPING)
            );
            System.out.println(location);
        }
    }

    public static List<ProductModel> getListProductModels(){
        return listProductModels;
    }
}
