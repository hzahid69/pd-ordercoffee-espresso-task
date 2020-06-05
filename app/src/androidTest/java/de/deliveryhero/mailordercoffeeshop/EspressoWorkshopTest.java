
package de.deliveryhero.mailordercoffeeshop;

import android.view.inputmethod.InputMethodManager;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.ViewAssertion;
import androidx.test.espresso.intent.rule.IntentsTestRule;

import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import androidx.test.rule.ActivityTestRule;
import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.doubleClick;
import static androidx.test.espresso.action.ViewActions.swipeUp;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.anything;

import androidx.test.espresso.assertion.ViewAssertions;


public class EspressoWorkshopTest  {


    @Rule
    public ActivityTestRule<MainActivity> activityRule
            = new ActivityTestRule<>(MainActivity.class);

    private MainActivity LocatingActivity;


    @Before
    public void setup()
    {
        LocatingActivity = activityRule.getActivity();
    }


    @Test
    public void TestScript() {
        //close the Onboardscreen
        onView(withId(R.id.close_button)).perform(click());
        //making a Custom Order
        onView(withId(R.id.title_view)).check(ViewAssertions.matches(withText("Valori Mail Order Coffeeshop")));
        onView(withId(R.id.more_espresso)).perform(doubleClick());
        onView(withId(R.id.chocolate)).perform(click());
        onView(withId(R.id.milk_type)).perform(click());
        onData(anything()).atPosition(2).perform(click());
        onView(withText("Steamed")).perform(click());
        onView(withId(R.id.custom_order_scrollview)).perform(swipeUp());
        //submitting the order
        onView(withId(R.id.review_order_button)).perform(click());
        onView(withId(R.id.beverage_detail_volume_text)).check(ViewAssertions.matches(withText("120 ML.")));
        onView(withId(R.id.beverage_detail_ingredients)).check(ViewAssertions.matches(withText("Ingredients:\n" +
                "2 shots of espresso\n" +
                "Chocolate\n" +
                "Steamed Low fat")));
        //fill the submit form
        onView(withId(R.id.name_text_box)).perform(typeText("Hassan"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.custom_order_name_box)).perform(typeText("MyFirstOrder"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.email_text_box)).perform(typeText("hassan.zahid80@gmail.com"));
        Espresso.closeSoftKeyboard();
        //Submit form
        onView(withId(R.id.mail_order_button)).perform(click());
    }

}
