package com.markuvinicius.graph.springrestnativeneo4j.configuration;


import org.neo4j.ogm.session.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Neo4JConfiguration {

    @Bean
    public SessionFactory configuration(){
        org.neo4j.ogm.config.Configuration configuration = new org.neo4j.ogm.config.Configuration.Builder()
                                                                                                    .uri("bolt://localhost")
                                                                                                    .build();

        return new SessionFactory(configuration, "com.markuvinicius.graph.springrestnativeneo4j.domain");
    }
}
