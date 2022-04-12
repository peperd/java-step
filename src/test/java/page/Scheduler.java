package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Scheduler extends PageBase {

    public Scheduler(WebDriver driver) {
        super(driver);
    }

    public void clickScheduler() {
        click(By.cssSelector(".glyphicon.glyphicon-time"));
    }

    public void newTaskDisplayed() {
        waitButtonToBeClickalble(By.xpath("//button[contains(text(), 'New task')]"));
    }

}
