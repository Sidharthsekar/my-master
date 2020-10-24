package powerbank;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.sql.*;
import javax.imageio.ImageIO;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class ProjectLaunch {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\IT Related\\Softwares & Plugins\\chromedriver v85.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		//Select()
		Thread.sleep(2000);
		By cd = By.xpath("//*[@class='_2AkmmA _29YdH8']");
		WebElement as = driver.findElement(cd);
		
		//wait
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,12);
		//wait.until(ExpectedConditions)
		/*Wait<WebDriver> xx = new 		
				Select c = new Select (driver.findElement(cd));
			*/	
		//By c = By.className("_2zrpKA _1dBPDZ");
		//By c = By.xpath("//*[@class='_2AkmmA _29YdH8']");
		
		//WebElement loginname = driver.findElement(c);
		/*
		
		By cd = By.xpath("//*[@class='_2AkmmA _29YdH8']");
		int x = driver.findElement(cd).getLocation().getX();

		int y = driver.findElement(cd).getLocation().getY();
		driver.findElement(cd).click();
		System.out.print(x+"-"+y);
		Thread.sleep(3000);
		Robot robo= new Robot();
		//robo.keyPress(KeyEvent.VK_9);
		//robo.keyRelease(KeyEvent.VK_9);
		robo.mouseMove(x, y+100);
		robo.delay(3000);
		robo.mouseWheel(200);
		//robo.mousePress(buttons);
		*/
		/*List<String> lists = new LinkedList<String>();
		
		//lists.
		
		Iterator<String> itr = lists.iterator();
		
		for(String dfx : lists) {
			
		}
		lists.add("asd");
		lists
		
		for(String dfx : lists) {
			System.out.println(dfx);
		}*/
		
		
		Map<Integer, String> q = new HashMap<Integer,String>();
		q.put(1, "aaa");
		q.put(2, "bbb");
		q.put(3, "ccc");
		
		System.out.println(q.get(1));
		
		/*for(Map.entrySet
		}
		}*/
		
	/*
	Screenshot x = new AShot().takeScreeshot(driver,a);
	ImageIO.write(x, "PNG", new File("c:/"));
	
	
	TakesScreenshot xs = ((TakesScreenshot)driver);
	File src = xs.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("c:/"));
	
		*/
		
		
		
		
			
			
			
		
		
		
	}
}
