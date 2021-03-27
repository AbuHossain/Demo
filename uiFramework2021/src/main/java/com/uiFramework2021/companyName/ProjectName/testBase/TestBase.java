package com.uiFramework2021.companyName.ProjectName.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.uiFramework2021.companyName.ProjectName.helper.browserConfiguration.BrowserType;
import com.uiFramework2021.companyName.ProjectName.helper.browserConfiguration.ChromeBrowser;
import com.uiFramework2021.companyName.ProjectName.helper.browserConfiguration.FirefoxBrowser;
import com.uiFramework2021.companyName.ProjectName.helper.browserConfiguration.IExploreBrowser;
import com.uiFramework2021.companyName.ProjectName.helper.browserConfiguration.config.ObjectReader;
import com.uiFramework2021.companyName.ProjectName.helper.browserConfiguration.config.PropertyReader;

public class TestBase {

	//public static ExtentReports extent;
	//public static ExtentTest test;
	public WebDriver driver;
	//private Logger log = LoggerHelper.getLogger(TestBase.class);
	//public static File reportDirectery;
	
	@BeforeSuite
	public void beforeSuite() throws Exception{
		//extent = ExtentManager.getInstance();
	}
	
	@BeforeTest
	public void beforeTest() throws Exception{
		ObjectReader.reader = new PropertyReader();
		//reportDirectery = new File(ResourceHelper.getResourcePath("src/main/resources/screenShots"));
		setUpDriver(ObjectReader.reader .getBrowserType());
		//test = extent.createTest(getClass().getSimpleName());
	}
	
	
	
	
	
	@AfterTest
	public void afterTest() throws Exception{
		if(driver!=null){
			driver.quit();
		}
	}
	
	public WebDriver getBrowserObject(BrowserType btype) throws Exception{
		
		try{
			switch(btype){
			case Chrome:
				// get object of ChromeBrowser class
				ChromeBrowser chrome = ChromeBrowser.class.newInstance();
				ChromeOptions option = chrome.getChromeOptions();
				return chrome.getChromeDriver(option);
			case Firefox:
				FirefoxBrowser firefox = FirefoxBrowser.class.newInstance();
				FirefoxOptions options = firefox.getFirefoxOptions();
				return firefox.getFirefoxDriver(options);
				
			case Iexplorer:
				IExploreBrowser ie = IExploreBrowser.class.newInstance();
				InternetExplorerOptions cap = ie.getIExplorerCapabilities();
				return ie.getIExplorerDriver(cap);
			default:
				throw new Exception("Driver not Found: "+btype.name());
			}
		}
		catch(Exception e){
			//log.info(e.getMessage());
			throw e;
		}
	}
	
	public void setUpDriver(BrowserType btype) throws Exception{
		driver = getBrowserObject(btype);
		//log.info("Initialize Web driver: "+driver.hashCode());
		//WaitHelper wait = new WaitHelper(driver);
		//wait.setImplicitWait(ObjectReader.reader.getImpliciteWait(), TimeUnit.SECONDS);
		//wait.pageLoadTime(ObjectReader.reader.getPageLoadTime(), TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	
	
	
	
	public void getApplicationUrl(String url){
		driver.get(url);
		//logExtentReport("navigating to ..."+url);
	}
	
	
	}
	
	

