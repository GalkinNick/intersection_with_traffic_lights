package com.example.crossroads;

import com.example.crossroads.model.fixed.Crossroad;

public class Main {

    public static void main(String[] args) {

        Crossroad crossroad = new Crossroad();
        crossroad.getTrafficLights().forEach(System.out::println);

    }
}
