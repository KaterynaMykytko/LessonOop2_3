package org.courses.ex2_3;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car(){
        this.year = 2021;
        this.speed = 411;
        this.weight = 1200;
        this.color = "Black";
    }

    public Car(int year){
        this.year = year;
        this.speed = 411;
        this.weight = 1200;
        this.color = "Black";
    }

    public Car(int year, double speed){
        this.year = year;
        this.speed = speed;
        this.weight = 1200;
        this.color = "Black";
    }

    public Car(int year, double speed, int weight){
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = "Black";
    }

    public Car(int year, double speed, int weight, String color){
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public double getSpeed(){
        return speed;
    }

    public int getWeight(){
        return weight;
    }

    public String getColor(){
        return color;
    }
}
