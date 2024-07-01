package APIs;

import Model.BreedsResponseBody;
import Model.FactsResponseBody;
import Model.RandomFactResponseBody;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class Facts_API{

    private String getFacts_endPoint = "/facts";
    Gson gson = new Gson();
    public Response getFactsRequest(){

        RestAssured.baseURI = Apis.baseUrl;
        return given().log().all().when().get(getFacts_endPoint);
    }

    public  void validateFactsResponseBody(Response response)
    {
        FactsResponseBody facts = gson.fromJson(response.asString() , FactsResponseBody.class);
        Assert.assertEquals(facts.current_page , 1);

    }

    public void validateSuccess(Response response)
    {
        Assert.assertEquals(response.getStatusCode(),200);
    }

    public void validateLimit(Response response)
    {
        FactsResponseBody facts = gson.fromJson(response.asString() , FactsResponseBody.class);
        Assert.assertEquals(facts.data.size() , facts.per_page);
    }
}
