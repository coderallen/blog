package com.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java8.En;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by Allen on 02/04/2017.
 * coder.allen@hotmail.com
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserSteps implements En {


    public UserSteps() {

        When("^We click button of user List$", () -> {
            System.out.println("Request Done.");
        });
        Then("^Select user data from DB$", () -> {
            System.out.println("Get Data from DB.");
        });
        And("^Shows the user data$", () -> {
            System.out.println("Response Text:");
        });
    }
}
