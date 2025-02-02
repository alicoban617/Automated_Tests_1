package Test1;

import com.google.common.annotations.VisibleForTesting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Deneme_21 {
     WebDriver webDriver21;


    @Test

    public void test_1() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_1.exe");
        webDriver21 = new ChromeDriver();
        webDriver21.get("https://demoqa.com/progress-bar");
        webDriver21.manage().window().maximize();

        WebElement startStopBtn = webDriver21.findElement(new By.ByCssSelector("#startStopButton"));
        WebElement progressBar = webDriver21.findElement(new By.ByCssSelector("#progressBar > div"));
        startStopBtn.click();

        WebDriverWait wait1 = new WebDriverWait(webDriver21, Duration.ofSeconds(10));
        wait1.pollingEvery(Duration.ofMillis(80));
        int targetValue = 52;


        wait1.until(ExpectedConditions.attributeToBe(progressBar, "aria-valuenow", String.valueOf(targetValue)));
        startStopBtn.click();

        int expectedValue = Integer.parseInt(progressBar.getAttribute("aria-valuenow"));
        Assertions.assertEquals(expectedValue, targetValue, "Progressbar funktioniert nicht");




    }


    @Test
    public void test_2() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_1.exe");
        webDriver21 = new ChromeDriver();
        webDriver21.get("https://demoqa.com/progress-bar");
        webDriver21.manage().window().maximize();

        WebElement startBtn = webDriver21.findElement(new By.ByCssSelector("#startStopButton"));
        startBtn.click();

        WebDriverWait wait2 = new WebDriverWait(webDriver21, Duration.ofSeconds(10));
        wait2.pollingEvery(Duration.ofMillis(100));
        wait2.until(ExpectedConditions.attributeToBe(new By.ByCssSelector("button[class='mt-3 btn btn-primary']"), "id", "resetButton" ));

    }
}
