package review;

import javax.annotation.Resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import Hello.Customer;

@SpringBootApplication
public class ReviewApp {

    public static void main(String[] args) {
        SpringApplication.run(ReviewApp.class, args);
    }

    @Resource
    private ReviewRepository reviewRepository;

    @Resource
    private CategoryRepository catRepository;
    
   
}