package com.example.demodata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;

import javax.annotation.PostConstruct;

/**
 * @author GUAM
 * 06.01.2020 - 17:51
 */
@Profile({"INMEMORY"})
@Configuration
@Order(value = -1)
public class DbInitializerFromJar {
    protected static Logger logger = LoggerFactory.getLogger(DbInitializerFromJar.class);
    public static final String HELLO = "HELLO";

    @PostConstruct
    public void createDbStructure() {
        logger.info("add WORLD into db");
        FakeInMemoryDb.data.put(HELLO, "WORLD");
    }
    
}
