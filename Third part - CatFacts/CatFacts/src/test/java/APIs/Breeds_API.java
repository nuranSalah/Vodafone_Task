package APIs;

import Model.BreedsResponseBody;
import Model.FactsResponseBody;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class Breeds_API
{
    private String getBreeds_endPoint = "/breeds";
    Gson gson = new Gson();

    public Response getBreedsRequest()
    {
        RestAssured.baseURI = Apis.baseUrl;
        return given().log().all().when().get(getBreeds_endPoint);
    }

    public  void validateBreedsResponseBody(Response response)
    {
        BreedsResponseBody breeds = gson.fromJson(response.asString() , BreedsResponseBody.class);
        Assert.assertEquals(breeds.current_page , 1);
    }

    public void validateSuccess(Response response)
    {
        Assert.assertEquals(response.getStatusCode(),200);
    }

    public void validateLimit(Response response)
    {
        BreedsResponseBody breeds = gson.fromJson(response.asString() , BreedsResponseBody.class);
        Assert.assertEquals(breeds.data.size() , breeds.per_page);
    }
    public void validateData(Response response)
    {
        BreedsResponseBody breeds = gson.fromJson(response.asString() , BreedsResponseBody.class);
        Assert.assertFalse(breeds.data.isEmpty());
    }
}