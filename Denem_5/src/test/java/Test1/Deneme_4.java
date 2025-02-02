package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.text.Element;

public class Deneme_4 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_1.exe");
        WebDriver webDriver4 = new ChromeDriver();

        webDriver4.get("https://demoqa.com/radio-button");
        webDriver4.manage().window().maximize();

        boolean yesRadioButtonisEnabled;
        yesRadioButtonisEnabled = webDriver4.findElement(new By.ByCssSelector("input[id='yesRadio']")).isEnabled();

        if(yesRadioButtonisEnabled){
            try{
                WebElement yesRB = webDriver4.findElement(new By.ByCssSelector("input[id='yesRadio']"));
                yesRB.click();
            }catch (ElementClickInterceptedException e){
                WebElement yesLabel = webDriver4.findElement(new By.ByCssSelector("label[for='yesRadio']"));
                yesLabel.click();
                System.out.println("Catch-Befehlt läuft");
                boolean yesRadioButtonisSelected = webDriver4.findElement(new By.ByCssSelector("input[id='yesRadio']")).isSelected();
                if(yesRadioButtonisSelected){
                    System.out.println("Radio Button is selected");
                    WebElement textRB = webDriver4.findElement(new By.ByCssSelector("p[class='mt-3']"));
                    String text = textRB.getText();
                    System.out.println(text);
                }
            }
        }
        else{
            System.out.println("yesRadioButton ist nicht aktiv");
        }

        WebElement noRB = webDriver4.findElement(By.xpath("//div/input[@id='noRadio']"));
        boolean noRadioButtonisenabled = noRB.isEnabled();
        System.out.println(noRadioButtonisenabled);






    }
}
