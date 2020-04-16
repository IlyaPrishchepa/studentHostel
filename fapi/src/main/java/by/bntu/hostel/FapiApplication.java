package by.bntu.hostel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class FapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FapiApplication.class, args);
    }

}
