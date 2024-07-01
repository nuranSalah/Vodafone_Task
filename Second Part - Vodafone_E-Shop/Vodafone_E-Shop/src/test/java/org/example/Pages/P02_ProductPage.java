package org.example.Pages;

import org.example.StepDefinations.Hocks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_ProductPage
{
    public WebElement addToCartBtn()
    {
        return Hocks.driver.findElement(By.className("add-to-cart"));
    }

    public WebElement successMsg(){ return Hocks.driver.findElement(By.className("alerts-mainContainer"));}

}
