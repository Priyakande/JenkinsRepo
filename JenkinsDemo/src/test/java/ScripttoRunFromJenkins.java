import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScripttoRunFromJenkins {
 @Test
	public void jenkinsDemo() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize(); //maximzeeeee window	s
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		}
	
}
