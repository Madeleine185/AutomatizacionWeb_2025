package com.nttdata.steps;

import com.nttdata.page.LoginPage;
import com.nttdata.page.PrincipalPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LoginSteps {

    private WebDriver driver;

    //constructor
    public LoginSteps(WebDriver driver){

        this.driver = driver;
    }


    public void typeUser(String user){
        /*
        WebElement userInputElement = driver.findElement(LoginPage.emailInput);
        userInputElement.sendKeys(user);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.loginButton));


         */
        this.driver.findElement(LoginPage.emailInput).sendKeys(user);

    }

    public void typePassword(String password){

        this.driver.findElement(LoginPage.passInput).sendKeys(password);
    }


    public void login(){

        this.driver.findElement(LoginPage.loginButton).click();
    }



    /*public void BtnCategoria() {

        this.driver.findElement(PrecioProductoPage.btn_categoria).click();
    }*/




}



