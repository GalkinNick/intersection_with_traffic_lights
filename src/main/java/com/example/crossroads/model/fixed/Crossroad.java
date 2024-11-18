package com.example.crossroads.model.fixed;

import com.example.crossroads.events.TrafficLightListener;
import com.example.crossroads.model.moving.Car;
import com.example.crossroads.model.moving.Pedestrian;

import java.util.ArrayList;
import java.util.List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Crossroad {

    private final List<TrafficLight> trafficLights = new ArrayList<>();

    public List<TrafficLight> getTrafficLights(){
        return trafficLights;
    }

    public Crossroad(String args){
        int MAX_CAR_TRAFFIC_LIGHT = 4;
        for (int i = 0; i < MAX_CAR_TRAFFIC_LIGHT; i++){
            CarTrafficLight carTrafficLight = new CarTrafficLight(i);
            carTrafficLight.cameraRecordedInQueue(new Car(i));
            trafficLights.add(carTrafficLight);
        }
        int MAX_PEDESTRIAN_TRAFFIC_LIGHT = 8;
        for (int j = 0; j < MAX_PEDESTRIAN_TRAFFIC_LIGHT; j++){
            PedestrianTrafficLight pedestrianTrafficLight = new PedestrianTrafficLight(j);
            pedestrianTrafficLight.cameraRecordedInQueue(new Pedestrian(j));
            trafficLights.add(pedestrianTrafficLight);
        }
    }


    public Crossroad(){
        TrafficLightListener trafficLightListener = new TrafficLightListener(this);

        CarTrafficLight carTrafficLight = new CarTrafficLight(0);
        carTrafficLight.cameraRecordedInQueue(new Car(0));
        //trafficLightListener.actionPerformed(carTrafficLight.createContainer());


        CarTrafficLight carTrafficLight1 = new CarTrafficLight(1);
        carTrafficLight1.cameraRecordedInQueue(new Car(1));
        carTrafficLight1.cameraRecordedInQueue(new Car(2));

        CarTrafficLight carTrafficLight2 = new CarTrafficLight(2);
        carTrafficLight2.cameraRecordedInQueue(new Car(3));
        carTrafficLight2.cameraRecordedInQueue(new Car(4));

        CarTrafficLight carTrafficLight3 = new CarTrafficLight(3);
        carTrafficLight3.cameraRecordedInQueue(new Car(5));
        carTrafficLight3.cameraRecordedInQueue(new Car(6));

        trafficLights.add(carTrafficLight);
        trafficLights.add(carTrafficLight1);
        trafficLights.add(carTrafficLight2);
        trafficLights.add(carTrafficLight3);

        PedestrianTrafficLight pedestrianTrafficLight = new PedestrianTrafficLight(0);
        pedestrianTrafficLight.cameraRecordedInQueue(new Pedestrian(0));
        pedestrianTrafficLight.cameraRecordedInQueue(new Pedestrian(1));

        PedestrianTrafficLight pedestrianTrafficLight1 = new PedestrianTrafficLight(1);
        pedestrianTrafficLight1.cameraRecordedInQueue(new Pedestrian(2));
        pedestrianTrafficLight1.cameraRecordedInQueue(new Pedestrian(3));
        pedestrianTrafficLight1.cameraRecordedInQueue(new Pedestrian(4));

        PedestrianTrafficLight pedestrianTrafficLight2 = new PedestrianTrafficLight(2);

        PedestrianTrafficLight pedestrianTrafficLight3 = new PedestrianTrafficLight(3);
        pedestrianTrafficLight3.cameraRecordedInQueue(new Pedestrian(5));
        pedestrianTrafficLight3.cameraRecordedInQueue(new Pedestrian(6));

        PedestrianTrafficLight pedestrianTrafficLight4 = new PedestrianTrafficLight(4);

        PedestrianTrafficLight pedestrianTrafficLight5 = new PedestrianTrafficLight(5);

        PedestrianTrafficLight pedestrianTrafficLight6 = new PedestrianTrafficLight(6);

        PedestrianTrafficLight pedestrianTrafficLight7 = new PedestrianTrafficLight(7);
        pedestrianTrafficLight7.cameraRecordedInQueue(new Pedestrian(7));
        pedestrianTrafficLight7.cameraRecordedInQueue(new Pedestrian(8));

        trafficLights.add(pedestrianTrafficLight);
        trafficLights.add(pedestrianTrafficLight1);
        trafficLights.add(pedestrianTrafficLight2);
        trafficLights.add(pedestrianTrafficLight3);
        trafficLights.add(pedestrianTrafficLight4);
        trafficLights.add(pedestrianTrafficLight5);
        trafficLights.add(pedestrianTrafficLight6);
        trafficLights.add(pedestrianTrafficLight7);
    }
}
