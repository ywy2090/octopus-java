package myfirstjava.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements ApplicationRunner {

    private static final Logger logger = LoggerFactory.getLogger(MyApplicationRunner.class);

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("" + args);
    }
}
