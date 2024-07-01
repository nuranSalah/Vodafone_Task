package org.example.StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_HomePage;
import org.example.Pages.P02_ProductPage;
import org.testng.Assert;

public class SD01_Search_StepDef extends Hocks {

    P01_HomePage homePage = new P01_HomePage();
    P02_ProductPage productPage = new P02_ProductPage();

    @Given("User write name {string} of product in search bar")
    public void User_Search_With_Product_Name(String name)
    {
        homePage.search_TextBox().sendKeys(name);
    }


    @When("User clicks on desired searched product")
    public void User_Clicks_On_Searched_Product()
    {
        homePage.searchProduct().click();
    }

    @Then("Success message appears")
    public void successMessageAppears()
    {
        extentTest = extentReports.createTest("Test Case 1");
        Assert.assertEquals(productPage.successMsg().getCssValue("background-color"),"rgb(10, 92, 54");
    }
}
