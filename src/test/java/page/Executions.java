package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Executions extends PageBase{
    public Executions(WebDriver driver) {
        super(driver);
    }

    public void clickExecutions() {
        click(By.xpath("//a[contains(text(), ' Executions')]"));
    }

    public void executionListDisplayed() {
        isElementDisplayed(By.xpath("//a[contains(text(), ' Execution list')]"));
    }

}
