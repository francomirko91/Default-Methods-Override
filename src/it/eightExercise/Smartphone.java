package it.eightExercise;

import java.util.Objects;

public class Smartphone implements Cloneable {
    public String brandName;
    public String modelName;
    public int batterymAh;

    private String SmartphonePrice;
    public String producerPrice = SmartphonePrice;
    public String retailPrice = SmartphonePrice;


    @Override
    public String toString() {
        return "Smartphone{" +
                "brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", batterymAh=" + batterymAh +
                ", SmartphonePrice='" + SmartphonePrice + '\'' +
                ", producerPrice='" + producerPrice + '\'' +
                ", retailPrice='" + retailPrice + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return batterymAh == that.batterymAh && Objects.equals(brandName, that.brandName) && Objects.equals(modelName, that.modelName) && Objects.equals(SmartphonePrice, that.SmartphonePrice) && Objects.equals(producerPrice, that.producerPrice) && Objects.equals(retailPrice, that.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymAh, SmartphonePrice, producerPrice, retailPrice);
    }


    @Override
    public Smartphone clone() {
        Smartphone clonedSmartphone = new Smartphone();
        clonedSmartphone.producerPrice = this.producerPrice;
        clonedSmartphone.retailPrice = this.retailPrice;
        return clone();


    }


}
