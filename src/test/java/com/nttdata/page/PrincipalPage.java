package com.nttdata.page;

import org.openqa.selenium.By;

public class PrincipalPage {

    public static By categoryButton = By.cssSelector("#category-3 > a");
    public static By subcategoryButton =By.cssSelector("#subcategories > ul > li:nth-child(1) > h5 > a");
    public static By seccionMen = By.cssSelector("#js-product-list > div.products.row > div > article > div > div.thumbnail-top > a");
    public static By clickAgregar = By.cssSelector("#add-to-cart-or-refresh > div.product-add-to-cart.js-product-add-to-cart > div > div.qty > div > span.input-group-btn-vertical > button.btn.btn-touchspin.js-touchspin.bootstrap-touchspin-up");
    public static By buttonCarrito = By.cssSelector("#add-to-cart-or-refresh > div.product-add-to-cart.js-product-add-to-cart > div > div.add > button");

}
