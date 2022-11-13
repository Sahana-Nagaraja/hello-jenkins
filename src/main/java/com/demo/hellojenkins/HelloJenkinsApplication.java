package com.demo.hellojenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloJenkinsApplication {


    public static void main(String[] args) {
        SpringApplication.run(HelloJenkinsApplication.class, args);
		System.out.println("Hello Jenkins from the test-branch");
//        System.exit(0);

	}

}
