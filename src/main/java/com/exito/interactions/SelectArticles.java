package com.exito.interactions;

import com.exito.models.ArticleModel;
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

public class SelectArticles implements Interaction {
    private List<Integer> listNumbers;
    private static List<ArticleModel> listArticleModels = new ArrayList<>();
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

        ArticleModel articleModel = new ArticleModel();

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

            articleModel.setName(LABEL_NAME_ARTICLE.resolveFor(actor).getText());
            articleModel.setUnitAmount(units);
            articleModel.setUnitValue(Integer.parseInt(LABEL_PRICE_ARTICLE_UNIT.resolveFor(actor).getText().replaceAll("[^\\d]", "")));
            listArticleModels.add(articleModel);

            actor.attemptsTo(
                    Click.on(LABEL_CONTINUE_SHOPPING)
            );
            System.out.println(location);
        }
    }

    public static List<ArticleModel> getListArticleModels(){
        return listArticleModels;
    }
}
