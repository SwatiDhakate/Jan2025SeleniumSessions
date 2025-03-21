package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVSClose {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		//enter url
		driver.get("https://www.google.com");
		
		//get title
		String title = driver.getTitle();
		System.out.println(title);
		
		//validation checks : act vs exp
		if(title.equals("google"))
		{
			System.out.println("Its correct title: Pass");
		}
		else
		{
			System.out.println("Its incorrect title : Fail");
		}
		
		//driver.quit(); //quit browser
		driver.close();//closing browser
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());//NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()? - for quit()
		
		//NoSuchSessionException: invalid session id - for close() - same sessionID will come but this is expired or invalid sessionID
	}

}
