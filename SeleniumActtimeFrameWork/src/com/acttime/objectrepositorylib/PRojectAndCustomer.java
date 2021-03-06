package com.acttime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PRojectAndCustomer {
	
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement createCustomerBtn;
	
	@FindBy(xpath="//span[text()='Create Project']")
	private WebElement createProjectBtn;
	
	@FindBy(xpath="//span[@class='successmsg']")
	private WebElement successMsg;
	
	public void clickOnCreateCustomerBtn() {
		createCustomerBtn.click();
	}

	public void clickOnCreateProjectBtn() {
		createProjectBtn.click();
	}
	
	
	public WebElement getSuccessMsg() {
		return successMsg;
	}
	
	

}
