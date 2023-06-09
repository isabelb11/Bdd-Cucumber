package tek.sdet.framework.steps;

import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailSteps extends CommonUtility {
	
	private POMFactory factory = new POMFactory();
	
	@Given("User is on retail website")
    public void userIsOnRetailWebsite() {
        String actualTitle = getTitle();
        String expectedTitle = "React App";
        Assert.assertEquals(actualTitle, expectedTitle);
        Assert.assertTrue(isElementDisplayed(factory.homePage().tekSchoolLogo));
        logger.info("user is on retail website");
        logger.info("Actual Title " + actualTitle + " Equals " + " ExpectedTitle " + expectedTitle);

    }
    
	@When("User search for {string} product")
    public void userSearchForProduct(String productValue) {
        sendText(factory.homePage().searchBar, productValue);
        click(factory.homePage().searchButton);
        logger.info("user searched for product "+ productValue );
    	
    }
    
	@Then("The product should be displayed")
    public void theProductShouldBeDisplayed() {
        Assert.assertTrue(isElementDisplayed(factory.homePage().pokemanProductImage));
        logger.info("the Product is displayed on home page");

    
}
}

/*@Given("User is on retail website")
public void userIsOnRetailWebsite() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("User search for {string} product")
public void userSearchForProduct(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("The product should be displayed")
public void theProductShouldBeDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


	*/
