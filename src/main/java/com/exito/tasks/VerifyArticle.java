package com.exito.tasks;

import com.exito.models.ArticleModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.ArrayList;
import java.util.List;

public class VerifyArticle implements Question<Boolean> {
   private  List<ArticleModel> modelList ;

    public VerifyArticle(List<ArticleModel> modelList) {
        this.modelList = modelList;
    }

    public static VerifyArticle verify(List<ArticleModel> modelList) {
        return new VerifyArticle(modelList);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
       System.out.println(modelList);
        return true;
    }
}
