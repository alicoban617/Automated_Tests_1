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

public class Deneme_14 {

    WebDriver webDriver14;


    @Test
    public void test_1() throws InterruptedException {
        System.setProperty("webdrive.chrome.driver", "driver/chromedriver_1.exe");
        webDriver14 = new ChromeDriver();
        webDriver14.get("https://demoqa.com/nestedframes#google_vignette");
        webDriver14.manage().window().maximize();

        Thread.sleep(3000);
        List<WebElement> iframes = webDriver14.findElements(new By.ByCssSelector("iframe[title='3rd party ad content']"));


        webDriver14.switchTo().frame(iframes.get(0));

        List<WebElement> xButtons = webDriver14.findElements(new By.ByCssSelector("[class='il-icon']"));
        xButtons.get(0).click();

    }
    @Test
    public void test_2() {
        System.setProperty("webdrive.chrome.driver", "driver/chromedriver_1.exe");
        webDriver14 = new ChromeDriver();
        webDriver14.get("https://demoqa.com/nestedframes#google_vignette");
        webDriver14.manage().window().maximize();

        WebElement pFrame = webDriver14.findElement(new By.ByCssSelector("iframe[id='frame1']"));
        webDriver14.switchTo().frame(pFrame);

        WebElement pFrameText = webDriver14.findElement(By.xpath(".//html/body"));
        String pFtext = pFrameText.getText();

        if(pFtext.equals("Parent frame")){
            System.out.println("Test ist erfolgreich");
            System.out.println(pFtext);
        }
        else{
            System.out.println("Test ist nicht erfolgreich");
        }

    }
    @Test
    public void test_3() {
        System.setProperty("webdrive.chrome.driver", "driver/chromedriver_1.exe");
        webDriver14 = new ChromeDriver();
        webDriver14.get("https://demoqa.com/nestedframes#google_vignette");
        webDriver14.manage().window().maximize();

        WebElement pFrame = webDriver14.findElement(new By.ByCssSelector("iframe[id='frame1']"));
        webDriver14.switchTo().frame(pFrame);

        webDriver14.switchTo().frame(0);

        WebElement cFrame1Text = webDriver14.findElement(By.tagName("body"));
        String cF1text = cFrame1Text.getText();

        if(cF1text.equals("Child Iframe")){
            System.out.println("Test ist erfolgreich");
            System.out.println(cF1text);
        }
        else{
            System.out.println("Test ist nicht erfolgreich");
        }
        webDriver14.switchTo().parentFrame();
        webDriver14.switchTo().parentFrame();

    }
}
