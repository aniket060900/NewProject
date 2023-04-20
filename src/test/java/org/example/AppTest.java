package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class AppTest{
    ChromeDriver driver = new ChromeDriver();
    @BeforeClass
    void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver.get("https://mail.google.com");
        driver.manage().window().maximize();
    }
    @Test
    public void googleTest() throws InterruptedException
    {
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("aniketkar96@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
        Thread.sleep(1000);

    }
    @AfterClass
    void close()
    {
        driver.close();
    }

}
