package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main extends PageBase {
    String TEST_URL = "http://localhost:8080/";

    public Main(WebDriver driver) {
        super(driver);
    }

    public void goTo(){
        driver.get(TEST_URL);
    }

    public void username(String user){
        getElement(By.cssSelector("[name='username']")).sendKeys(user);
    }

    public void password(String password) {
        getElement(By.cssSelector("[name='password']")).sendKeys((password));
    }

    public void clearUsername() {
        getElement(By.cssSelector("[name='username']")).clear();
    }

    public void clearPassword(){
        getElement(By.cssSelector("[name='password']")).clear();
    }

    public void submit(){
        click(By.cssSelector("[type='submit']"));
    }

    public void LoginToWebpage() {
        this.goTo();
        this.clearUsername();
        this.clearPassword();
        this.username("admin");
        this.password("init");
        this.submit();
    }
}
