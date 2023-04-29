package com.exito.tasks;

import com.exito.interactions.SelectProduct;
import com.exito.utils.RandomElementsUtil;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.exito.userinterfaces.HomePage.*;

public class SelectProductTask implements Task {
    private String category;
    private String subcategory;


    public SelectProductTask(String category, String subcategory) {
        this.category = category;
        this.subcategory = subcategory;
    }

    public static Performable whitData(String category, String subcategory) {
        return Tasks.instrumented(SelectProductTask.class, category, subcategory);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ICON_MENU),
                Click.on(ICON_MENU_CATEGORY.of(category)),
                Click.on(ICON_MENU_SUBCATEGORY.of(subcategory))
        );
        actor.attemptsTo(
                WaitUntil.the(BUTTON_SHOW_MORE, WebElementStateMatchers.isVisible()),
                Scroll.to(BUTTON_SHOW_MORE),
                WaitUntil.the(ICON_LOAD, WebElementStateMatchers.isNotVisible()),
                SelectProduct.withData(RandomElementsUtil.randomLocation(BUTTON_BUY.resolveAllFor(actor).size())),
                Click.on(ICON_SHOPPING_CART)
        );
    }
}
