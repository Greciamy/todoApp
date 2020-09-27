package activity;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class MainActivity {

    public Button addTaskButton;
    public Button searchButton;

    public MainActivity() {
        addTaskButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
        searchButton = new Button(By.id("com.vrproductiveapps.whendo:id/search"));
    }

    public boolean isCreatedTask() {
        String locator = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.ListView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]";
        Label task = new Label(By.xpath(locator));
        return task.isDisplayed();
    }
}
