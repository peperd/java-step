package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Keywords extends Main{
    public Keywords(WebDriver driver) {
        super(driver);
    }

    public void clickKeywords() {
        click(By.xpath("//a[contains(text(), 'Keywords')]"));
    }

    public void newKeywordDisplayed() {
        waitButtonToBeClickalble(By.xpath("//button[contains(text(), 'New keyword')]"));
    }

}
