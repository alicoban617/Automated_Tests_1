package Test1;

import com.google.common.annotations.VisibleForTesting;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class Deneme_13 {

    WebDriver webDriver13;
    @Test

    public void test_1() {

        System.setProperty("webdrive.chrome.driver", "driver/chromedriver_1.exe");
        webDriver13 = new ChromeDriver();
        webDriver13.get("https://demoqa.com/frames");
        webDriver13.manage().window().maximize();

        //webDriver13.switchTo().frame(0);   //ilk frame e ulasmak icin ilk yöntem
        webDriver13.switchTo().frame("frame1");  //ilk frame e ulasmak icin ikinci yöntem
        WebElement heading = webDriver13.findElement(By.id("sampleHeading"));
        String text1 = heading.getText();
        System.out.println(text1);

        webDriver13.switchTo().parentFrame();

        List<WebElement> divs = webDriver13.findElements((new By.ByCssSelector("div[id='framesWrapper'] div")));
        int absatzAnzahl = divs.size();
        String Absatz1 = divs.get(absatzAnzahl-3).getText();
        System.out.println(Absatz1);

        webDriver13.switchTo().parentFrame();
        webDriver13.switchTo().frame("frame2");
        WebElement heading2 = webDriver13.findElement(By.id("sampleHeading"));
        String text2 = heading2.getText();
        System.out.println(text2);











    }
}
