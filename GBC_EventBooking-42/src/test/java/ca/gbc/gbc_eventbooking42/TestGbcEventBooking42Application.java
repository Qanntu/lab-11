package ca.gbc.gbc_eventbooking42;

import org.springframework.boot.SpringApplication;

public class TestGbcEventBooking42Application {

    public static void main(String[] args) {
        SpringApplication.from(GbcEventBooking42Application::main).with(TestcontainersConfiguration.class).run(args);
    }

}
