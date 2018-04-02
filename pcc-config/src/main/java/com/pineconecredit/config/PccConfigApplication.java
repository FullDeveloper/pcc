package com.pineconecredit.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by IntelliJ IDEA.
 * User: ZhouRunBin
 * Date: 2018/4/2 0002
 * Time: 22:52
 * Description:
 */
@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class PccConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(PccConfigApplication.class, args);
    }

}
