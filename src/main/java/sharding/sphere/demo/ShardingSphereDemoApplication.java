package sharding.sphere.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;

@SpringBootApplication(exclude = JtaAutoConfiguration.class)
@MapperScan("sharding.sphere.demo.mapper")
public class ShardingSphereDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShardingSphereDemoApplication.class, args);
    }
}
