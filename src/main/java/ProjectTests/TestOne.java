package ProjectTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOne {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","E:/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        Thread.sleep(3000);
        driver.close();

    }
}
