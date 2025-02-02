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


public class Deneme_18 {

    WebDriver webDriver18;

    // //div[@id='autoCompleteSingle']//div//div/div

    @Test

    public void test_1() throws InterruptedException {
        System.setProperty("webdrive.chrome.driver", "drivers/chromedriver_1.exe");
        webDriver18 = new ChromeDriver();
        webDriver18.get("https://demoqa.com/auto-complete");
        webDriver18.manage().window().maximize();

        WebElement typeSingleColorNameRef = webDriver18.findElement(new By.ByCssSelector("input[id='autoCompleteSingleInput']"));

        //typeSingleColorNameRef.click();
        typeSingleColorNameRef.sendKeys("Red");
        Thread.sleep(1000);
        WebElement redEingabeRef = webDriver18.findElement(By.xpath("//div[contains(@class, 'auto-complete__menu-list')]//div[1]"));
        String redText = redEingabeRef.getText();
        System.out.println(redText);

    }
    @Test

    public void test_2() throws InterruptedException {
        System.setProperty("webdrive.chrome.driver", "drivers/chromedriver_1.exe");
        webDriver18 = new ChromeDriver();
        webDriver18.get("https://demoqa.com/auto-complete");
        webDriver18.manage().window().maximize();

        WebElement typeSingleColorNameRef = webDriver18.findElement(new By.ByCssSelector("input[id='autoCompleteSingleInput']"));

        //typeSingleColorNameRef.click();
        typeSingleColorNameRef.sendKeys("R");
        Thread.sleep(1000);

        List<WebElement> suggestions = webDriver18.findElements(new By.ByCssSelector("div.auto-complete__option"));

        for(WebElement sug : suggestions){
            System.out.println(sug.getText());
            System.out.println("_____________________________");
        }

//        WebElement redEingabeRef = webDriver18.findElement(By.xpath("//div[contains(@class, 'auto-complete__menu-list')]//div[1]"));
//        String redText = redEingabeRef.getText();
//        System.out.println(redText);

    }
}
