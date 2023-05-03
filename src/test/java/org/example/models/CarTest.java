package org.example.models;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CarTest {

    @Test
    public void testMoveForward() {
        Car direction = new Car();
        direction.moveForward();
        assertEquals(Directions.FORWARD, direction.getDirection());
    }

    @Test
    public void testMoveBackward() {
        Car direction = new Car();
        direction.moveBackward();
        assertEquals(Directions.BACKWARD, direction.getDirection());
    }

    @Test
    public void testTurnLeft() {
        Car direction = new Car();
        direction.turnLeft();
        assertEquals(Directions.LEFT, direction.getDirection());
    }

    @Test
    public void testTurnRight() {
        Car direction = new Car();
        direction.turnRight();
        assertEquals(Directions.RIGHT, direction.getDirection());
    }
}
