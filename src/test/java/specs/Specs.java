package specs;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.with;
import static listeners.CustomAllureListener.withCustomTemplates;

public class Specs {
    private static String cookie = "ntmarketplace-cart=c58d0ba1-5589-48e3-bee3-215e258876ee; JSESSIONID=E8AF29762CF35AA968529F8218980F66;";
    public static RequestSpecification requestSpec =
            with()
                    .filter(withCustomTemplates())
                    .baseUri("https://marketplace.nokiantyres.ru")
                    .accept("application/json")
                    .contentType(ContentType.JSON)
                    .cookie(cookie);
    public static RequestSpecification requestSpecForSearch =
            with()
                    .filter(withCustomTemplates())
                    .baseUri("https://marketplace.nokiantyres.ru")
                    .accept("application/json")
                    .queryParam("page", "0")
                    .queryParam("size", "24")
                    .queryParam("isPlpSearch", "true")
                    .contentType(ContentType.JSON)
                    .cookie(cookie);
    public static ResponseSpecification response200 = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .log(LogDetail.STATUS)
            .log(LogDetail.BODY)
            .log(LogDetail.URI)
            .build();
}
