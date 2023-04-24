package com.exito.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCartPage extends PageObject {

    public static final Target IMG_PRODUCT =Target.the("").locatedBy("//div[@class='exito-product-details-3-x-elementScroll']");

    public static final Target LABEL_PRODUCT_NAMES = Target.the("").locatedBy("//a[@id='product-name{0}']");
    public static final Target LABEL_PRODUCT_VALUE = Target.the("").locatedBy("(//a[@id='product-name{0}']//following::span[@class='total-selling-price'])[1]");
    public static final Target LABEL_PRODUCT_UNITS = Target.the("").locatedBy("//div[@class='totalItems']");
}
