package mk.ukim.finki.mk.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class WpLab1Application {

    public static void main(String[] args) {
        SpringApplication.run(WpLab1Application.class, args);
    }

}