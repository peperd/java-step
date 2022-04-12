package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Parameters extends PageBase{


    public Parameters(WebDriver driver) {
        super(driver);
    }

    public void clickParameters() {
        click(By.xpath("//a[contains(text(), 'Parameters')]"));
    }

    public void newParameterDisplayed() {
        waitButtonToBeClickalble(By.xpath("//button[contains(text(), 'New parameter')]"));
    }

}
