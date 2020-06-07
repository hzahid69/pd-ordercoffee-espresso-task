package de.deliveryhero.mailordercoffeeshop.AppPageObjects;
import androidx.test.espresso.ViewInteraction;
import de.deliveryhero.mailordercoffeeshop.R;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class ValoriMailOrderCoffeshopPage {

    protected ViewInteraction CustomOrderButton = onView(withId(R.id.use_custom));
    protected ViewInteraction TitleText = onView(withId(R.id.title_view));
    protected ViewInteraction moreEspressoShots = onView(withId(R.id.more_espresso));
    protected ViewInteraction EspressoShotsCounter = onView(withId(R.id.espresso_shot_counter));
    protected ViewInteraction hotEspressoSwitch = onView(withId(R.id.beverage_temperature));
    protected ViewInteraction ChocolateCheckbox = onView(withId(R.id.chocolate));
    protected ViewInteraction MilkTypeDropdown = onView(withId(R.id.milk_type));
    protected ViewInteraction ReviewOrderButton = onView(withId(R.id.review_order_button));
    protected ViewInteraction SteamedRadioButton = onView(withText("Steamed"));
    protected ViewInteraction Scroll = onView(withId(R.id.custom_order_scrollview));

}
