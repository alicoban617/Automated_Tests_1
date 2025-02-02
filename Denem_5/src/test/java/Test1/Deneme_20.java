package Test1;

import com.google.common.annotations.VisibleForTesting;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.plaf.SliderUI;
import java.util.List;

public class Deneme_20 {

    WebDriver webDriver20;

    @Test

    public void test_1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_1.exe");
        webDriver20 = new ChromeDriver();
        webDriver20.get("https://demoqa.com/slider");
        webDriver20.manage().window().maximize();


        WebElement sliderRef = webDriver20.findElement(new By.ByCssSelector("input[class='range-slider range-slider--primary']"));
        WebElement targetElementref = webDriver20.findElement(new By.ByCssSelector("#sliderContainer > div.col-9 > span"));



        Actions action = new Actions(webDriver20);
        Actions move = new Actions(webDriver20);


        int initialValue = Integer.parseInt(sliderRef.getAttribute("value"));
        System.out.println("Başlangıç Değeri: " + initialValue);

        // Hedef değeri belirliyoruz
        int targetValue = 78;

        // Slider'ın genişliğini alıyoruz
        int sliderWidth = targetElementref.getSize().width;
        System.out.println(sliderWidth);
        int minValue = Integer.parseInt(sliderRef.getAttribute("min"));
        int maxValue = Integer.parseInt(sliderRef.getAttribute("max"));
        double ratio = (double) (targetValue - minValue) / (maxValue - minValue);
        int moveDistance = (int) (sliderWidth * ratio);

        Actions actions = new Actions(webDriver20);
        actions.clickAndHold(sliderRef)
                .moveByOffset(moveDistance, 0) // Hedef mesafeyi kaydırıyoruz
                .release() // Bırakıyoruz
                .perform();

    }
}
