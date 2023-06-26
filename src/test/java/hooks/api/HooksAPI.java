package hooks.api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;
import utilities.ConfigReader;

public class HooksAPI {

    RequestSpecification spec;

    @Before
    public void setUp(){

        spec=new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("base_Url")).build();


    }
}
