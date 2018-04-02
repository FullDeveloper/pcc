package com.pineconecredit.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: ZhouRunBin
 * Date: 2018/4/2 0002
 * Time: 22:41
 * Description:
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class PccApiApplication {

    @Value("${cloud.title}")
    private String title;


    public static void main(String[] args) {
        SpringApplication.run(PccApiApplication.class, args);
    }

    @RequestMapping(value = "/hi")
    public String hi(){

        return "hello zuul" + title;
    }

}
