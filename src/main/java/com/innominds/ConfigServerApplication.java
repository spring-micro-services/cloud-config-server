package com.innominds;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * This is the configuration server to centralize the configuration properties
 *
 * @author ThirupathiReddy V
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

    public static void main( String[] args ) {

        // SpringApplication.run( ConfigServerApplication.class, args );

        new SpringApplicationBuilder( ConfigServerApplication.class ).run( args );

    }
}
