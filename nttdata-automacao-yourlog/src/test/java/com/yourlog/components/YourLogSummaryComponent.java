package com.yourlog.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.yourlog.action.YourLogSummaryAction;

public class YourLogSummaryComponent extends YourLogSummaryAction{
	
	public YourLogSummaryComponent(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//span[@id='total_price']")
	public WebElement valor_summary;

}
