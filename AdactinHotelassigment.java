import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinHotelassigment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DRS\\eclipse-workspace2\\SeleniumPractice\\chromedriver.exe");
		WebDriver a = new ChromeDriver(); 
		a.manage().window().maximize();
		a.get("http://adactinhotelapp.com/HotelAppBuild2/");
		a.findElement(By.xpath("//input[@id='username']")).sendKeys("ravisastry");
		Thread.sleep(2000);
		a.findElement(By.xpath("//input[@type='password']")).sendKeys("7680017005");
		Thread.sleep(2000);
		a.findElement(By.xpath("//input[@type='Submit']")).click();
		Thread.sleep(2000);
		
		WebElement drop = a.findElement(By.xpath("//select[@id='location']"));
		
		Select s = new Select(drop);
		s.selectByIndex(6);
		Thread.sleep(1000);
		
		WebElement drop2 = a.findElement(By.xpath("//select[@id='hotels']"));
		Select s1 = new Select(drop2);
		s1.selectByIndex(2);
		Thread.sleep(1000);
		
		WebElement drop3 = a.findElement(By.xpath("//select[@name='room_type']"));
		Select s2 = new Select(drop3);
		s2.selectByIndex(2);
		Thread.sleep(1000);
		
		WebElement drop4 = a.findElement(By.xpath("//select[@id='room_nos']"));
		Select s3 = new Select(drop4);
		s3.selectByValue("2");
		Thread.sleep(1000);
		
		WebElement drop5 = a.findElement(By.xpath("//select[@name='adult_room']"));
		Select s4 = new Select(drop5);
		s4.selectByValue("3");
		Thread.sleep(1000);
		
		WebElement drop6 = a.findElement(By.xpath("//select[@name='child_room']"));
		Select s5 = new Select(drop6);
		s5.selectByValue("2");
		Thread.sleep(1000);
		
		a.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		
		a.findElement(By.xpath("//input[@type='radio']")).click();
		Thread.sleep(1000);
		
		a.findElement(By.xpath("//input[@value='Continue']")).click();
		Thread.sleep(1000);
		
		a.findElement(By.xpath("//input[@name='first_name']")).sendKeys("ravi");
		Thread.sleep(1000);
		
		a.findElement(By.xpath("//input[@name='last_name']")).sendKeys("sastry");
		Thread.sleep(1000);
		
		a.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Vizag"); // Address
		Thread.sleep(1000);
		
		a.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("4561789403219637"); //entering credit card number
		Thread.sleep(1000);
		
		WebElement drop7 = a.findElement(By.xpath("//select[@id='cc_type']")); //Credit card selection
		Select s6 = new Select(drop7);
		s6.selectByIndex(2);
		Thread.sleep(1000);
		
		WebElement drop8 = a.findElement(By.xpath("//select[@name='cc_exp_month']")); //Selecting month
		Select s7 = new Select(drop8);
		s7.selectByIndex(2);
		Thread.sleep(1000);
		
		WebElement drop9 = a.findElement(By.xpath("//select[@name='cc_exp_year']")); //Selecting year
		Select s8 = new Select(drop9);
		s8.selectByIndex(2);
		Thread.sleep(1000);
		
		a.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("111"); //entering CVV number
		
		a.findElement(By.xpath("//input[@name='book_now']")).click();
		Thread.sleep(1000);
		
		a.findElement(By.xpath("//input[@value='My Itinerary']")).click();
		Thread.sleep(1000);
		
		a.quit();
	
	}

}
