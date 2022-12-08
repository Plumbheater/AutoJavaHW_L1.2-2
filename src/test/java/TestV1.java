import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
public class TestV1 {
@Test
    void test1 () {
    // Given - When - Then
// Предусловия
    given()
            .baseUri("https://postman-echo.com")
            .body("some data")
            .when()
            .post("/post")
            .then()
            .statusCode(200)
            .body("data", equalTo("some date"));
    }
}
