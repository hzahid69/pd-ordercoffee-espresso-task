package de.deliveryhero.mailordercoffeeshop.Steps;
import de.deliveryhero.mailordercoffeeshop.AppPageObjects.OnBoardPage;
import static androidx.test.espresso.action.ViewActions.click;

public class OnboardSteps extends OnBoardPage {

    public void CloseOnboardScreen(){

        OnboardscreenCloseButton.perform(click());
    }
}
