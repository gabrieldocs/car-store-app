package org.example.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.interfaces.CarInterface;

@Getter @Setter @ToString
public class Car implements CarInterface {

    protected String make;
    protected String model;
    protected int year;
    protected double mph;
    protected String color;

    protected Directions direction;

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void honk() {

    }

    @Override
    public void moveForward() {
        this.direction = Directions.FORWARD;
    }

    @Override
    public void moveBackward() {
        this.direction = Directions.BACKWARD;
    }

    @Override
    public void turnLeft() {
        this.direction = Directions.LEFT;
    }

    @Override
    public void turnRight() {
        this.direction = Directions.RIGHT;
    }
}
