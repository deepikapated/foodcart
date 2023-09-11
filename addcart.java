package foodcenter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class addcart {

	public static void main(String[] args) 
 {
		// TODO Auto-generated method stubik 
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://goodtaste.fleksa.de/en");
		driver.findElement(By.xpath("//a[@class=\"heroindexpagestemplateOnecomponents__OrderButton-sc-hpo36g-4 jUzsuK\"]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element=driver.findElement(By.xpath("/html/body/div/div[1]/main/div[4]/div/div[2]/ul/li[1]/ul/li[1]/div/div/div[2]/div/button"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        


        driver.findElement(By.xpath("/html/body/div/div[1]/main/div[4]/div/div[2]/ul/li[1]/ul/li[1]/div[2]/button")).click();
        driver.close();

 }

}
