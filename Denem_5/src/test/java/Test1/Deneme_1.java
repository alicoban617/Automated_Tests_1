package Test1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Deneme_1 {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver_1.exe" );

        WebDriver wDriver = new ChromeDriver(); // wDriver ile siteyi cagiriyoruz

        //wDriver.get("https://demoqa.com/text-box");
        // wDriver.manage().window().maximize();

        wDriver.get("https://tierarztpraxis-weimbs.de/kontakt/");
        wDriver.manage().window().maximize();

        WebElement nameWeimbs = wDriver.findElement(By.id("name"));
        nameWeimbs.click();
        nameWeimbs.sendKeys("Möp Köp");

        WebElement emailWeimbs = wDriver.findElement(By.id("email"));
        emailWeimbs.click();
        emailWeimbs.sendKeys("Möp@Köp.Pöp");

        WebElement nachrichtWeimbs = wDriver.findElement(By.id("nachricht"));
        nachrichtWeimbs.click();
        nachrichtWeimbs.sendKeys("Ich liebe dich Hayatim");

        WebElement leistungWeimbs = wDriver.findElement(By.xpath("//div/select/option[@value='Sofortlabor']"));
        leistungWeimbs.click();



        //WebElement nameElement = wDriver.findElement(By.id("userName")); //nameElement ile userName id li yeri cagiriyoruz
        // nameElement.click();
        //nameElement.sendKeys("Möp Köp");

        //WebElement email = wDriver.findElement(new By.ByCssSelector("input.mr-sm-2[placeholder='name@example.com']"));
        //email.click();
        //email.sendKeys("Moep@Koep.com");

        //WebElement textArea1 = wDriver.findElement(By.id("currentAddress"));
        //textArea1.click();
        //textArea1.sendKeys("Ich hab einen Möp. Der ist Köp. Er braucht Pöp.");

        // WebElement textArea2 = wDriver.findElement(By.id("permanentAddress"));
        //textArea2.click();
        // textArea2.sendKeys("Ich wohne in Ankara. Yaz beni aq");

        // WebElement button1 = wDriver.findElement(By.id("submit"));
        //button1.click();

        // WebElement nameText = wDriver.findElement(By.xpath("//div/p[@id='name']"));
        // String name = nameText.getText();
        //System.out.println(name);

        // WebElement emailText = wDriver.findElement(By.xpath("//div/p[@id='email']"));
        //String emailT = emailText.getText();
        //System.out.println(emailT);





    }


}
