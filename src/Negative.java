import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by Rena on 28.07.2016.
 */
public class Negative {

    @Test

    public void WrongPass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rena\\IdeaProjects\\test1\\lib\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://makeup.com.ua/");
        driver.findElement(By.xpath("//header/div/div/div[3]/div")).click();
        driver.findElement(By.name("user_login")).clear();
        driver.findElement(By.name("user_login")).sendKeys("renataiyber@mail.ru");
        driver.findElement(By.name("user_pw")).clear();
        driver.findElement(By.name("user_pw")).sendKeys("qwertyu");
        driver.findElement(By.cssSelector("button.button.full-width")).click();
        driver.close();
    }

    @Test

    public void WrongLogIn() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rena\\IdeaProjects\\test1\\lib\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://makeup.com.ua/");
        driver.findElement(By.xpath("//header/div/div/div[3]/div")).click();
        driver.findElement(By.name("user_login")).clear();
        driver.findElement(By.name("user_login")).sendKeys("renata@mail.ru");
        driver.findElement(By.name("user_pw")).clear();
        driver.findElement(By.name("user_pw")).sendKeys("3f968c06");
        driver.findElement(By.cssSelector("button.button.full-width")).click();
        driver.close();
    }
}
