
package de.deliveryhero.mailordercoffeeshop;
import de.deliveryhero.mailordercoffeeshop.Steps.*;
import androidx.test.espresso.Espresso;
import org.junit.*;
import androidx.test.rule.ActivityTestRule;

public class EspressoWorkshopTest  {

    private String TitleName;
    private String DrinkIngredients;
    private String CustomerName;
    private String CustomerEmail;
    private String CustomOrderName;


    OnboardSteps Onboardsteps = new OnboardSteps();
    ValoriMailOrderCoffeeshopSteps CustomOrdersteps = new ValoriMailOrderCoffeeshopSteps();
    FillFormSteps Fillformsteps = new FillFormSteps();


    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    private MainActivity MyActivity;


    @Before
    public void setup()
    {
        TitleName = "Valori Mail Order Coffeeshop";
        DrinkIngredients = "Ingredients:\n" + "2 shots of espresso\n" + "Chocolate\n" + "Steamed Low fat";
        CustomerName = "Hassan";
        CustomerEmail = "hassan.zahid80@gmail.com";
        CustomOrderName = "MyFirstOrder";
        MyActivity = activityRule.getActivity();
    }

    @Test
    public void VerifyCompleteCustomOrderSubmitted() {
        Onboardsteps.CloseOnboardScreen();
        CustomOrdersteps.VerifyTitle(TitleName);
        CustomOrdersteps.AddEspressoShot();
        CustomOrdersteps.AddEspressoShot();
        CustomOrdersteps.VerifyCounterEspresso("2");
        CustomOrdersteps.CheckChocolate();
        CustomOrdersteps.verifyHotEspressoisSelected();
        CustomOrdersteps.MilkSelection(2);
        CustomOrdersteps.SelectSteamedPreparation();
        CustomOrdersteps.ScrollPageUp();
        CustomOrdersteps.ClickReviewOrder();
        Fillformsteps.VerifyCustomDrinkIngredients(DrinkIngredients);
        Fillformsteps.EnterName(CustomerName);
        Espresso.closeSoftKeyboard();
        Fillformsteps.EnterEmail(CustomerEmail);
        Espresso.closeSoftKeyboard();
        Fillformsteps.EnterCustomOrderName(CustomOrderName);
        Espresso.closeSoftKeyboard();
        Fillformsteps.SubmitOrder();
    }
    @After
    public void tearDown() {
        activityRule.finishActivity();
    }

}
