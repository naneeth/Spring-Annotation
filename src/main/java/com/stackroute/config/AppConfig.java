package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.stackroute")
public class AppConfig {
//    @Bean("movie")
//    public Movie getMovie(){
//        return new Movie(getActor());
//    }
//
//    @Bean("actor")
//    public Actor getActor(){
//        return new Actor();
//    }

}