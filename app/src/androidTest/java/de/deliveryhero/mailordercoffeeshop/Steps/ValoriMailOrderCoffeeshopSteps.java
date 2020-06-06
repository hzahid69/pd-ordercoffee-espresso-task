package de.deliveryhero.mailordercoffeeshop.Steps;
import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.assertion.ViewAssertions;
import de.deliveryhero.mailordercoffeeshop.AppPageObjects.ValoriMailOrderCoffeshopPage;
import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.swipeUp;
import static androidx.test.espresso.matcher.ViewMatchers.isChecked;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.anything;

public class ValoriMailOrderCoffeeshopSteps extends ValoriMailOrderCoffeshopPage {

    public void VerifyTitle(String Title){
        TitleText.check(ViewAssertions.matches(withText(Title)));
    }

    public void SelectCustomOrderButton(){
        CustomOrderButton.perform(click());
    }
    public void AddEspressoShot(){
        moreEspressoShots.perform(click());
    }
    public void CheckChocolate(){
        ChocolateCheckbox.perform(click());
    }
    public void MilkSelection(int index){
        MilkTypeDropdown.perform(click());
        onData(anything()).atPosition(index).perform(click());
    }
    public void VerifyCounterEspresso(String EspressoCounts){
        EspressoShotsCounter.check(ViewAssertions.matches(withText(EspressoCounts)));
    }
    public ViewInteraction verifyHotEspressoisSelected(){
        return hotEspressoSwitch.check(ViewAssertions.matches(isChecked()));
    }
    public void SelectSteamedPreparation(){
        SteamedRadioButton.perform(click());
    }
    public void ScrollPageUp(){
        Scroll.perform(swipeUp());
    }
    public void ClickReviewOrder(){
        ReviewOrderButton.perform(click());
    }

}
