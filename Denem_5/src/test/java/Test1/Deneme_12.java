package Test1;

import com.google.common.annotations.VisibleForTesting;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Deneme_12 {

    WebDriver webDriver12;
    @Test
    public void test_1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_1.exe");
        webDriver12 = new ChromeDriver();
        webDriver12.get("https://demoqa.com/alerts");
        webDriver12.manage().window().maximize();

        WebElement alertButton = webDriver12.findElement(By.id("alertButton"));
        alertButton.click();
        Thread.sleep(2000);
        webDriver12.switchTo().alert().accept();
    }
    @Test
    public void test_2() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_1.exe");
        webDriver12 = new ChromeDriver();
        webDriver12.get("https://demoqa.com/alerts");
        webDriver12.manage().window().maximize();

        WebElement alertButton5Sec = webDriver12.findElement(By.id("timerAlertButton"));
        alertButton5Sec.click();

//        WebDriverWait wait5Sec = new WebDriverWait(webDriver12, Duration.ofSeconds(10));
//        wait5Sec.until(ExpectedConditions.alertIsPresent());

        Thread.sleep(5000);
        webDriver12.switchTo().alert().accept();
    }

    @Test
    public void test_3() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_1.exe");
        webDriver12= new ChromeDriver();
        webDriver12.get("https://demoqa.com/alerts");
        webDriver12.manage().window().maximize();

        WebElement alertButtonConfirmBox = webDriver12.findElement(By.id("confirmButton"));
        alertButtonConfirmBox.click();

        Thread.sleep(2000);
        webDriver12.switchTo().alert().accept();
    }

    @Test
    public void test_4() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_1.exe");
        webDriver12= new ChromeDriver();
        webDriver12.get("https://demoqa.com/alerts");
        webDriver12.manage().window().maximize();

        WebElement alertButtonPromptBox = webDriver12.findElement(By.id("promtButton"));
        alertButtonPromptBox.click();

        Thread.sleep(2000);

        webDriver12.switchTo().alert().sendKeys("Möp Köp");
        webDriver12.switchTo().alert().accept();
    }
}
