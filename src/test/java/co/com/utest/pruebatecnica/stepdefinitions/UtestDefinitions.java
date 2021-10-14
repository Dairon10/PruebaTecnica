package co.com.utest.pruebatecnica.stepdefinitions;


import co.com.utest.pruebatecnica.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import co.com.utest.pruebatecnica.model.utestData;

import java.util.List;


public class UtestDefinitions {

    @Before public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^than dairon wants to register on the Utest page$")
    public void thanDaironWantsToRegisterOnTheUtestPage() throws Exception {
        OnStage.theActorCalled("Dairon").wasAbleTo(OpenUp.thePage());

    }

    @When("^he fills out the first step of the registration form$")
    public void heFillsOutTheFirstStepOfTheRegistrationForm(List<utestData> utestData) throws Exception {
        OnStage.theActorCalled("Dairon").wasAbleTo(FillOutFirstPage.
                onThePage(utestData.get(0).getStrName(),utestData.get(0).getStrLastName(), utestData.get(0).getStrEmail()));

    }

   @Then("^he fills out the second step of the registration form$")
    public void heFillsOutTheSecondStepOfTheRegistrationForm()  throws Exception {
       OnStage.theActorCalled("Dairon").wasAbleTo(FillOutSecondPage.onThePage());
   }

    @And("^he fills out the third step of the registration form$")
    public void heFillsOutTheThirdStepOfTheRegistrationForm()  throws Exception {
        OnStage.theActorCalled("Dairon").wasAbleTo(FillOutThirdPage.onThePage());
    }

    @And("^he fills out the fourth step of the registration form$")
    public void heFillsOutTheThirdStepOfTheRegistrationForm(List<utestData> utestData)  throws Exception {
        OnStage.theActorCalled("Dairon").wasAbleTo(FillOutFourthPage.onThePage(utestData.get(0).getStrPassword(),utestData.get(0).getStrConfirmPassword()));
    }

}
