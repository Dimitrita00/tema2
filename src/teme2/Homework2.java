package teme2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Homework2 {
	
	public static void main(String[] args) {
	
		//Class Name Locator 
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.get("https://www.amazon.com//");
		driverChrome.manage().window().maximize();
		driverChrome.findElement(By.className("nav-a")).click();
		
		
		//	//Name Locator- nu gasesc
		//	ChromeDriver driverChrome = new ChromeDriver();
		//  driverChrome.get("https://www.aliexpress.us/");
		//	driverChrome.manage().window().maximize();
		//	driverChrome.findElement(By.name("search--keyword--15P08Ji")).sendKeys("love");
		
			
		//Link text Locator (textul care se afiseaza pe pagina -ca link)
		driverChrome = new ChromeDriver();
		driverChrome.get("https://www.ebay.com/");
		driverChrome.manage().window().maximize();
		driverChrome.findElement(By.linkText("See all")).click();
			
		driverChrome.get("https://www.ebay.com/");
		driverChrome.findElement(By.linkText("Registration")).click();
			
		driverChrome.get("https://www.ebay.com/");
		driverChrome.findElement(By.linkText("Facebook")).click();	
		
			
		//Partial Link text Locator()
		driverChrome = new ChromeDriver();
		driverChrome.get("https://maximum.md/ro/");				
		driverChrome.manage().window().maximize();
		driverChrome.findElement(By.partialLinkText("Livrarea pe")).click();
		
		driverChrome.get("https://maximum.md/ro/");				
		driverChrome.findElement(By.partialLinkText("Credit")).click();
			
		driverChrome.get("https://maximum.md/ro/");				
		driverChrome.findElement(By.partialLinkText("Reparații")).click();
		
		driverChrome.get("https://maximum.md/ro/");				
		driverChrome.findElement(By.partialLinkText("Regulamentul")).click();
			
		driverChrome.get("https://maximum.md/ro/");				
		driverChrome.findElement(By.partialLinkText("Cartele cadou")).click();
			
			
		//Tag-name Locator()
		driverChrome = new ChromeDriver();
		driverChrome.get("https://www.emag.ro/");				
		driverChrome.manage().window().maximize();
	    driverChrome.findElement(By.tagName("a")).click();
		
		driverChrome.get("https://www.emag.ro/");	
		driverChrome.findElement(By.tagName("ul")).click();
			
		driverChrome.get("https://www.emag.ro/");	
		driverChrome.findElement(By.id("my_account")).click();
			
		driverChrome.get("https://www.emag.ro/");	
		driverChrome.findElement(By.id("searchboxTrigger")).sendKeys("adidasi");
	}
}
