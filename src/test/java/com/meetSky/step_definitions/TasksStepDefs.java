package com.meetSky.step_definitions;

import com.meetSky.pages.TasksPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class TasksStepDefs {

    TasksPage tasksPage = new TasksPage();

    @And("the user navigates to {string} module")
    public void the_user_navigates_to_module(String moduleName) {
        tasksPage.clickMenuByText(moduleName);
    }
}
