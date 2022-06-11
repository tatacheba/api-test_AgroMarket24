package tests;

import config.BodyRequestConfig;
import io.restassured.response.Response;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.*;
import static specs.Specs.*;

public class ApiNokianTyres {
    BodyRequestConfig br = new BodyRequestConfig();

    @Test
    @DisplayName("Добавление товара в корзину")
    void addToCard() throws FileNotFoundException {
        Response response = given()
                .spec(requestSpec)
                .body(br.getBodyRequest())
                .when()
                .log().uri()
                .post("/api/cart/add")
                .then()
                .spec(response200)
                .extract().response();

        String product = response.path("entry.product.code");
        int count = response.path("quantity");

        assertThat(count).isEqualTo(br.getBodyRequest().getQuantity());
        assertThat(product).isEqualTo(br.getBodyRequest().getProductCode());
    }

    @Test
    @DisplayName("Проверяем, что товар в корзине")
    void checkProductToCard() throws FileNotFoundException {
        Response getMini = given()
                .spec(requestSpec)
                .queryParam("qty", "0")
                .when()
                .log().uri()
                .get("/api/cart/mini")
                .then()
                .spec(response200)
                .log().body()
                .body("entries[0].quantity", is(br.getBodyRequest().getQuantity()))
                .extract().response();
    }

    @Test
    @DisplayName("Удаление товара из корзины")
    void deleteProductMini() {
        Response response = given()
                .spec(requestSpec)
                .param("qty", "0")
                .when()
                .post("api/cart/update/0")
                .then()
                .spec(response200)
                .body(matchesJsonSchemaInClasspath("schemes/miniResponse.json"))
                .extract()
                .response();
    }

    @Test
    @DisplayName("Проверка, что корзина пуста и товар удален")
    void subscribeFullTest2() {
        Response getMini = given()
                .spec(requestSpec)
                .queryParam("qty", "0")
                .when()
                .log().uri()
                .get("/api/cart/mini")
                .then()
                .spec(response200)
                .body(matchesJsonSchemaInClasspath("schemes/miniResponse.json"))
                .body("entries.size()", is(0))
                .extract().response();
    }

    @Test
    @DisplayName("Поиск шин по параметрам ширина/профиль/диаметр")
    void searchToParamTypes() {
        Response response = given()
                .spec(requestSpecForSearch)
                .queryParam("q", ":rim_facet:14:width_facet:165:ratio_facet:65")
                .when()
                .get("/api/search")
                .then()
                .spec(response200)
                .extract().response();

        int results = response.path("pagination.totalNumberOfResults");

        step("Проверяем, что есть результаты");
        assertThat(results).isNotNull();
    }

    @Test
    @DisplayName("Поиск шин по наличию 'Бессрочной гарантии'")
    void searchTyresLifeTimeGuarantee() {
        Response response = given()
                .spec(requestSpecForSearch)
                .queryParam("q", ":stockAvailabilityPOS:SF+0015I000007JwowQAC:stockAvailabilityPOS:SF+0015I000005pyzDQAQ:productGuarantee:lifeTimeGuarantee")
                .when()
                .get("/api/search")
                .then()
                .spec(response200)
                .extract()
                .response();

        int results = response.path("pagination.totalNumberOfResults");

        step("Проверяем, что есть результаты");
        assertThat(results).isNotEqualTo(0);
    }
}
