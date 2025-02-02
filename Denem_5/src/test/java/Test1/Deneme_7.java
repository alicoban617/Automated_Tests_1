package Test1;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.client.methods.HttpUriRequest;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;


public class Deneme_7 {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_1.exe");
        WebDriver webDriver7 = new ChromeDriver();
        webDriver7.get("https://demoqa.com/broken");
        webDriver7.manage().window().maximize();


//        HttpClient client = HttpClientBuilder.create().build();
//        HttpGet request = new HttpGet("https://demoqa.com/");  // saglam link
//        HttpResponse response = client.execute(request);
//        int SCode = response.getStatusLine().getStatusCode();
//        System.out.println(SCode);
//
//        HttpClient client2 = HttpClientBuilder.create().build();
//        HttpGet request2 = new HttpGet("http://the-internet.herokuapp.com/status_codes/500"); //Broken link
//        HttpResponse response2 = client2.execute(request2);
//        int SCode2 = response2.getStatusLine().getStatusCode();
//        System.out.println(SCode2);

        WebElement brokenImage = webDriver7.findElement(By.xpath("//div/img[2]"));
        String src2 = brokenImage.getAttribute("src");
        System.out.println(src2);

        HttpClient client3 = HttpClientBuilder.create().build();
        HttpGet request3 = new HttpGet(src2);
        HttpResponse response3 = client3.execute(request3);
        int SCode3 = response3.getStatusLine().getStatusCode();
        System.out.println(SCode3);  // 200 calisiyor 500 calismiyor demek.

    }
}
