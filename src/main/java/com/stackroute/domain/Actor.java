package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Actor {
    private String name;
    private String gender;
    private int age;

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Value("${actor.name}")
    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    @Value("${actor.gender}")
    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }
    @Value("${actor.age}")
    public void setAge(int age) {
        this.age = age;
    }

    public Actor() {
    }
}
