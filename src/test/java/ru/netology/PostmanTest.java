package ru.netology;

import org.junit.jupiter.api.Test;

import javax.xml.validation.Validator;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;

public class PostmanTest {
    @Test
    void ShouldTestPostman() {

        given()
                .baseUri("https://postman-echo.com")
                .body("404")
                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("404"))
        ;
    }

}
