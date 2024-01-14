package model.entities;

import model.exceptions.AthleteException;

public class Athlete {
    private String name;
    private char gender;
    private Double height;
    private Double weight;

    public Athlete(){
    }

    public Athlete(String name, char gender, Double height, Double weight) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void validate(String name, char gender, Double height, Double weight){
        if((gender != 'M') && (gender != 'F')) {
            throw new IllegalArgumentException ("Gênero invalido, por favor digite novamente: ");
        }

        if (height <= 0.0) {
            throw new AthleteException("Altura invalida. ");
        }

        if (weight <= 0.0) {
            throw new AthleteException("Peso invalido.");
        }

    }


}
