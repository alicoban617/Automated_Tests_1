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

public class Deneme_16 {

    WebDriver webDriver16;

    @Test
    public void test_1() throws InterruptedException {
        System.setProperty("webdrive.chrome.driver", "driver/chromedriver_1.exe");
        webDriver16 = new ChromeDriver();
        webDriver16.get("https://demoqa.com/modal-dialogs");
        webDriver16.manage().window().maximize();

        List<WebElement> buttons = webDriver16.findElements(new By.ByCssSelector("[type='button']"));
        WebElement button1 = buttons.get(1);


        button1.click();

        WebElement title1 = webDriver16.findElement(new By.ByCssSelector("[class='modal-title h4']"));
        WebElement body1 = webDriver16.findElement(new By.ByCssSelector("[class ='modal-body']"));

        String title1Text = title1.getText();
        String body1Text = body1.getText();
        System.out.println(title1Text + " " + body1Text);

        WebElement modalarea = webDriver16.findElement(new By.ByCssSelector("[class='fade modal show']"));
        boolean modalareaisexisting = modalarea.isDisplayed();
        if(modalareaisexisting) {
            System.out.println("Modal area erscheint.");
        }
        else System.out.println("Modal area erscheint nicht.");

        WebElement closeButton1 = webDriver16.findElement(new By.ByCssSelector("[class='btn btn-primary']"));
        Thread.sleep(2000);
        closeButton1.click();

    }
    @Test
    public void test_2() throws InterruptedException {
        System.setProperty("webdrive.chrome.driver", "driver/chromedriver_1.exe");
        webDriver16 = new ChromeDriver();
        webDriver16.get("https://demoqa.com/modal-dialogs");
        webDriver16.manage().window().maximize();

        List<WebElement> buttons = webDriver16.findElements(new By.ByCssSelector("[type='button']"));
        WebElement button2 = buttons.get(2);
        button2.click();

        WebElement title2 = webDriver16.findElement(new By.ByCssSelector("[id='example-modal-sizes-title-lg']"));
        WebElement body2 = webDriver16.findElement(By.xpath("//div/p"));

        String title2Text = title2.getText();
        String body2Text = body2.getText();
        System.out.println(title2Text + " " + body2Text);

        WebElement modalarea = webDriver16.findElement(new By.ByCssSelector("[class='fade modal show']"));
        boolean modalareaisexisting = modalarea.isDisplayed();
        if(modalareaisexisting) {
            System.out.println("Modal area erscheint.");
        }
        else System.out.println("Modal area erscheint nicht.");

        WebElement closeButton2 = webDriver16.findElement(new By.ByCssSelector("[id='closeLargeModal']"));
        Thread.sleep(2000);
        closeButton2.click();

    }
}
