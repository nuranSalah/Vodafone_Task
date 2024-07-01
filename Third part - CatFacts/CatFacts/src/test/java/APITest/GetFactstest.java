package APITest;

import APIs.Facts_API;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetFactstest
{
    Facts_API factsApi = new Facts_API();

    @Test
    public void getFacts()
    {
        Response response = factsApi.getFactsRequest();
        factsApi.validateFactsResponseBody(response);
        factsApi.validateSuccess(response);
        factsApi.validateLimit(response);
    }
}