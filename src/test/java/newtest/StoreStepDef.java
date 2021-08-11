package newtest;

import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
	import com.page.StorePage;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;//
	import org.junit.Assert;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;


	public class StoreStepDef {
		
		WebDriver driver;
		StorePage codingpage;  

		@Given("^user go to your logo homepage$")
		public void user_go_to_your_logo_homepage() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
				driver.get("http://automationpractice.com/index.php");
				driver.manage().window().maximize();
			
				 codingpage =new StorePage(driver);
		
		
		}
		

		@Given("^click on the Sign in button$")
		public void click_on_the_Sign_in_button() throws Throwable {
		  
			 //StorePage =new  StorePage (driver);
			codingpage.clickOnSigninButton();
		}

		@When("^user enter valid Email address and password$")
		public void user_enter_valid_Email_address_and_password() throws Throwable {
			codingpage.enterEmailaddressAndPassword();
		
		}

		@When("^user click on the Sign in button$")
		public void user_click_on_the_Sign_in_button() throws Throwable {
			codingpage.clickOnLoginButton();
		
		}

		@Then("^user nevigate to home page$")
		public void user_nevigate_to_home_page() throws Throwable {
			//codingpage.nevigatetohomepage();
		
		}

		@Then("^user verify the page title as \"([^\"]*)\"$")
		public void user_verify_the_page_title_as(String title) throws Throwable {
			 
				String expected = title ;
				String actual = driver.getTitle().trim();
				Assert.assertTrue("Title does not match", actual.contains(expected));
			
		    
		}
			@Then("^user click on the upper left corner Dresses$")
			public void user_click_on_the_upper_left_corner_Dresses() throws Throwable {
				codingpage.clickUpperleftcornerDresses();   //------------------5
		
		}
			@Then("^price print value deceding sorted order$")
			public void price_print_value_deceding_sorted_order() throws Throwable {

					List<WebElement> AllPrices = driver.findElements(By.xpath("//*[@class='product-desc']/following-sibling::div[1]")); /*(actualTitle));*/
				    ArrayList<String> NewList = new ArrayList<String>();
				       
						    for (int i = 0; i < AllPrices.size(); i++) {
				            NewList.add(AllPrices.get(i).getText().toString());
				            }
						 
						//sorting ArrayList in descending order;
						Collections.sort(NewList, Collections.reverseOrder());
				    System.out.println("List of the prices in sorted order: " + NewList);
						
				    String SecondPrice = NewList.get(1);
						System.out.println("Price of second dress: " + SecondPrice);
						
						driver.findElement(By.xpath("(//*[contains(text(),'" + SecondPrice + "')])[2] ")).click();
						//Thread.sleep(3000);
						//driver.findElement(By.xpath("(//*[contains(text(),'Proceed to checkout')])")).click();

						driver.findElement(By.xpath("(//*[@id='category'])")).click();
						
						
						Double expected = Double.parseDouble(SecondPrice.replace("$", "")) + 2;
						System.out.println("The Expected price is: " + expected);
						
						driver.findElement(By.xpath("//*[@class='logout']")).click();
						
					 
					 
					 driver.quit();
						 
				}    
			    


		@Then("^select Hightest first$")
		public void select_Hightest_first() throws Throwable {
		  
		
		}

		@Then("^user select the second dress from the list$")
		public void user_select_the_second_dress_from_the_list() throws Throwable {
		  
		
		}

		@Then("^user click on Add to cart$")
		public void user_click_on_Add_to_cart() throws Throwable {
		  
		
		}

		@Then("^user verify Total price with shipping is there$")
		public void user_verify_Total_price_with_shipping_is_there() throws Throwable {
		  
		
		}

		@Then("^user sign out$")
		public void user_sign_out() throws Throwable {
		  
		
		}

		@Then("^user close the browser$")
		public void user_close_the_browser() throws Throwable {
		  
		
		}


	}

