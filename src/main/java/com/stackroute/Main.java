package com.stackroute;

import com.stackroute.config.AppConfig;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//public class Main {
//public static void main(String[] args){
//
//    AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext();
//    context.register(AppConfig.class);
//    context.refresh();
//    System.out.println(context.getBean("movie"));
//
//}
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        Movie movie=(Movie) context.getBean("movie");
        System.out.println(movie.getActor().toString());

    }
}

