import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IlkClass {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");



        System.out.println("Chromu kapattiktan sonra bu satir calisiyor");
        
       // Bu satiri github uzerinden ekledim :) 


    }
}
