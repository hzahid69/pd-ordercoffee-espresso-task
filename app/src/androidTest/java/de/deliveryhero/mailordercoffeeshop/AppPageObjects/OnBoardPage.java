package de.deliveryhero.mailordercoffeeshop.AppPageObjects;

import androidx.test.espresso.ViewInteraction;
import de.deliveryhero.mailordercoffeeshop.R;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;


public class OnBoardPage {

    protected ViewInteraction OnboardscreenCloseButton = onView(withId(R.id.close_button));

}

