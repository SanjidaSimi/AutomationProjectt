package ProjectRun;

import CustomerAdd.CreateCustomer;

import static BrowserLaunch.ConfigBrowser.launch_Chrome;
import static BrowserLaunch.ConfigBrowser.open_URL;

public class Runproject extends CreateCustomer {

    public static void main(String[] args) {
        launch_Chrome();
        open_URL("http://demo.guru99.com/V1/index.php");
        Login();
        CreateCustomer();
        Close_Chrome();
    }


}

