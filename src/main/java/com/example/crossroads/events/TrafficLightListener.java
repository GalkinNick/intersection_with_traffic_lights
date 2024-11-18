package com.example.crossroads.events;

import com.example.crossroads.dto.response.ContainerWithTrafficLightData;
import com.example.crossroads.model.fixed.Crossroad;
import com.example.crossroads.model.fixed.TrafficLight;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrafficLightListener implements ActionListener {


    private Crossroad crossroad;

    public TrafficLightListener(Crossroad crossroad){
        this.crossroad = crossroad;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object command = e.getSource();
        System.out.println(command);

        // когда загорелся зеленый у светофора и он пропустил или машину или человека,
        // то светофор отправил всем остальным события с информацией
        // все светофоры получают и записывают контейнер с данными в событии


        // записываем контейнер в очередь для всех светофоров
        crossroad.getTrafficLights().forEach(trafficLight ->
                trafficLight.getContainers().add(new ContainerWithTrafficLightData()));
    }
}
