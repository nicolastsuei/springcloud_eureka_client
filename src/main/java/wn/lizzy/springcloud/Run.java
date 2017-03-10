package wn.lizzy.springcloud;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Eureka客户端主启动
 * Run.java
 * @author cuilj  2017年3月10日--上午9:47:15
 *
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableAutoConfiguration
public class Run {
    @RequestMapping("/")
    public String home() {
        return "Hello world";
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(Run.class).web(true).run(args);
    }
}
