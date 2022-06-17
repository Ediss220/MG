import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class API_test {
    @Test
    public void SearchBoxAPI() {
        given()
                .param("api_key","41a6894ca93cb1c78657d9e799e164de")
                .param("language","en-US")
                .param("query","Mulan")
                .get("https://api.themoviedb.org/3/search/movie")
                .then().statusCode(200)
                .body("", Matchers.notNullValue())
                .log().body();

    }
    @Test
    public void SearchBoxAPI() {
        given()
                .param("api_key","41a6894ca93cb1c78657d9e799e164de")
                .param("language","en-US")
                .param("query","Mulan")
                .get("https://api.themoviedb.org/3/search/movie")
                .then().statusCode(200)
                .body("", Matchers.notNullValue())
                .log().body();

    }
}
