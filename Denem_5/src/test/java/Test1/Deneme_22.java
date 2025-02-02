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

public class Deneme_22 {
    private WebDriver webDriver22;
    private WebDriverWait wait;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_1.exe");
        webDriver22 = new ChromeDriver();
        webDriver22.manage().window().maximize();
        wait = new WebDriverWait(webDriver22, Duration.ofSeconds(2));

    }
    @Test
    public void test_1() {
        webDriver22.get("https://demoqa.com/tool-tips");

        WebElement hoverMeBtn = webDriver22.findElement(new By.ByCssSelector("button[id='toolTipButton']"));
        Actions action = new Actions(webDriver22);
        action.moveToElement(hoverMeBtn).perform();
        wait.until(ExpectedConditions.attributeToBe(hoverMeBtn, "aria-describedby", "buttonToolTip"));
        String expectedText = "buttonToolTip";
        String targetText = hoverMeBtn.getAttribute("aria-describedby");
        Assertions.assertEquals(expectedText, targetText, "Hover over funktioniert nicht gut");


    }
}
