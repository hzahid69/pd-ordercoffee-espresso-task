package de.deliveryhero.mailordercoffeeshop.AppPageObjects;
import androidx.test.espresso.ViewInteraction;
import de.deliveryhero.mailordercoffeeshop.R;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;


public class FillFormPage {

    protected ViewInteraction CustomDrinkIngredients = onView(withId(R.id.beverage_detail_ingredients));
    protected ViewInteraction CustomDrinkVolume = onView(withId(R.id.beverage_detail_volume_text));
    protected ViewInteraction EnterNameField = onView(withId(R.id.name_text_box));
    protected ViewInteraction EnterEmailField = onView(withId(R.id.email_text_box));
    protected ViewInteraction EnterCustomOrderNameField = onView(withId(R.id.custom_order_name_box));
    protected ViewInteraction SubmitOrderButton = onView(withId(R.id.mail_order_button));

}
