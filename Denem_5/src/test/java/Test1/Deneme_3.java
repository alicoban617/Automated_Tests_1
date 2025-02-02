package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Deneme_3 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_1.exe");

        WebDriver wdriver3 = new ChromeDriver();
        wdriver3.get("https://demoqa.com/automation-practice-form");
        wdriver3.manage().window().maximize();


        WebElement sportsCB = wdriver3.findElement(By.id("hobbies-checkbox-1"));
        WebElement sportsSports = wdriver3.findElement(By.xpath("//div/label[@for='hobbies-checkbox-1']"));
        boolean isenabled_sportsCB = sportsCB.isEnabled();
        System.out.println(isenabled_sportsCB);

        try{
            sportsCB.click();
        }catch(ElementClickInterceptedException e){
            sportsSports.click();
        }
    }



}
