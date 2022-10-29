package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath); //Agregando la propiedad con la ruta del chrome driver
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

}
