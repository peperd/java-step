package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page.*;

import java.time.Duration;

public class TestBase{
    public Main main;
    public Plans plans;
    public Keywords keywords;
    public Parameters parameters;
    public Executions executions;
    public Scheduler scheduler;
    WebDriver driver;



    @BeforeEach
    public void start(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        main = PageFactory.initElements(driver, Main.class);
        plans = PageFactory.initElements(driver, Plans.class);
        keywords = PageFactory.initElements(driver, Keywords.class);
        parameters = PageFactory.initElements(driver, Parameters.class);
        executions = PageFactory.initElements(driver, Executions.class);
        scheduler = PageFactory.initElements(driver, Scheduler.class);
        main.LoginToWebpage();

    }

    @AfterEach
    public void finish(){
        driver.quit();
    }

}
