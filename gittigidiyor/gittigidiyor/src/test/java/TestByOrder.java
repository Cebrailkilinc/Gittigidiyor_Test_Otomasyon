
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestByOrder
{
    private static WebDriver driver;


    private static void setupDriver() throws InterruptedException
    {
    if(driver== null);
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\IdeaProjects\\gittigidiyor\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Chrome Browser oluşturuldu");
        driver.get("https://www.gittigidiyor.com/");
        System.out.println("Web sitesine gidiliyor");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }


    @Test
    public void test_1_loginpage() throws InterruptedException {
        setupDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginUser(Settings.email,Settings.password);

    }
    @Test
    public void test_2_searchPage() throws InterruptedException {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.searchPage(Settings.search);

    }
    @Test
    public void test_3_poductPage() throws InterruptedException {
        ProductPage productPage = new ProductPage(driver);
        productPage.add();

    }
    @Test
    public  void  test_4_buyNow(){
        buyNow BuyNow = new buyNow(driver);
        BuyNow.BuyNow();
    }




}






