package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{

    public DialogContent(){
        PageFactory.initElements(GWD.getDriver(),this);
    }
    @FindBy(css="[class='login']")
    public WebElement login;

    @FindBy(id="email_create")
    public WebElement email_create;

    @FindBy(id="SubmitCreate")
    public WebElement SubmitCreate;

    @FindBy(id="customer_firstname")
    public WebElement firstname;

    @FindBy(id="customer_lastname")
    public WebElement lastname;
    @FindBy(id="passwd")
    public WebElement passwd;

    @FindBy(id="submitAccount")
    public WebElement submitAccount;

    @FindBy(id="email")
    public WebElement email;

    @FindBy(linkText="[title='Sitemap'] ")
    public WebElement Sitemap;

    @FindBy(id="SubmitLogin")
    public WebElement SubmitLogin;

    @FindBy(linkText="[title='Addresses']")
    public WebElement addresses;

    @FindBy(xpath="(//a[@class='btn btn-default button button-medium'])[2]")
    public WebElement button;

    @FindBy(id="address1")
    public WebElement address1;

    @FindBy(id="city")

    public WebElement city;
    @FindBy(xpath="(//i[@class='icon-building'])[2]")
    public WebElement Myaddress;

    @FindBy(id="id_state")
    public WebElement id_state;

    @FindBy(id="postcode")
    public WebElement postcode;

    @FindBy(id="id_country")
    public WebElement id_country;

    @FindBy(id="phone")
    public WebElement phone;

    @FindBy(id="phone_mobile")
    public WebElement phone_mobile;

    @FindBy(id="alias")
    public WebElement alias;

    @FindBy(id="submitAddress")
    public WebElement submitAddress;

    @FindBy(xpath="(//a[@class='sf-with-ul'])[1]")
    public WebElement with;

    @FindBy(css="[class='grower OPEN']")
    public WebElement OPEN;

    @FindBy(linkText="(//a[@title='Short dress, long dress, silk dress, printed dress, you will find the perfect dress for summer.'])[1]")
    public WebElement Short;

    @FindBy(linkText="(//a[@class='product-name'])[1]")
    public WebElement product;

    @FindBy(name="[name='Submit']")
    public WebElement Submit;

}
