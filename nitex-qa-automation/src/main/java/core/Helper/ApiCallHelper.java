package core.Helper;

import io.restassured.RestAssured;
import io.restassured.config.HttpClientConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;
import io.restassured.response.Response;
import org.apache.http.params.CoreConnectionPNames;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class ApiCallHelper {

    public static Response getCall(HashMap<String, Object> headers, String path) {
        System.out.println("Control here in api call");
        System.out.println(RestAssured.baseURI + path);
        RestAssuredConfig config = RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation().allowAllHostnames())
                .httpClient(HttpClientConfig.httpClientConfig()
                        .setParam(CoreConnectionPNames.CONNECTION_TIMEOUT, 3000));
        //Response getResponse = given().urlEncodingEnabled(false).headers(headers).auth().preemptive().basic("username","").when().get(path);
        Response getResponse = given().relaxedHTTPSValidation().urlEncodingEnabled(false).headers(headers).when().get(path);

        return getResponse;

    }
    public static Response postCall(HashMap<String, Object> headers, String body, String path) throws NoSuchAlgorithmException, KeyManagementException {
        System.out.println(path);
        System.out.println(headers);


        //Added RestAssuredConfig ConnectionTimeout here for POC.
        RestAssuredConfig config = RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation().allowAllHostnames())
                .httpClient(HttpClientConfig.httpClientConfig()
                        .setParam(CoreConnectionPNames.CONNECTION_TIMEOUT, 3000));


        Response postResponse;
        if (body != null) {


            //postResponse = given().urlEncodingEnabled(false).config(config).headers(headers).auth().preemptive().basic(username,"").when().body(body).post(path);
            postResponse = given().relaxedHTTPSValidation().urlEncodingEnabled(false).config(config).headers(headers).when().body(body).post(path);
            return postResponse;
        } else {
            postResponse = given().config(config).headers(headers).when().body(body).post(path);
            return postResponse;
        }
    }


    public static Response putCall(HashMap<String, Object> headers, String body, String path) throws NoSuchAlgorithmException, KeyManagementException {
        System.out.println(path);
        System.out.println(headers);



        //Added RestAssuredConfig ConnectionTimeout here for POC.
        RestAssuredConfig config = RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation().allowAllHostnames())
                .httpClient(HttpClientConfig.httpClientConfig()
                        .setParam(CoreConnectionPNames.CONNECTION_TIMEOUT, 3000));


        Response postResponse;
        if (body != null) {


            //postResponse = given().urlEncodingEnabled(false).config(config).headers(headers).auth().preemptive().basic(username,"").when().body(body).post(path);
            postResponse = given().relaxedHTTPSValidation().urlEncodingEnabled(false).config(config).headers(headers).when().body(body).put(path);
            return postResponse;
        } else {
            postResponse = given().config(config).headers(headers).when().body(body).post(path);
            return postResponse;
        }
    }

    ///////////////Delete API/////////////////////

    public static Response deleteCall(HashMap<String, Object> headers, String body, String path) throws NoSuchAlgorithmException, KeyManagementException {
        System.out.println(path);
        System.out.println(headers);



        //Added RestAssuredConfig ConnectionTimeout here for POC.
        RestAssuredConfig config = RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation().allowAllHostnames())
                .httpClient(HttpClientConfig.httpClientConfig()
                        .setParam(CoreConnectionPNames.CONNECTION_TIMEOUT, 3000));


        Response postResponse;
        if (body != null) {


            //postResponse = given().urlEncodingEnabled(false).config(config).headers(headers).auth().preemptive().basic(username,"").when().body(body).post(path);
            postResponse = given().relaxedHTTPSValidation().urlEncodingEnabled(false).config(config).headers(headers).when().body(body).delete(path);
            return postResponse;
        } else {
            postResponse = given().config(config).headers(headers).when().body(body).delete(path);
            return postResponse;
        }
    }

}
