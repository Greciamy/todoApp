package activity;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class TaskActivity {

    public TextBox titleTask;
    public TextBox noteTask;
    public Button addTaskButton;

    public TaskActivity() {
        titleTask = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
        noteTask = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
        addTaskButton = new Button(By.xpath("//android.widget.TextView[@content-desc=\"Guardar\"]"));
    }
}
