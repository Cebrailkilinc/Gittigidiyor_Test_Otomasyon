import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

    private By selectProduct =By.xpath("//img[@src='https://mcdn01.gittigidiyor.net/62570/tn30/625701907_tn30_0.jpg?162426']");
    private By addToBasket = By.id("product_id_659877722");

    protected WebDriver driver;
    WebDriverWait wait;

    public ProductPage(WebDriver driver)
    {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, 90);
    }

    public ProductPage add() throws InterruptedException {

        Thread.sleep(3000);
        ((JavascriptExecutor)driver).executeScript("scroll(0,600)");
        Actions action = new Actions(driver);
        WebElement addd = driver.findElement(addToBasket);
        action.moveToElement(addd ).build().perform();
        addd.click();


        return new ProductPage(driver);


    }


}
