
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPage {
    
    private WebDriver driver;
     
    public LoginPage (WebDriver driver) {
            this.driver = driver;
      }
      
    private By usernameInputLoginField = By.id("username");
    private By passowordInputLoginField = By.id("password");
    private By loginButton = By.cssSelector("div#app .form button.button--primary");
   
      
    public void enterLoginUsername(String username){
        driver.findElement(usernameInputLoginField).sendKeys(username);
      }    
    public void enterPassword (String password){
        driver.findElement(passowordInputLoginField).sendKeys(password);
    }       
    public void clickOnLoginButton() {
        driver.findElement(loginButton).click();
    }   
}
    
    
    
    
