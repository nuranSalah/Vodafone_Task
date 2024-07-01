package APITest;

import APIs.Breeds_API;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetBreedsTest {

    Breeds_API breedsApi = new Breeds_API();

    @Test
    public void getBreeds() {
        Response response = breedsApi.getBreedsRequest();
        breedsApi.validateBreedsResponseBody(response);
        breedsApi.validateSuccess(response);
        breedsApi.validateLimit(response);
        breedsApi.validateData(response);
    }


}