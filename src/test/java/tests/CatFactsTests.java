package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class CatFactsTests {
    @BeforeAll
    static void beforeAll() {
        baseURI = "https://cat-fact.herokuapp.com";
    }

    @Test
    @DisplayName("Проверяем, что статус код 200")
    void checkStatus200() {
        get(baseURI)
                .then()
                .statusCode(200);
    }

    @Test
    @DisplayName("Проверяем, что текст содержит случайный факт")
    void getCatFactRandom() {
        given()
                .when()
                .get("/facts/random")
                .then()
                .log().body()
                .body("text", not(nullValue()));
    }

    @Test
    @DisplayName("Получить факт о котах по id")
    void getCatFactID() {
        given()
                .when()
                .get("/facts/58e008780aac31001185ed05")
                .then()
                .statusCode(200)
                .log().body()
                .body("text", is("Owning a cat can reduce the risk of stroke and heart attack by a third."));
    }

    @Test
    @DisplayName("Проверка что отсутсвуют факты о лошадях")
    void getCatFact2() {
        given()
                .when()
                .get("/facts?animal_type=horse")
                .then()
                .statusCode(200)
                .log().body()
                .body("type", hasItem(not("horse")));
    }

}
