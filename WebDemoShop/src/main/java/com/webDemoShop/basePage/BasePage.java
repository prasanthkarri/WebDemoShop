package com.webDemoShop.basePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.webDemoShop.landing.LandingPage;

public class BasePage {
	private Properties prop;
	private WebDriver driver;
	String projectPath = System.getProperty("user.dir");

	public BasePage() {
		try {
			prop = new Properties();
			String configFilePath = projectPath + "\\config\\config.properties";
			System.out.println("config file path "+configFilePath);
			FileInputStream fis = new FileInputStream(configFilePath);
			
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public WebDriver intilizeDriver() {
		if (prop.getProperty("browser").equals("chrome")) {

			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equals("firefox")) {

			driver = new FirefoxDriver();
		} else if (prop.getProperty("browser").equals("internetExplorer")) {

			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public LandingPage enterURL() {
		String testEnv = prop.getProperty("testEnv"); 
		driver.get(prop.getProperty("url_"+testEnv));
		LandingPage landingpage = new LandingPage(driver);
		return landingpage;
		
	}

	public void closeBrowser() {
		driver.quit();
		
	}

}
