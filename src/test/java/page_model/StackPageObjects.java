package page_model;

import org.openqa.selenium.By;

import constants.Constants;
import stepdefinitions.Common_Step_Def;

public class StackPageObjects {

	private static StackPageObjects stackPageObjects;

	private StackPageObjects() {};

	public static StackPageObjects getInstance() {

		if(stackPageObjects==null) {
			stackPageObjects= new StackPageObjects();
		}
		return stackPageObjects;

	}

	By usernameTextbox 	= By.xpath("//input[@name='username']");
	By passwordTextbox 	= By.xpath("//input[@name='password']");
	By loginbtn 		= By.xpath("//input[@value='Login']");

	By stackGetstarted 	= By.xpath("//a[@href='stack']");
	By operationsLink  	= By.xpath("//a[@href='operations-in-stack']");
	By implementLink  	= By.xpath("//a[@href='implementation']");
	By applicationsLink = By.xpath("//a[@href='stack-applications']");
	By practiceLink 	= By.xpath("//a[text()='Practice Questions']");
	By tryherelink 		= By.xpath("//a[@href='/tryEditor']");
	By textbox 			= By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By runbtn 			= By.xpath("//button[text()='Run']");
	By output 			= By.xpath("//pre[@id='output']");
	By signoutbtn 		= By.xpath("//a[text()='Sign out']");

	public  void enterUsername () {
		
		Common_Step_Def.driver.findElement(usernameTextbox).sendKeys(Constants.USERNAME);

	}
	
	public  void enterPassword () {
		Common_Step_Def.driver.findElement(passwordTextbox).sendKeys(Constants.PASSWORD);

	}
	
	public  void clickLogin() {
		Common_Step_Def.driver.findElement(loginbtn).click();
	}
	
	public void stackGetStart() {
		Common_Step_Def.driver.findElement(stackGetstarted).click();
	}
	public void clickstackOperations() throws InterruptedException {

		Common_Step_Def.driver.findElement(operationsLink).click();
	}
	
	public void clickstackImplementation() throws InterruptedException {

		Common_Step_Def.driver.findElement(implementLink).click();
	}
	
	public void clickstackapplication() throws InterruptedException {

		Common_Step_Def.driver.findElement(applicationsLink).click();
	}
	public void tryhere() throws InterruptedException {

		Common_Step_Def.driver.findElement(tryherelink).click();
	}
	public void practiceQuestions() throws InterruptedException {

		Common_Step_Def.driver.findElement(practiceLink).click();
	}
	public void validCode(String code) throws InterruptedException {
		Common_Step_Def.driver.findElement(textbox).sendKeys(code);
	}
	public void runBtn() throws InterruptedException {
		Common_Step_Def.driver.findElement(runbtn).click();

	}
	public String getOutput() {
		return Common_Step_Def.driver.findElement(output).getText();
	}
	public void invalidCode(String invalidCode) throws InterruptedException {

		Common_Step_Def.driver.findElement(textbox).sendKeys(invalidCode);
	}
	public void signOut() {
		Common_Step_Def.driver.findElement(signoutbtn).click();
	}
}
