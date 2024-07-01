package org.example.Pages;

import org.example.StepDefinations.Hocks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_HomePage {

    ////// Search items //////

    public WebElement search_TextBox()
    {
        return Hocks.driver.findElement(By.id("searchInput"));
    }

    public WebElement searchProduct() { return Hocks.driver.findElement(By.xpath("/html/body/vf-root/main/section[1]/vf-nav-bar/nav/div/div[2]/vf-search-engine/div[1]/div[2]/div[9]"));}

    ////// Home items //////

    public WebElement homeProduct1() { return Hocks.driver.findElement(By.xpath("//*[@id=\"01H9DBCMGPEYMX1Y2S61411DGB\"]/vf-product-box-featured[2]")); }

    public WebElement homeProduct2() { return Hocks.driver.findElement(By.xpath("//*[@id=\"01HJ6A5VWGMP4S0EMDJ9VT10QJ\"]/vf-product-box-featured[2]")); }

    public WebElement cartCount() { return Hocks.driver.findElement(By.xpath("/html/body/vf-root/main/section[1]/vf-nav-bar/nav/div/div[3]/vf-cart/div/button/span")); }
}
