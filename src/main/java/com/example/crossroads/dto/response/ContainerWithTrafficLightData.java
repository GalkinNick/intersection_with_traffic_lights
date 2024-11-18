package com.example.crossroads.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContainerWithTrafficLightData {

    private int id;

    private int quantityInQueue;

    private String currentState;
}
