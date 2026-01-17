package ASwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		//choose the Browser
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		//EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		//Get the URL
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		//Enter The Username
		driver.findElement(By.xpath("//input[@data-test='username']")).sendKeys("standard_user");
		Thread.sleep(2000);
		// I will check the Enter the valid and Unvalid Username
		
		//Enter The Password
		driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		// I will check the Enter the valid and invalid password
		
		//click on the Login Button
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
		Thread.sleep(2000);
		
		//click on the add to cart
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		Thread.sleep(2000);
		
		//click on the shopping cart
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		Thread.sleep(2000);
		
		//click on the checkout Button
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		Thread.sleep(2000);
		
		//Enter the first name 
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Nikhil");
		Thread.sleep(2000);
		
		//Enter the last name
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Survase");
		Thread.sleep(2000);
		
		//Enter the postal code
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("411007");
		Thread.sleep(2000);
		
		//click on the continue button
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(2000);
		
		//Close the driver
		driver.close();
		
		
	}

}