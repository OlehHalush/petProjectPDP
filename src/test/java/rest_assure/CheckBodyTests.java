package rest_assure;

import io.restassured.RestAssured;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.path.json.JsonPath;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import java.util.Map;

import static org.hamcrest.Matchers.*;

public class CheckBodyTests extends BaseClass {
    private static final String RATE_LIMIT_URL = "/rate_limit";

    @Test
    public void getWholeBodyWithAllNestedObjects() {
        RestAssured.filters(new RequestLoggingFilter(LogDetail.ALL), new ResponseLoggingFilter(LogDetail.ALL));

        JsonPath json = RestAssured.get(BASE_URL + RATE_LIMIT_URL).getBody().jsonPath();
        System.out.println(json.prettyPeek());
    }

    @Test
    public void getNestedObjectsWithValues() {
        Map<String, String> json = RestAssured.get(BASE_URL + RATE_LIMIT_URL).getBody().jsonPath().get("resources");
        System.out.println(json);
    }

    @Test
    public void getNestedObjectWithValues() {
        Map<String, String> json = RestAssured.get(BASE_URL + RATE_LIMIT_URL).getBody().jsonPath().get("resources.core");
        System.out.println(json);
    }

    @Test
    public void getNestedObjectFieldValue() {
        Integer fieldValue = RestAssured.get(BASE_URL + RATE_LIMIT_URL).getBody().jsonPath().get("resources.core.limit");
        System.out.println(fieldValue);
    }

    @Test
    public void getNestedObjectFieldValue2() {
        RestAssured.get(BASE_URL + RATE_LIMIT_URL)
                .then()
                .body("resources.core.limit", equalTo(60))
                .body(containsString("resources"))
                .body(containsString("integration_manifest"));
    }

    @Test
    public void rootPathTest() {
        RestAssured.get(BASE_URL + RATE_LIMIT_URL)
                .then()
                .rootPath("resources.core")
                .body("limit", equalTo(60))
                .body("remaining", equalTo(60))
                .body("resource", equalTo("core"))
                .rootPath("resources.search")
                .body("limit", equalTo(10))
                .body("resource", equalTo("search"));
    }

    @Test
    public void getNestedObjectFieldValueAndCompareWithUrl() {
        RestAssured.get(BASE_URL + "/users/OlehHalush")
                .then()
                .body("url", response -> Matchers.containsString(response.body().jsonPath().get("login")));
    }

    @Test
    public void getObjectFieldValue() {
        RestAssured.get(BASE_URL + "/users/OlehHalush")
                .then()
                .body("node_id", containsString("MDQ6VXNlcjIzMTY1Nzc4"));
    }

    @Test
    public void matchingCollectionOfItems() {
        RestAssured.get(BASE_URL + "/users?page=1")
                .then()
                .body("id", hasItems(3, 6, 1));
    }

}
