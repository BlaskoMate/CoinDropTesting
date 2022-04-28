package StepDefinitons;

import Pages.LoginAndRegisterPage;
import Pages.ProfilePage;
import Util.DriverUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BeforeAndAfter {
        protected static DriverUtil driverUtil;
        private final LoginAndRegisterPage loginAndRegisterPage = new LoginAndRegisterPage(driverUtil.getDriver());
        private final ProfilePage profilePage = new ProfilePage(driverUtil.getDriver());

        @Before
        public static void getDriver(){
            driverUtil = DriverUtil.getDriverUtil();
        }

        @After("@last")
        public static void closeDriver(){
            driverUtil.closeDriver();
            driverUtil = null;
        }
}
