
package de.deliveryhero.mailordercoffeeshop;

import androidx.test.espresso.intent.rule.IntentsTestRule;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.CursorMatchers.withRowString;
import static androidx.test.espresso.matcher.ViewMatchers.hasDescendant;
import static androidx.test.espresso.matcher.ViewMatchers.isSelected;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.anything;

public class EspressoWorkshopTest  {


    @Rule
    public ActivityTestRule<MainActivity> activityRule
            = new ActivityTestRule<>(MainActivity.class);



    @Test
    public void CloseOnboardingscreen() {
        onView(withId(R.id.close_button)).perform(click());
        onView(withId(R.id.more_espresso)).perform(click());
        onView(withId(R.id.more_espresso)).perform(click());
        onView(withId(R.id.chocolate)).perform(click());
        onView(withId(R.id.milk_type)).perform(click());
        onData(anything()).atPosition(3).perform(click());
        onView(withText("Steamed")).perform(click());
        onView(withId(R.id.review_order_button)).perform(click());
        onView(withId(R.id.name_text_box)).perform(typeText("Hassan"));
        onView(withId(R.id.custom_order_name_box)).perform(typeText("MyFirstOrder"));
        onView(withId(R.id.mail_order_button)).perform(click());


    }
}
