/**
 * Adorsys
 * 27.01.2017
 */
package de.janosch.springbootraml.rest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ProfileResourceTest
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ProfileRESTTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getV1Profile() {
        String body = this.restTemplate.getForObject("/v1/profile", String.class);
        assertThat(body).isEqualTo("[{\"name\":\"Testuser\"}]");
    }

}