package com.example.demo;

import com.example.demodata.DbInitializerFromJar;
import com.example.demodata.FakeInMemoryDb;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * @author GUAM
 * 06.01.2020 - 17:54
 */
@Configuration
public class MyConfig {
    
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @PostConstruct public void checkFlags() {
        logger.info("checking the flags");
        String flag;
        flag = FakeInMemoryDb.data.get(DbInitializerFromApp.HELLO);
        logger.info("checkFlag from current app: " + flag);
        
        flag = FakeInMemoryDb.data.get(DbInitializerFromJar.HELLO);
        logger.info("checkFlag from dependencies jar: " + flag);
        
    }
}
