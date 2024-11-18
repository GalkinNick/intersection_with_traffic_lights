package com.example.crossroads.model.fixed;

import com.example.crossroads.dto.response.ContainerWithTrafficLightData;
import com.example.crossroads.enums.CarTrafficLightState;
import com.example.crossroads.events.TrafficLightListener;
import com.example.crossroads.model.moving.Car;
import lombok.Getter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class CarTrafficLight extends TrafficLight<Car>{

    @Getter
    private final List<Car> cars = new ArrayList<>();

    public CarTrafficLight(int id) {
        super(id);
    }

    @Override
    public void cameraRecordedInQueue(Car roadUser) {
        cars.add(roadUser);
    }

    public ContainerWithTrafficLightData createContainer(){
        ContainerWithTrafficLightData container = new ContainerWithTrafficLightData();
        container.setId(getId());
        container.setCurrentState(CarTrafficLightState.RED.toString());
        container.setQuantityInQueue(cars.get(0).getId());
        return container;
    }


}
