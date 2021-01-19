package technicalblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@ComponentScan
public class TechnicalBlogApplication {

    public static void main(String [] args){
        SpringApplication.run(TechnicalBlogApplication.class, args);
    }

}
