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
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.nio.file.Files;

public class Deneme_8 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_1.exe");
        WebDriver webdriver8 = new ChromeDriver();
        webdriver8.get("https://demoqa.com/upload-download");
        webdriver8.manage().window().maximize();

        WebElement downloadButton = webdriver8.findElement(By.id("downloadButton"));
        downloadButton.click();
        Thread.sleep(5000);  // adam bunu 14. video da yapti ve hatasini debug yaparak anladi

        String pfad = "C:\\Users\\ali-c\\Downloads";
        String fileName = "sampleFile.jpeg";
        OrdnerFinder(pfad,fileName );
        boolean ergebnis_download = OrdnerFinder(pfad,fileName);

        System.out.println(ergebnis_download);


    }
   static boolean OrdnerFinder(String ordnerPfad, String ordnerName){

        File fileReferenz1 = new File(ordnerPfad);
        File[] alleOrdner = fileReferenz1.listFiles();

        for(int i = 0; i<alleOrdner.length; i++){
        if(alleOrdner[i].getName().equals(ordnerName)){
            return true;
        }

        }

        return false;

    }

}
