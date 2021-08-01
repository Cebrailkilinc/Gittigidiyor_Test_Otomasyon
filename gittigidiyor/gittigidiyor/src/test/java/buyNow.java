import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class buyNow {
        private By buyNow = By.id("add-to-basket");
        private By completeShop = By.id("buy-now");

    protected WebDriver driver ;
    WebDriverWait wait;

    public buyNow(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver,90);


    }

    public buyNow BuyNow() {
        ((JavascriptExecutor)driver).executeScript("scroll(0,600)");
        driver.findElement(completeShop).click();

        return new buyNow(driver);


    }



}
