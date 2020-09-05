package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BlueSkyCitadelForm {
    WebDriver driver;


    @Given("^I navigate to blueskycitadelform site$")
    //@Given("I navigate to blueskycitadelform site")
    public void i_navigate_to_blueskycitadelform_site()  {
        //STEP 2: set your system path
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

        //STEP 3: Instantiate your firefox driver
        driver = new FirefoxDriver();

        //STEP 4: Navigate to url
        driver.get("http://blueskycitadel.com/");
    }

    @When("^I click on Automation Testing Form$")
    public void iClickOnAutomationTestingForm() {
        driver.findElement(By.linkText("Automation Testing Form")).click();

    }

    @And("^I enter the Single Line Text$")
    public void iEnterTheSingleLineText() {
        driver.findElement(By.xpath("//*[@id=\"nf-field-135\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"nf-field-135\"]")).sendKeys("My first enter");

    }

    @And("^I click on Events$")
    public void iClickOnEvents() {
      driver.findElement(By.xpath("//*[@id=\"menu-item-704\"]/a")).click();
    }

    @And("^I click on EVENTS IN to select month$")
    public void iClickOnEVENTSINToSelectMonth() {
        driver.findElement(By.cssSelector("#tribe-bar-date")).sendKeys("05-09-2020");
    }

    @And("^I enter keyword in SEARCH$")
    public void iEnterKeywordInSEARCH() {
        driver.findElement(By.xpath("//*[@id=\"tribe-bar-search\"]")).sendKeys("Manual Training");
    }

    @Then("^I close my window$")
    public void iCloseMyWindow() {
        driver.close();
    }
}
