package com.nttdata.page;

import org.openqa.selenium.By;

public class PrincipalPage {

    public static By categoryButton = By.cssSelector("#category-3 > a");
    public static By subcategoryButton =By.cssSelector("#subcategories > ul > li:nth-child(1) > h5 > a");
    public static By seccionMen = By.cssSelector("#js-product-list > div.products.row > div > article > div > div.thumbnail-top > a");
    public static By clickAgregar = By.cssSelector("#add-to-cart-or-refresh > div.product-add-to-cart.js-product-add-to-cart > div > div.qty > div > span.input-group-btn-vertical > button.btn.btn-touchspin.js-touchspin.bootstrap-touchspin-up");
    public static By buttonCarrito = By.cssSelector("#add-to-cart-or-refresh > div.product-add-to-cart.js-product-add-to-cart > div > div.add > button");
    public static By confirmacionCarrito = By.xpath("//*[@id=\"myModalLabel\"]");
    public static By precioPorUnidad = By.cssSelector("#blockcart-modal > div > div > div.modal-body > div > div.col-md-5.divide-right > div > div:nth-child(2) > p");
    public static By cantidadProductos = By.cssSelector("#blockcart-modal > div > div > div.modal-body > div > div.col-md-5.divide-right > div > div:nth-child(2) > span.product-quantity > strong");
    public static By total = By.cssSelector("#blockcart-modal > div > div > div.modal-body > div > div.col-md-7 > div > p.product-total > span.value");
    public static By finalizarCompra = By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a");
    public static By tituloCarrito = By.xpath("//*[@id=\"main\"]/div/div[1]/div/div[1]/h1");
    public static By precioUnitarioFinal = By.cssSelector("#main > div > div.cart-grid-body.col-lg-8 > div > div.cart-overview.js-cart > ul > li > div > div.product-line-grid-body.col-md-4.col-xs-8 > div.product-line-info.product-price.h5.has-discount > div.current-price > span");
    public static By cantidadProductoFinal = By.cssSelector("#cart-subtotal-products > span.label.js-subtotal");
    public static By montoTotalFinal = By.cssSelector("#main > div > div.cart-grid-right.col-lg-4 > div.card.cart-summary > div.cart-detailed-totals.js-cart-detailed-totals > div.card-block.cart-summary-totals.js-cart-summary-totals > div.cart-summary-line.cart-total > span.value");
}

