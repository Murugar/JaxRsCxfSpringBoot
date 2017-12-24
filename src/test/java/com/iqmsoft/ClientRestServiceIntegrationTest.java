package com.iqmsoft;

import static com.jayway.restassured.RestAssured.given;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iqmsoft.config.Config;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Config.class)
@WebIntegrationTest(randomPort = true)
public class ClientRestServiceIntegrationTest {
	@Value("${local.server.port}") private int port;
	
	@Before
	public void setUp() {
		RestAssured.port = port;
	}
	
	@Test
	public void testListOfPersonsIsBeingReturnedSuccessfuly() {
		given()
			.when() 
			.contentType(ContentType.JSON)
			.get("/api/client")
			.then()
			.statusCode(200)
			.log()
			.ifValidationFails();
	}
}