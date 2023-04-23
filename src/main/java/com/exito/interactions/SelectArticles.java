package com.exito.interactions;

import com.exito.utils.RandomElementsUtil;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.List;

import static com.exito.userinterfaces.HomePage.*;

public class SelectArticles implements Interaction {
    private List<Integer> listNumbers;
    private int unit;


    public SelectArticles(List<Integer> listNumbers) {
        this.listNumbers = listNumbers;
        this.unit = unit;
    }

    public static Performable withData(List<Integer> listNumbers) {
        return Tasks.instrumented(SelectArticles.class, listNumbers);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
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
                        Click.on(ICON_SELECT_NUMBER_ARTICLES)
                );
            }
            actor.attemptsTo(
                    Click.on(LABEL_CONTINUE_SHOPPING)
            );
            System.out.println(location);

        }
    }
}
