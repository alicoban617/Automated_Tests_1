package Test1;

import com.google.common.annotations.VisibleForTesting;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Deneme_10 {

    WebDriver webDriver10;

    @Test

    public void test_1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_1.exe");
        webDriver10 = new ChromeDriver();
        webDriver10.get("https://demoqa.com/browser-windows");
        webDriver10.manage().window().maximize();

        WebElement newTab = webDriver10.findElement(new By.ByCssSelector("button[id='tabButton']"));
        newTab.click();

        List<String> neueTabs = new ArrayList<>(webDriver10.getWindowHandles());

        int tabAnzahl = neueTabs.size();
        System.out.println(tabAnzahl);

        webDriver10.switchTo().window(neueTabs.get(tabAnzahl-1));  // yeni taba gecmek icin kullanilir
        String neuerTabUrl = webDriver10.getCurrentUrl();// son sayfanin URL sini al
        System.out.println(neuerTabUrl);

        Thread.sleep(2000);
        webDriver10.close();  // o sayfayi kapatir .quit() deseydik driver i kapatirdi.

        System.out.println("Neuer Test startet gleich");


    }
    @Test
    public void test_2(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_1.exe");
        webDriver10 = new ChromeDriver();
        webDriver10.get("https://demoqa.com/browser-windows");
        webDriver10.manage().window().maximize();

        WebElement newWindow = webDriver10.findElement(By.id("windowButton"));
        newWindow.click();

        List<String> neueWindows = new ArrayList<>(webDriver10.getWindowHandles());
        int windowAnzahl = neueWindows.size();
        System.out.println(windowAnzahl);

        webDriver10.switchTo().window(neueWindows.get(windowAnzahl-1));
        String neuerWindowUrl = webDriver10.getCurrentUrl();
        System.out.println(neuerWindowUrl);

        System.out.println("Neuer Test startet gleich");


    }
//    @Test
//    public void test_3() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_1.exe");
//        webDriver10 = new ChromeDriver();
//        webDriver10.get("https://demoqa.com/browser-windows");
//        webDriver10.manage().window().maximize();
//
//        WebElement newWindowMessage = webDriver10.findElement(By.id("messageWindowButton"));
//        newWindowMessage.click();
//
//        List<String> neueMessageWindows = new ArrayList<>(webDriver10.getWindowHandles());
//        int messageWindowAnzahl = neueMessageWindows.size();
//        System.out.println(messageWindowAnzahl);
//
//        webDriver10.switchTo().window((neueMessageWindows.get(neueMessageWindows.size()-1)));
//        String neuesMessageWindow = webDriver10.getCurrentUrl();
//        System.out.println(neuesMessageWindow);
//
//    }


}
