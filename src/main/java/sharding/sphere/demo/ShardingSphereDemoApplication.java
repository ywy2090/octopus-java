package sharding.sphere.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableScheduling
@EnableTransactionManagement
@MapperScan("sharding.sphere.demo.mapper")
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class ShardingSphereDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShardingSphereDemoApplication.class, args);
    }
}
