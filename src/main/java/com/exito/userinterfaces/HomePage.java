package com.exito.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("page:webdriver.base.url")
public class HomePage extends PageObject {
    public static Target ICON_MENU = Target.the("Icon of the main menu").locatedBy("//div[@id='category-menu']");
    public static Target ICON_MENU_CATEGORY = Target.the("Icon of the category menu").locatedBy("//li[contains(@id, 'undefined-nivel2-{0}')]");
    public static Target ICON_MENU_SUBCATEGORY = Target.the("Icon of the subcategory menu").locatedBy("//a[contains(@id, 'Categorías-nivel3-{0}')]");
    public static Target ICON_LOAD = Target.the("Loading icon").locatedBy("//*[local-name()='svg'  and @class='vtex-styleguide-9-x-rotate vtex__icon-spinner  c-action-primary ']");
    public static Target BUTTON_SHOW_MORE = Target.the("Button that allows to show more articles").locatedBy("//div[contains(@class, 'buttonShowMore')]//child::div[contains(@class,'vtex-button__label')]");
    public static Target BUTTON_BUY = Target.the("Button that allows you to start the purchase of the product").locatedBy("//div[contains(@class,'button-modal')]/span");
    public static Target ICON_SHOPPING_CART = Target.the("Icon to access shopping cart information").locatedBy("//a[@class='exito-header-3-x-minicartLink']");

}

