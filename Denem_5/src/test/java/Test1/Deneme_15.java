package Test1;

import com.google.common.annotations.VisibleForTesting;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Deneme_15 {

    WebDriver webDriver15;

    @Test
    public void test_1() {
        System.setProperty("webdrive.chrome.driver", "driver/chromedriver_1.exe");
        webDriver15 = new ChromeDriver();
        webDriver15.get("https://tierarztpraxis-weimbs.de/");
        webDriver15.manage().window().maximize();
    }
    @Test
    public void test_2() throws InterruptedException {
        System.setProperty("webdrive.chrome.driver", "driver/chromedriver_1.exe");
        webDriver15 = new ChromeDriver();
        webDriver15.get("https://tierarztpraxis-weimbs.de/");
        webDriver15.manage().window().maximize();

        Thread.sleep(2000);

        //List<WebElement> consentContainers = webDriver15.findElements(new By.ByCssSelector("[class='cky-consent-container cky-box-bottom-left']"));


        WebElement xButton = webDriver15.findElement(new By.ByCssSelector("[class='cky-banner-btn-close'] img"));
        xButton.click();
    }
}
