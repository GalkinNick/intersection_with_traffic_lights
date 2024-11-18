package com.example.crossroads.model.fixed;

import com.example.crossroads.dto.response.ContainerWithTrafficLightData;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;
import java.util.List;

@Getter
public abstract class TrafficLight<T> implements EventListener {

    private final int id;

    @Setter
    private List<ContainerWithTrafficLightData> containers;

    public TrafficLight(int id){ this.id = id; }

    public abstract void cameraRecordedInQueue(T roadUser);
}
