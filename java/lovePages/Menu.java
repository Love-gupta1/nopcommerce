package lovePages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Menu {



    WebDriver driver;
    By system= new By.ByLinkText("System");
    public Menu(WebDriver driver){
        this.driver=driver;
    }
    public void menu(){
        driver.findElement(system).click();
    }
    }

