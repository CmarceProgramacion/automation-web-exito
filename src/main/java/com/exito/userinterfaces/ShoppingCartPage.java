package com.exito.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCartPage extends PageObject {
    public static final Target IMG_PRODUCT = Target.the("Image corresponding to the product").locatedBy("//div[@class='exito-product-details-3-x-elementScroll']");
    public static final Target LABEL_PRODUCT_NAMES = Target.the("Label corresponding to the product name").locatedBy("//a[@id='product-name{0}']");
    public static final Target LABEL_PRODUCT_VALUE = Target.the("Label corresponding to the total value of the product").locatedBy("(//a[@id='product-name{0}']//following::span[@class='total-selling-price'])[1]");
    public static final Target LABEL_PRODUCT_UNITS = Target.the("Label corresponding to the number of units of the product").locatedBy("//div[@class='totalItems']");
}
