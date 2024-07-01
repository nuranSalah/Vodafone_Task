package APITest;

import APIs.Randoms_API;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetRandomFactTest
{
    Randoms_API randomsApi = new Randoms_API();

    @Test
    public void getRandomFact()
    {
        Response response = randomsApi.getRandomFactRequest();
        randomsApi.validateLength(response);
        randomsApi.validateSuccess(response);
    }

}
