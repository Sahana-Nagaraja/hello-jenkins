package com.demo.hellojenkins;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloJenkinsApplication {

    public static String message;

    @Value("${welcome.message}")
    public void setMessage(String msg) {
        message = msg;
    }
    public static void main(String[] args) {
        SpringApplication.run(HelloJenkinsApplication.class, args);
        System.out.println("Hello Jenkins from the test-branch");
        System.out.println(message);
        System.out.println("......Stopping the application");
        System.exit(0);
    }
}
