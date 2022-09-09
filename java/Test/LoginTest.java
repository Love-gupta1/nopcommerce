package Test;



public class LoginTest extends Baseclass {

    public static void main(String[] args) throws InterruptedException{
        setup();
        pageFactory.getLoginPage().login();
        pageFactory.getMenu().menu();
        Thread.sleep(5000);
    }

}
