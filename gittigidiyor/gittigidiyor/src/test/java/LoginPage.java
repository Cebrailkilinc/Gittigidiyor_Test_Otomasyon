import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {


    private By toLoginAction = By.cssSelector("div#__next div[name='profile']");
    private By loginButton = By.xpath("//a[@data-cy='header-login-button']");
    private By userNameField =By.id("L-UserNameField");
    private By passwordField = By.id("L-PasswordField");
    private By loginButtonSecond  = By.id("gg-login-enter");



    protected WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 90);

    }
    public void loginUser(String email, String password) throws InterruptedException
    {
        Thread.sleep(1000);
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(toLoginAction);
        action.moveToElement(we).build().perform();
        Thread.sleep(1000);
        driver.findElement(loginButton).click();
        Thread.sleep(1000);
        driver.findElement(userNameField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(loginButtonSecond).click();


    }

}
