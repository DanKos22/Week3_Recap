package ie.atu.week3_recap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Week3RecapApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week3RecapApplication.class, args);
    }

}
