package ourbusinessproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OurbusinessprojectApplication {
    // fix #2.1.10 non regression OK
    public static void main(String[] args) {
        SpringApplication.run(OurbusinessprojectApplication.class, args);
    }

}
