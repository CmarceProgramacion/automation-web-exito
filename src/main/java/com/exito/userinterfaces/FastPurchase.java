package com.exito.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FastPurchase extends PageObject {
    public static Target LABEL_PRODUCT_NAME = Target.the("").locatedBy("//div[contains(@class, 'quick-purchase')]//child::h3[contains(@class,'productNameContainer')]/span");
    public static Target LABEL_PRICE_PRODUCT_UNIT = Target.the("").locatedBy("//div[contains(@class,'quick-purchase')]//div[contains(@class,'PricePDP')]//span");
    public static Target BUTTON_ADD = Target.the("").locatedBy("//span[@class='exito-vtex-components-4-x-buttonText']");
    public static Target ICON_SELECT_PRODUCT_NUMBER = Target.the("").locatedBy("//span[contains(@class,'buy-button-manager-more')]");
    public static Target LABEL_CONTINUE_SHOPPING = Target.the("").locatedBy("//p[@class='exito-vtex-components-4-x-continue']");
}
