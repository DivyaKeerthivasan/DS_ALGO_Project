package page_model;

import org.openqa.selenium.By;

import stepdefinitions.Common_Step_Def;

public class TreePageObjects {
	
	private static TreePageObjects treePageObjects;

	private TreePageObjects() {};

	public static TreePageObjects getInstance() {

		if(treePageObjects==null) {
			treePageObjects= new TreePageObjects();

		}
		return treePageObjects;

}
	
	
	
	String TreepgURL 			  = "https://dsportalapp.herokuapp.com/tree/";
	By overviewoftreelink 		  = By.xpath("//a[@href='overview-of-trees']");
	By terminologieslink 		  = By.xpath("//a[@href='terminologies']");
	By typesoftreeslink 		  = By.xpath("//a[@href='types-of-trees']");
	By treetraversalslink 		  = By.xpath("//a[@href='tree-traversals']");
	By traversalsillustrationlink = By.xpath("//a[@href='traversals-illustration']");
	By binarytreeslink 			  = By.xpath("//a[@href='binary-trees']");
	By typesofBinarytreeslink 	  = By.xpath("//a[@href='types-of-binary-trees']");
	By implementationinpythonlink = By.xpath("//a[@href='implementation-in-python']");
	By binarytreetraversalslink   = By.xpath("//a[@href='binary-tree-traversals']");
	By implementationofBinaryTreeslink =By.xpath("//a[@href='implementation-of-binary-trees']");
	By applicationsofBinaryTreeslink =By.xpath("//a[@href='applications-of-binary-trees']");
	By binarysearchtreeslink      = By.xpath("//a[@href='binary-search-trees']");
	By implementationofBstlink    = By.xpath("//a[@href='implementation-of-bst']");
	By practicequeslink           = By.xpath("//a[@href='/tree/practice']");
	By tryherelink                = By.xpath("//a[@href='/tryEditor']");
	By textbox 					  = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By runbtn                     = By.xpath("//button[text()='Run']");
	By output                     = By.xpath("//pre[@id='output']");
	By signoutbtn                 = By.xpath("//a[text()='Sign out']");
	
	
	public void  clickOverview() {
		Common_Step_Def.driver.findElement(overviewoftreelink).click();
	}
	public void clickterminologies() {
		Common_Step_Def.driver.findElement(terminologieslink).click();
	}
	public void typeoftrees() {
		Common_Step_Def.driver.findElement(typesoftreeslink).click();
	}
	public void traversalsillustration() {
		Common_Step_Def.driver.findElement(traversalsillustrationlink).click();
	}
	public void clicktreetraversals() {
		Common_Step_Def.driver.findElement(treetraversalslink).click();;
	}
	public void binarytrees() {
		Common_Step_Def.driver.findElement(binarytreeslink).click();
		
	}
	public void typesofBinarytrees() {
		Common_Step_Def.driver.findElement(typesofBinarytreeslink).click();
	}
	public void implementationinpython() {
		Common_Step_Def.driver.findElement(implementationinpythonlink).click();
		}
	public void binarytreetraversals() {
		Common_Step_Def.driver.findElement(binarytreetraversalslink).click();
	}
	public void implementationofBinaryTrees() {
		Common_Step_Def.driver.findElement(implementationofBinaryTreeslink).click();
	}
	public void applicationsofBinaryTrees() {
		Common_Step_Def.driver.findElement(applicationsofBinaryTreeslink).click();
		
	}
	public void binarysearchtrees() {
		Common_Step_Def.driver.findElement(binarysearchtreeslink).click();
		}
	public void implementationofBst() {
		Common_Step_Def.driver.findElement(implementationofBstlink).click();
	}
	public void practiceques() {
		Common_Step_Def.driver.findElement(practicequeslink).click();
	}
	public void tryHere() {
		Common_Step_Def.driver.findElement(tryherelink).click();
	}
	public void clickRun() {
		Common_Step_Def.driver.findElement(runbtn).click();
	}
	public void validCode(String code) throws InterruptedException {
		Common_Step_Def.driver.findElement(textbox).sendKeys(code);
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
