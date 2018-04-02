package com.pineconecredit.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by IntelliJ IDEA.
 * User: ZhouRunBin
 * Date: 2018/4/2 0002
 * Time: 22:45
 * Description:
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class PccZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(PccZuulApplication.class, args);
    }

}
