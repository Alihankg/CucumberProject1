package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.*;

public class AC01_Reg {
    DialogContent dc = new DialogContent();
    @Given("Navigate to Clever ecommerce")
    public void navigateToCampus() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
    }
    @When("click sign in")
    public void clickSignIn() {
        dc.myClick(dc.login);
    }
    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {

        dc.mySendKeys(dc.email, "eyp.mermer2007@gmail.com");
        dc.mySendKeys(dc.passwd, "Mahmut1234");
//        dc.mySendKeys(dc.email_create, "eyp.mermer2007@gmail.com");
        dc.myClick(dc.SubmitCreate);
    }
    @Then("User should Create an account successfully")
    public void userShouldLoginSuccessfully() {

        dc.myClick(dc.SubmitCreate);
    }
    @When("Enter username and password and click Register button")
    public void enterUsernameAndPasswordAndClickRegisterButton() {
        dc.mySendKeys(dc.firstname, "Mahmut");
        dc.mySendKeys(dc.lastname, "Yılmaz");
        dc.myClick(dc.email);
        dc.mySendKeys(dc.passwd, "Mahmut1234");
        dc.myClick(dc.submitAccount);
    }



}
