package seleniumassignments;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(option);

		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//1. Launch the URL https://www.ajio.com/
			//2. In the search box, type as "bags" and press enter
			//3. To the left  of the screen under " Gender" click the "Men"
			//4. Under "Category" click "Fashion Bags"
		//5. Print the count of the items Found. 
			//6. Get the list of brand of the products displayed in the page and print the list.
			//7. Get the list of names of the bags and print it
		
             driver.findElement(By.xpath(("//input[@autocomplete='off']"))).sendKeys("Bags",Keys.ENTER);
             driver.findElement(By.xpath("//label[@for='Men']")).click();
            // driver.findElement(By.xpath("//div[text()='MORE']")).click();
             Thread.sleep(3000);
            // driver.findElement(By.xpath("//div[text()='f']")).click();
           //Thread.sleep(3000);
            // driver.findElement(By.xpath("//div[text()='fashion bags (542)']")).click();
             driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
             Thread.sleep(3000);
             String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
             System.out.println(text);
           //  Thread.sleep(3000);
             //String text2 = driver.findElement(By.xpath("//img[@class='rilrtl-lazy-img  rilrtl-lazy-img-loaded']")).getText();
             Thread.sleep(3000);
             System.out.println("LIST OF BRANDS");
             List<WebElement> text2= driver.findElements(By.xpath("//div[@class='brand']"));
             for (WebElement string1 : text2) {
            	 String text12 = string1.getText();
            	 System.out.println(text12);
            	 
            	 Thread.sleep(2000);
            	 System.out.println("LIST OF BAG NAMES");
				
             List<WebElement> text1= driver.findElements(By.xpath("//div[@class='nameCls']"));
             for (WebElement string : text1) {
            	 String text11 = string.getText();
            	 System.out.println(text11);
				
			}
             
     		
             
	}

	}}


