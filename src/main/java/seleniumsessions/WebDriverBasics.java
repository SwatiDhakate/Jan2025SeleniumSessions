package seleniumsessions;

import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverBasics {
	public static void main(String[] args) {
	
	//open chrome browser
	//ChromeDriver driver = new ChromeDriver();
	
	//FirefoxDriver driver = new FirefoxDriver();
	
	EdgeDriver driver = new EdgeDriver();
	//enter url
	driver.get("https://www.google.com");	
	//get the title
	String title = driver.getTitle();
	System.out.println(title);
	
	//act vs exp : validation/ checkpoint
	if(title.equals("Google"))
	{
		System.out.println("Correct title : passed");
	}
	else
	{
		System.out.println("Incorrect title : Fail");
	}
	
	//automation steps + validation point = automation testing
	
	//Close browser
	driver.quit();
	
	}

}
