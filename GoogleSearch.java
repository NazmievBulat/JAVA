

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class GoogleSearch {

    private static final String GOOGLE_MAIN_PAGE_URL = "https://www.google.com/";
    WebDriver driver;


    //1. open browser
    //2. go to Google main page
    //3. type search query
    //4. submit query
    //5. verify Results Page is opened
    @Test
    public void test0001() {
        OpenBrowser();
        goToMainPage();
        typeSearchQuery();
        submitQuery();
        //waitFor(5);
        waitForElement();
        verifyResultsPage();
    }

    private void waitForElement() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result-stats")));
    }

    private void waitFor(int numberOfSeconds) {
        try {
            sleep(numberOfSeconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void verifyResultsPage() {
        WebElement element = driver.findElement(By.id("result-stats"));
        boolean displayed = element.isDisplayed();
        Assert.assertEquals(displayed, true);
    }

    private void submitQuery() {
        driver.findElement(By.name("q")).submit();
        driver.findElement(By.xpath())
    }

    private void typeSearchQuery() {
        By searchInputElement = By.name("q");
        WebElement element = driver.findElement(searchInputElement);
        element.sendKeys("Portnov Computer School");

        //driver.findElement(By.name("q")).sendKeys("Portnov Computer School");
    }

    private void goToMainPage() {
        driver.get(GOOGLE_MAIN_PAGE_URL);
    }

    private void OpenBrowser() {

        System.setProperty("webdriver.gecko.driver", "src/test/resources/Drivers/geckodriver");
        driver = new FirefoxDriver();
    }
}
