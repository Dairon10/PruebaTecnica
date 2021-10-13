package co.com.utest.pruebatecnica.stepdefinitions;


import co.com.utest.pruebatecnica.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import co.com.utest.pruebatecnica.tasks.OpenUp;
import co.com.utest.pruebatecnica.model.utestData;

import java.util.List;


public class UtestDefinitions {

    @Before public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^than dairon wants to register on the Utest page$")
    public void thanDaironWantsToRegisterOnTheUtestPage(List<utestData> utestData) throws Exception {
        OnStage.theActorCalled("Dairon").wasAbleTo(OpenUp.thePage(),Register.
                onThePage(utestData.get(0).getStrName(),utestData.get(0).getStrLastName(), utestData.get(0).getStrEmail(),utestData.get(0).getStrPassword(),utestData.get(0).getStrConfirmPassword()));

    }

    @When("^he fill out the first step of the registration form$")
    public void heFillOutTheFirstStepOfTheRegistrationForm(List<utestData> utestData) throws Exception {
    }

   @Then("^Complete the entire form and create the user with a new password$")
    public void CompleteTheEntireFormAndCreateTheUserWithANewPassword(List<utestData> utestData)  throws Exception {

   }

}
