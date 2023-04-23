package com.exito.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

import java.util.List;


@DefaultUrl("page:webdriver.base.url")
public class HomePage extends PageObject {
    private List<WebElementFacade> lst;

    public static Target ICON_MENU = Target.the("Icon of the main menu").locatedBy("//div[@id='category-menu']");
    public static Target ICON_MENU_CATEGORY = Target.the("").locatedBy("//li[contains(@id, 'undefined-nivel2-{0}')]");
    public static Target ICON_MENU_SUBCATEGORY = Target.the("").locatedBy("//a[contains(@id, 'Categorías-nivel3-{0}')]");
    public static Target BUTTON_BUY = Target.the("").locatedBy("//div[contains(@class,'button-modal')]/span");
    public static Target BUTTON_SHOW_MORE= Target.the("").locatedBy("//div[contains(@class, 'buttonShowMore')]//child::div[contains(@class,'vtex-button__label')]");
    public static Target ICON_LOAD= Target.the("").locatedBy("//*[local-name()='svg'  and @class='vtex-styleguide-9-x-rotate vtex__icon-spinner  c-action-primary ']");

    public static Target LABEL_NAME_ARTICLE = Target.the("").locatedBy("//div[contains(@class, 'quick-purchase')]//child::h3[contains(@class,'productNameContainer')]/span");
    public static Target LABEL_PRICE_ARTICLE_UNIT = Target.the("").locatedBy("//div[contains(@class,'quick-purchase')]//div[contains(@class,'PricePDP')]//span");
    public static Target BUTTON_ADD =Target.the("").locatedBy("//span[@class='exito-vtex-components-4-x-buttonText']");
    public static Target ICON_SELECT_NUMBER_ARTICLES =Target.the("").locatedBy("//span[contains(@class,'buy-button-manager-more')]");
    public static Target LABEL_CONTINUE_SHOPPING =Target.the("").locatedBy("//p[@class='exito-vtex-components-4-x-continue']");

    public static Target ICON_SHOPPING_CART =Target.the("").locatedBy("//a[@class='exito-header-3-x-minicartLink']");

}
