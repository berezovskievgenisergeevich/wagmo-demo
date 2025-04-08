package web.test;

import lombok.val;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import web.pages.Start;

import static com.codeborne.selenide.Condition.text;

public class StartTest extends BaseTest {

    @Test
    @Tags({@Tag("start"), @Tag("ui")})
    @DisplayName("Check submitting a form without data")
    void checkSubmittingFormWithoutData() {
        val start = new Start(true).clickNext();
        start.getNameErrorMessageElement().shouldHave(text("Pet's Name is a required field"));
        start.getTypeErrorMessageElement().shouldHave(text("Please provide the type of your pet."));
        start.getGenderErrorMessageElement().shouldHave(text("Please provide the gender of your pet."));
    }


}
