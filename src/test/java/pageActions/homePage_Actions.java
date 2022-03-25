package pageActions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageLocators.homePage_Locators;

public class homePage_Actions {
	public static WebDriver driver;
	homePage_Locators hL = new homePage_Locators();
	
	public void enterText(String text) {
		hL.searchTextBox.sendKeys(text, Keys.TAB);
	}
	
	public void enterText() {
		hL.searchTextBox.sendKeys("gmail",Keys.TAB);
	}
	
	public void clickOnSearchButton() {
		hL.searchButton.click();
	}
	
	public void clickOnGmailHomeLink() {
		hL.gmailHome.click();
	}


}
