package WebPage_Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WebPage_Identifier.Identifier;

public class Element {
	private WebDriver driver = null;
	 public Element(WebDriver driver){
	        this.driver = driver;	        
	        PageFactory.initElements(driver,this);
	    }
	    
	@FindBy(xpath = Identifier.Course_with_Payment)
    private WebElement Selecting_Course;
	
	@FindBy(xpath = Identifier.Course_View)
    private WebElement View_Course;
	
	@FindBy(xpath = Identifier.Course_already_enrolled)
    private WebElement Course_Enrolled_already;
	
	@FindBy(xpath = Identifier.Course_Booking)
    private WebElement Bokking_Course;
	
	@FindBy(xpath = Identifier.Make_Course_Payament)
    private WebElement Make_Payament;
	
	@FindBy(xpath = Identifier.Phonenumber)
    private WebElement Pass_Phonenumber;
	
	@FindBy(xpath = Identifier.Email)
    private WebElement Pass_Email;
	
	@FindBy(xpath = Identifier.Proceed)
    private WebElement Click_Proceed;
	
	@FindBy(xpath = Identifier.QR_Scan)
    private WebElement Click_QR_Scan;
	
}
