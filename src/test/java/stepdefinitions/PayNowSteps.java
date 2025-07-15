package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PayNowSteps {
    WebDriver driver;

    @Given("User opens the PayNow form")
    public void user_opens_the_paynow_form() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        File file = new File("src/test/resources/paynow_form.html");
        driver.get(file.toURI().toString());
    }

    @When("User enters mobile number {string}")
    public void user_enters_mobile_number(String mobile) {
        driver.findElement(By.id("mobile")).sendKeys(mobile);
    }

    @When("User enters amount {string}")
    public void user_enters_amount(String amount) {
        driver.findElement(By.id("amount")).sendKeys(amount);
    }

    @When("User enters reference {string}")
    public void user_enters_reference(String reference) {
        driver.findElement(By.id("reference")).sendKeys(reference);
    }

    @When("User clicks the Submit button")
    public void user_clicks_the_submit_button() {
        driver.findElement(By.id("submitBtn")).click();
    }

    @Then("Confirmation message should be displayed")
    public void confirmation_message_should_be_displayed() {
        WebElement message = driver.findElement(By.id("confirmationMessage"));
        assertTrue(message.isDisplayed());
        driver.quit();
    }
    @Then("Form page should load successfully")
    public void form_page_should_load_successfully() {
        String title = driver.getTitle();
        assertTrue(title.contains("PayNow")); // or verify form exists
}
    @Then("Mobile number error message should be displayed")
    public void mobile_number_error_message_should_be_displayed() {
        WebElement error = driver.findElement(By.id("mobileError"));
        assertTrue(error.isDisplayed());
        assertEquals("Mobile number is required", error.getText());
    }
}