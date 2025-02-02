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

public class Deneme_17 {
    WebDriver webDriver17;

    @Test

    public void test_1() {
        System.setProperty("webdrive.chrome.driver", "drivers/chromedriver_1.exe");
        webDriver17 = new ChromeDriver();
        webDriver17.get("https://demoqa.com/accordian");
        webDriver17.manage().window().maximize();

        List<WebElement> texts = webDriver17.findElements(new By.ByCssSelector("[class ='card-header']"));
        String text1 = texts.get(0).getText();
        System.out.println(text1);

        WebElement innerText1 = webDriver17.findElement(By.cssSelector("#section1Content > p"));


        if(!text1.isEmpty()){
            String iiTExt = innerText1.getText();
            System.out.println(iiTExt);
        }
        else System.out.println("Text existiert nicht");


    }
}
