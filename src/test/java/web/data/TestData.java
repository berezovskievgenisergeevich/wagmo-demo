package web.data;

import com.github.javafaker.Faker;
import config.TestsConfig;
import org.aeonbits.owner.ConfigFactory;

import java.util.Locale;

public class TestData {
    private final TestsConfig config = ConfigFactory.create(TestsConfig.class, System.getProperties());
    private final Faker faker = new Faker(new Locale("en-US"));
    public final String RANDOM_VEGETABLE = faker.food().vegetable();
    public static final String SEARCH_SELENIDE = "SELENIDE";

}
