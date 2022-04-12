package test;

import org.junit.jupiter.api.Test;



public class TCStep extends TestBase {

    // Verify Login to WebPage
    @Test
    public void Login(){
        plans.newPlanDisplayed();
    }

    // Verify Keywords Page
    @Test
    public  void Keywords(){
        keywords.clickKeywords();
        keywords.newKeywordDisplayed();
    }

    // Verify Parameters Page
    @Test
    public void Parameters(){
        parameters.clickParameters();
        parameters.newParameterDisplayed();
    }

    // Verify Executions Page
    @Test
    public void Executions(){
        executions.clickExecutions();
        executions.executionListDisplayed();
    }

    // Verify Scheduler Page
    @Test
    public void Scheduler(){
        scheduler.clickScheduler();
        scheduler.newTaskDisplayed();
    }
}
