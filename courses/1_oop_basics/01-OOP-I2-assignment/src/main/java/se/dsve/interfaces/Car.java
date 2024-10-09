package se.dsve.interfaces;

public interface Car extends Vehicle, Driveable {
    int getDoors();

    void setDoors(int doors);
}

