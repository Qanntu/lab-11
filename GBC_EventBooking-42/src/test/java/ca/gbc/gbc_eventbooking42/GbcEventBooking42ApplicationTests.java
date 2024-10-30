package ca.gbc.gbc_eventbooking42;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class GbcEventBooking42ApplicationTests {

    @Test
    void contextLoads() {
    }

}
