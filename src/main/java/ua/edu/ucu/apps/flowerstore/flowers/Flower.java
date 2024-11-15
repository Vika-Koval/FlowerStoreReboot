package ua.edu.ucu.apps.flowerstore.flowers;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @Getter @Setter @Entity @NoArgsConstructor
public class Flower extends Item{
    @Id
    private int id;
    private double price;
    private double sepalLength;
    private FlowerColor color;
    private FlowerType flowerType;

    public Flower(Flower otherFlower) {
        this.price = otherFlower.price;
        this.sepalLength = otherFlower.sepalLength;
        this.color = otherFlower.color;
        this.flowerType = otherFlower.flowerType;
    }

    public String getColor() {
        return color.toString();
    }

    public Flower(double d, double e, FlowerColor red, FlowerType tulip) {
    }
}

