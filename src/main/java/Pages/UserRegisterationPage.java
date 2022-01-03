package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegisterationPage extends PageBase {

	//page constructor
	public UserRegisterationPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="gender-male")
	WebElement gender_male; 

	@FindBy(id="gender-female")
	WebElement gender_female; 

	@FindBy(id="FirstName")
	WebElement firstName; 

	@FindBy(id="LastName")
	WebElement LastName;

	@FindBy(id="Email")
	WebElement Email;

	@FindBy(id="Password")
	WebElement Password;

	@FindBy(id="ConfirmPassword")
	WebElement ConfirmPassword;

	@FindBy(id="register-button")
	WebElement register_button;
	
	@FindBy(css="div.result")
	public WebElement register_successMessage;
	public void userRegisteration(String Fname,String Lname,String email,String pass)
	{
		clickButton(gender_female);
		sendText(firstName, Fname);
		sendText(LastName, Lname);
		sendText(Email, email);
		sendText(Password, pass);
		sendText(ConfirmPassword, pass);
		clickButton(register_button);
	}
}
