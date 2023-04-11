package tek.sdet.framework.config;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OperaBrowser implements Browser {

	@Override
	public WebDriver openBrowser(String url) {
		WebDriverManager.operadriver().setup();
		 
		WebDriver driver = operaDriver();
		driver.get(url);
		return driver;
	}

	private WebDriver operaDriver() {
		// TODO Auto-generated method stub
		return null;
	}
}


