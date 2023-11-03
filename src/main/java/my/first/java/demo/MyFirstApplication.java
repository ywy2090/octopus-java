package my.first.java.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;

@SpringBootApplication(exclude = JtaAutoConfiguration.class)
@MapperScan("sharding.sphere.demo.mapper")
public class MyFirstApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyFirstApplication.class, args);
    }
}
