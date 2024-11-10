package se.davand.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Motorbike {
    private int id;
    private String make;
    private String model;
    private int year;
}