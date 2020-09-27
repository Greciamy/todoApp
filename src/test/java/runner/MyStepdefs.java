package runner;

import activity.MainActivity;
import activity.SearchActivity;
import activity.TaskActivity;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.net.MalformedURLException;

public class MyStepdefs {

    MainActivity mainActivity = new MainActivity();
    TaskActivity taskActivity = new TaskActivity();
    SearchActivity searchActivity = new SearchActivity();

    @Given("^I have open my todo app$")
    public void iHaveOpenMyTodoApp() {
    }

    @When("^I click add button$")
    public void iClickAddButton() throws MalformedURLException {
        mainActivity.addTaskButton.click();
    }

    @And("^I type '(.*)' in title textbox in todoapp activity$")
    public void iTypeTestInTitleTextboxInTodoappActivity(String value) throws MalformedURLException {
        taskActivity.titleTask.type(value);
    }

    @And("^I type '(.*)' in note textbox in todoapp activity$")
    public void iTypeNoteTestInNoteTextboxInTodoappActivity(String value) throws MalformedURLException {
        taskActivity.noteTask.type(value);
    }

    @And("^I click on the save button in todoapp activity$")
    public void iClickOnTheCheckButtonInTodoappActivity() throws MalformedURLException {
        taskActivity.addTaskButton.click();
    }

    @Then("^Task '(.*)' is created$")
    public void taskTestIsCreated() {
        Assert.assertTrue("ERROR, la tarea no fue creada", mainActivity.isCreatedTask());
    }
    
    @When("^I click in the button of searching$")
    public void iClickInTheButtonOfSearching() throws MalformedURLException {
        mainActivity.searchButton.click();
    }

    @And("^I type '(.*)' in search textbox in todoapp activity$")
    public void iTypeTestInSearchTextboxInTodoappActivity(String value) throws MalformedURLException {
        searchActivity.searchTextbox.type(value+"\n");
    }

    @Then("^Search shows elements found$")
    public void searchShowsElements() throws MalformedURLException {
        Assert.assertTrue("ERROR, no se encontro ninguna tarea", searchActivity.countResults().equals(1));
    }
}
