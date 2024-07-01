package APIs;

import Model.BreedsResponseBody;
import Model.RandomFactResponseBody;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class Randoms_API {

    private String getRandomFact_endPoint = "/fact";
    Gson gson = new Gson();

    public Response getRandomFactRequest()
    {
        RestAssured.baseURI = Apis.baseUrl;
        return given().log().all().when().get(getRandomFact_endPoint);
    }

    public void validateSuccess(Response response)
    {
        Assert.assertEquals(response.getStatusCode(),200);
    }

    public  void validateLength(Response response)
    {
        RandomFactResponseBody randoms = gson.fromJson(response.asString() , RandomFactResponseBody.class);
        Assert.assertEquals(randoms.fact.length() , randoms.length);

    }
}
