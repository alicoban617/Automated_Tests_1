package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deneme_9 {
    public static void main(String[] args) {

        //upload nasil yapilir onun örnegi bu
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_1.exe");
        WebDriver webDriver9 = new ChromeDriver();
        webDriver9.get("https://demoqa.com/upload-download");
        webDriver9.manage().window().maximize();


        WebElement uploadButton = webDriver9.findElement(new By.ByCssSelector("input[id='uploadFile']"));
        String uploadPath = "C:\\Users\\ali-c\\Downloads\\sampleFile.jpeg";
        uploadButton.sendKeys(uploadPath);
    }
}
