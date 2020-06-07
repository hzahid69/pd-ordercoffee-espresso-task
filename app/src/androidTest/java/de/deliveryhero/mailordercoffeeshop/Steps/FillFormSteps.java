package de.deliveryhero.mailordercoffeeshop.Steps;
import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.assertion.ViewAssertions;
import de.deliveryhero.mailordercoffeeshop.AppPageObjects.FillFormPage;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class FillFormSteps extends FillFormPage {

    public ViewInteraction VerifyCustomDrinkIngredients(String DrinkIngredients){
        return CustomDrinkIngredients.check(ViewAssertions.matches(withText(DrinkIngredients)));
    }
    public void EnterName(String Name){
        EnterNameField.perform(typeText(Name));
    }
    public void EnterEmail(String Email){
        EnterEmailField.perform(typeText(Email));
    }
    public void EnterCustomOrderName(String OrderName){
        EnterCustomOrderNameField.perform(typeText(OrderName));
    }
    public void SubmitOrder(){
       SubmitOrderButton.perform(click());
    }
}
