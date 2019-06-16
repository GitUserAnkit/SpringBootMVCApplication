package com.ankit.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value={ServiceConfig.class,PersistenceConfig.class})
public class RootAppConfig {

}
