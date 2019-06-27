package com.insuresmart.easypoidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = {"com.insuresmart.easypoidemo"})
@EnableSwagger2
public class EasypoiDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasypoiDemoApplication.class, args);
    }

}
