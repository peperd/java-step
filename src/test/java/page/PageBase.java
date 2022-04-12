package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class PageBase {
    public WebDriver driver;
    public WebDriverWait wait;

    public PageBase(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void waitButtonToBeClickalble(By elementBy){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(elementBy));
    }

    // Wait wrapper method
    public void waitVisibility(By elementBy){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    // Method click
    public void click(By elementBy){
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    // Method get element
    public WebElement getElement(By elementBy){
        waitVisibility(elementBy);
        return driver.findElement(elementBy);
    }

    // Is element displayed
    public void isElementDisplayed(By elementBy){
        waitVisibility(elementBy);
        assertTrue(driver.findElement(elementBy).isDisplayed());
    }


}
