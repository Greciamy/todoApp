package testClean;

import activity.MainActivity;
import activity.SearchActivity;
import activity.TaskActivity;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;

public class TodoManagerTest {

    MainActivity mainActivity = new MainActivity();
    TaskActivity taskActivity = new TaskActivity();
    SearchActivity searchActivity = new SearchActivity();

    @Test
    public void verifyCreateTask() throws MalformedURLException {
        String nameTask = "Active alarm";
        String noteTask = "Important task";

        mainActivity.addTaskButton.click();
        taskActivity.titleTask.type(nameTask);
        taskActivity.noteTask.type(noteTask);
        taskActivity.addTaskButton.click();

        Assert.assertTrue("ERROR, la tarea no fue creada", mainActivity.isCreatedTask());

    }

    @Test
    public void searchTasks() throws MalformedURLException {
        String searchTask = "Active alarm";

        mainActivity.searchButton.click();
        searchActivity.searchTextbox.type(searchTask+"\n");

        Assert.assertTrue("ERROR, no se encontro ninguna tarea", searchActivity.countResults().equals(1));
    }
}
