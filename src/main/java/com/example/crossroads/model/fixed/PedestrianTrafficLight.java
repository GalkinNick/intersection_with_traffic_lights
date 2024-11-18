package com.example.crossroads.model.fixed;

import com.example.crossroads.events.TrafficLightListener;
import com.example.crossroads.model.moving.Pedestrian;
import lombok.Getter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class PedestrianTrafficLight extends TrafficLight<Pedestrian> {

    @Getter
    private final List<Pedestrian> pedestrians = new ArrayList<>();

    public PedestrianTrafficLight(int id) {
        super(id);
    }

    @Override
    public void cameraRecordedInQueue(Pedestrian roadUser) {
        pedestrians.add(roadUser);
    }

}
