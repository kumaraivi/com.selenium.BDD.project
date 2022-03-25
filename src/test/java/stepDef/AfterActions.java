package stepDef;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.SeleniumDriver;
import utils.SeleniumHelper;

public class AfterActions {
	
	
	
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException
	{
		
		if(scenario.isFailed())
		{
		//screenshot
		File sourcePath= 	((TakesScreenshot)SeleniumDriver.getDriver()).getScreenshotAs(OutputType.FILE);
		byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
		scenario.attach(fileContent, "image/png", "image");
		
		}
		
	}

}
