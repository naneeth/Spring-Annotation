package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.stackroute")
public class AppConfig {
    @Bean("movie")
    public Movie movie(){
        return new Movie(getActor());
    }

    @Bean("actor")
    public Actor getActor(){
        return new Actor("nan","male",22);
    }
    @Bean("actor1")
    public Actor getActor1(){
        return new Actor("naneeth","male",22);
    }

}