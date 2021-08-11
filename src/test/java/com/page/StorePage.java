package com.page;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.PageFactory;
	import org.junit.Assert;

	public class StorePage {
		private WebDriver Driver;
		
	public StorePage(WebDriver driver)	{
			PageFactory.initElements(driver,this) ;
			
			
	  }
			@FindBy(how = How.XPATH,using = "//*[@class=\"login\"]")
		    private static 	WebElement signin;
			
		    @FindBy(how = How.XPATH,using = "//*[@id=\"email\"]")
		    private static 	WebElement Emailaddress;
		    
		    @FindBy(how = How.XPATH,using = "//*[@type=\"password\"]")
		    private static 	WebElement password;
		    
		    @FindBy(how = How.XPATH,using= "//*[contains(@class,'icon-lock left')]")
		    private static 	WebElement signingBtn;
		    
		    @FindBy(how = How.XPATH,using="(//*[@title='Dresses'])[2]")  
			private static WebElement DressesBtn;
		    
		    @FindBy(how = How.XPATH,using="//*[@id='history']")
		    private static 	WebElement welcomeword;
		    
		   // @FindBy(how = How.XPATH,using="//*[@id='my-account']")
		    //private static 	WebElement Dresses;
			
		    @FindBy(how = How.XPATH,using="(//*[@title='Dresses'])[2]")   
			private static WebElement dressesBtn;
		    
		    
		    @FindBy (how = How.XPATH, using= ("//*[@class='product-desc']/following-sibling::div[1]")) /*(actualTitle));*/
		    private static WebElement price5;
		 	
		    
		    
		public void	clickOnSigninButton() {
				signin.click();
			}		
			
		public void	enterEmailaddressAndPassword()	{	
		Emailaddress.sendKeys("khanbd87400@gmail.com");
		password.sendKeys("722171176");
		}	
			
		public void	 clickOnLoginButton() {
		 signingBtn.click();	
			
		}		
		
		public void clickUpperleftcornerDresses() {
			dressesBtn.click();     
		}	
			
			
		public void nevigatetohomepage() {
		
			
		}

		public void verifythepagetitle() {
			String expectedTitle = "My account - My Store";
			String actualTitle = Driver.getTitle().trim();
			Assert.assertTrue("Page title does not match", actualTitle.equals(expectedTitle));
		}		
		}

