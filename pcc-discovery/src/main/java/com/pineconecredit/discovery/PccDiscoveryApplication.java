package com.pineconecredit.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by IntelliJ IDEA.
 * User: ZhouRunBin
 * Date: 2018/4/2 0002
 * Time: 22:14
 * Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class PccDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(PccDiscoveryApplication.class, args);
    }

}
