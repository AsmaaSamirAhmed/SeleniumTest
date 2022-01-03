package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.UserRegisterationPage;

public class TestUserRegisteration extends TestBase {
	HomePage HomeObj;
	UserRegisterationPage registerObj;
	@Test
	public void User_Register_sucess()
	{
		HomeObj =new HomePage(driver);
		HomeObj.openRegiteration();
		registerObj= new UserRegisterationPage(driver);
		registerObj.userRegisteration("name","lname", "mail@yahoo.com","asma785874");
		Assert.assertTrue(registerObj.register_successMessage.getText().contains("Your registration completed"));
	}
}
