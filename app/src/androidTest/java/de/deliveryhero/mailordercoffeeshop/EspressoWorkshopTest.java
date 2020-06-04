
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
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public class EspressoWorkshopTest {


    @Rule
    public ActivityTestRule<MainActivity> activityRule
            = new ActivityTestRule<>(MainActivity.class);



    @Test
    public void CloseOnboardingscreen() {
        // Type text and then press the button.
        onView(withId(R.id.close_button)).perform(click());
        onView(withId(R.id.more_espresso)).perform(click());
    }
//    @Test
//    public void PlaceandOrder(){
//     //onView(withId(R.id.more_espresso)).perform(doubleClick());
//     //onView(withid(R.id.more_espresso)).perform(click());
//     onView(withId(R.id.chocolate)).perform(click());
//     onData(withId(R.id.milk_options_container)).atPosition(3).perform(click());
//    }
}
