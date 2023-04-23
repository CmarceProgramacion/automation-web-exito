package com.exito.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCartPage extends PageObject {

    public static final Target LABEL_PRODUCT_NAMES = Target.the("").locatedBy("//span[text()= '{0}']");
    public static final Target LABEL_PRODUCT_VALUE = Target.the("").locatedBy("(//preceding::span[text()= '{0}']//following::span[not(boolean(@class))]/span[contains(@class,'currencyContainer')])[1]");
    public static final Target LABEL_PRODUCT_UNIT = Target.the("").locatedBy("(//preceding::span[text()='Cabecero Para Cama Queen Dublin Gris']//following::span[boolean(@data-molecule-quantity-und-value)])[1]");
}
