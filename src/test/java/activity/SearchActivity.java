package activity;

import appiumControl.Button;
import appiumControl.Label;
import appiumControl.TextBox;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.List;

public class SearchActivity {

    public TextBox searchTextbox;
    public Label searchResult;

    public SearchActivity() {
        searchTextbox = new TextBox((By.id("com.vrproductiveapps.whendo:id/search_src_text")));
        searchResult = new Label(By.id("com.vrproductiveapps.whendo:id/search_header2"));
    }

    public String countResults() throws MalformedURLException {
       return searchResult.getText();
    }
}
