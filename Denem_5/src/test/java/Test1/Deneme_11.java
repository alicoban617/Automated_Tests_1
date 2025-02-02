package Test1;

import com.google.common.annotations.VisibleForTesting;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Deneme_11 {

    WebDriver webDriver11;
@Test
    public void test_1(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_1.exe");
        webDriver11 = new ChromeDriver();
        webDriver11.get("https://tierarztpraxis-weimbs.de/");
        webDriver11.manage().window().maximize();

        WebElement terminBuchenBtn = webDriver11.findElement(By.xpath("//div[@class='md-text-align-center']/a/span[@class='fusion-button-text']"));
        terminBuchenBtn.click();

        List<String> terminBuchenPages = new ArrayList<>(webDriver11.getWindowHandles());
        int tBPageAnzahl = terminBuchenPages.size();
        System.out.println(tBPageAnzahl);

        webDriver11.switchTo().window(terminBuchenPages.get(tBPageAnzahl-1));
        String tBBtnSeite = webDriver11.getCurrentUrl();
        System.out.println(tBBtnSeite);

    }

}
