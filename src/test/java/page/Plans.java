package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Plans extends PageBase{
    public Plans(WebDriver driver) {
        super(driver);
    }

    public void newPlanDisplayed() {
        waitButtonToBeClickalble(By.xpath("//button[contains(text(), 'New plan')]"));
    }
}
