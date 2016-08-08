import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by Rena on 27.07.2016.
 */
public class Positive {

    @Test

    public void LogIn() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rena\\IdeaProjects\\test1\\lib\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://makeup.com.ua/");
        driver.findElement(By.xpath("//header/div/div/div[3]/div")).click();
        driver.findElement(By.name("user_login")).clear();
        driver.findElement(By.name("user_login")).sendKeys("renataiyber@mail.ru");
        driver.findElement(By.name("user_pw")).clear();
        driver.findElement(By.name("user_pw")).sendKeys("3f968c06");
        driver.findElement(By.cssSelector("button.button.full-width")).click();
        driver.close();
    }


    @Test
    public void LogOut() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rena\\IdeaProjects\\test1\\lib\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://makeup.com.ua/");
        driver.findElement(By.xpath("//header/div/div/div[3]/div")).click();
        driver.findElement(By.name("user_login")).clear();
        driver.findElement(By.name("user_login")).sendKeys("renataiyber@mail.ru");
        driver.findElement(By.name("user_pw")).clear();
        driver.findElement(By.name("user_pw")).sendKeys("3f968c06");
        driver.findElement(By.cssSelector("button.button.full-width")).click();
        driver.findElement(By.cssSelector(".layout>div>a")).click();
        driver.findElement(By.cssSelector(".private-office__tabs__item.exit>a")).click();
        driver.close();
    }


    @Test

    public void OpenMakeupWindow() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rena\\IdeaProjects\\test1\\lib\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://makeup.com.ua/");
        driver.findElement(By.xpath("//header/div/div/div[3]/div")).click();
        driver.findElement(By.name("user_login")).clear();
        driver.findElement(By.name("user_login")).sendKeys("renataiyber@mail.ru");
        driver.findElement(By.name("user_pw")).clear();
        driver.findElement(By.name("user_pw")).sendKeys("3f968c06");
        driver.findElement(By.xpath("//a[contains(text(),'Мейкап')]")).click();
        driver.close();
    }

    @Test

    public void FilterByBrendNyx() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rena\\IdeaProjects\\test1\\lib\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://makeup.com.ua/");
        driver.findElement(By.xpath("//header/div/div/div[3]/div")).click();
        driver.findElement(By.name("user_login")).clear();
        driver.findElement(By.name("user_login")).sendKeys("renataiyber@mail.ru");
        driver.findElement(By.name("user_pw")).clear();
        driver.findElement(By.name("user_pw")).sendKeys("3f968c06");
        driver.findElement(By.xpath("//a[contains(text(),'Мейкап')]")).click();
        driver.findElement(By.xpath("//div[@id='filter-block-wrap']/div/div/ul/li[14]/label")).click();
        driver.findElement(By.linkText("NYX(51)")).click();
        Thread.sleep (4000);
        driver.close();
    }

    @Test

    public void DateOfBirth() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rena\\IdeaProjects\\test1\\lib\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://makeup.com.ua/");
        driver.findElement(By.xpath("//header/div/div/div[3]/div")).click();
        driver.findElement(By.name("user_login")).clear();
        driver.findElement(By.name("user_login")).sendKeys("renataiyber@mail.ru");
        driver.findElement(By.name("user_pw")).clear();
        driver.findElement(By.name("user_pw")).sendKeys("3f968c06");
        driver.findElement(By.cssSelector("button.button.full-width")).click();
        driver.findElement(By.xpath("html/body/div[1]/div/header/div[1]/div/div[3]/a")).click();
        driver.findElement(By.cssSelector(".link.form-load>span")).click();
        Thread.sleep (3000);
        driver.findElement(By.xpath(".//*[@id='birthday']")).clear();
        driver.findElement(By.xpath(".//*[@id='birthday']")).sendKeys("25.04.1994");
        driver.findElement(By.cssSelector("button.button")).click();
        driver.close();
    }
}

