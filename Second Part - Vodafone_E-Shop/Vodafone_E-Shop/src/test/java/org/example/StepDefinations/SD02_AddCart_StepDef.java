package org.example.StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_HomePage;
import org.example.Pages.P02_ProductPage;
import org.testng.Assert;

public class SD02_AddCart_StepDef extends Hocks {

    P01_HomePage homePage = new P01_HomePage();
    P02_ProductPage productsPage = new P02_ProductPage();

    @Given("User navigate to home screen")
    public void userNavigateToHomeScreen()
    {
        Hocks.driver.navigate().to("https://eshop.vodafone.com.eg/en/");
    }

    @When("User choose product and add it to cart successfully")
    public void userClicksOnProduct()
    {
        homePage.homeProduct1().click();
        productsPage.addToCartBtn().click();
        validateSuccess();

        userNavigateToHomeScreen();

        homePage.homeProduct2().click();
        productsPage.addToCartBtn().click();
        validateSuccess();
    }

    public void validateSuccess(){
        extentTest = extentReports.createTest("Test Case 2");
        Assert.assertTrue(productsPage.successMsg().isDisplayed());
    }

    @Then("Cart items count increased")
    public void cartItemsCountIncreased()
    {
        extentTest = extentReports.createTest("Test Case 3");
        Assert.assertEquals(homePage.cartCount().getText(),"2");
    }


}
