package com.innominds;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

//@formatter:off
/**
 * This is the configuration server to centralize the configuration properties
 *
 *###################################
 *  CENTRALIZED LOG CONFIGURATION
 *###################################
 *  This application configured with ELK Stack for centralized logging
 *
 *  1. brew install logstash
 *  2. brew install elasticsearch
 *  3. brew install kibana
 *  4. elasticsearch   => to start on port 9200
 *  5. logstash -f logstash.conf on port 9600
 *  6. kibana on port 5601
 *
 *###################################
 *
 *
 *
 *
 * @author ThirupathiReddy V
 */
//@formatter:on
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

    public static void main( String[] args ) {

        // SpringApplication.run( ConfigServerApplication.class, args );
        new SpringApplicationBuilder( ConfigServerApplication.class ).run( args );

    }
}
