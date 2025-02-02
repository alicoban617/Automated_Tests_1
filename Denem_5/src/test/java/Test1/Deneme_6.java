package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class Deneme_6 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_1.exe");
        WebDriver webDriver6 = new ChromeDriver();
        webDriver6.get("https://demoqa.com/dynamic-properties");
        webDriver6.manage().window().maximize();

        WebElement propertiesText1 = webDriver6.findElement(By.xpath("//div/p[contains(text(), 'This text has random Id')]"));
        String pText1 = propertiesText1.getText();
        System.out.println(pText1);

//        WebElement enableafter5sec = webDriver6.findElement(new By.ByCssSelector("button[id='enableAfter']"));
//        WebDriverWait wait5sec = new WebDriverWait(webDriver6, Duration.ofSeconds(5));
//        wait5sec.until(ExpectedConditions.elementToBeClickable(enableafter5sec));
//        enableafter5sec.click();

//        WebElement colorChange = webDriver6.findElement(By.id("colorChange"));
//        String colorAtt = colorChange.getAttribute("class");
//        System.out.println("Before change " + colorAtt);
//        WebDriverWait wait5sec2 = new WebDriverWait(webDriver6, Duration.ofSeconds(5));
//        wait5sec2.until(ExpectedConditions.attributeToBe(colorChange,"class", "mt-4 text-danger btn btn-primary" ));
//        colorAtt = colorChange.getAttribute("class");
//        System.out.println("After change " + colorAtt);

        WebDriverWait wait5sec3 = new WebDriverWait(webDriver6, Duration.ofSeconds(5));
        wait5sec3.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
        webDriver6.findElement(By.id("visibleAfter")).click();



    }
}
