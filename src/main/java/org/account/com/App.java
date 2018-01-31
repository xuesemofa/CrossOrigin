package org.account.com;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

// Spring Boot 应用的标识
@SpringBootApplication
@MapperScan("org.account.com.mapper")
public class App {//extends SpringBootServletInitializer {
    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    //     war
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        // TODO Auto-generated method stub
//        return builder.sources(App.class);
//    }

}
