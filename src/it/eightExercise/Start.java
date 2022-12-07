package it.eightExercise;

public class Start {
    public static void main(String[] args) {

        SmartphonePrice producer1 = new SmartphonePrice("producer1", 10.5);
        SmartphonePrice producer2 = new SmartphonePrice("producer2", 15.5);

        SmartphonePrice retail1 = new SmartphonePrice("retail1", 122.6);
        SmartphonePrice retail2 = new SmartphonePrice("retail2", 123.7);


        Smartphone smartphone1 = new Smartphone("iphone", "13", 5000, producer1, retail1);
        Smartphone smartphone2 = new Smartphone("samsung", "19", 2000, producer2, retail2);


        System.out.println(smartphone1);
        System.out.println(smartphone2);


        System.out.println(smartphone1.equals(smartphone2));

        try {
            Smartphone smartPhoneCloned = smartphone2.clone();
            System.out.println(smartPhoneCloned);
            System.out.println(smartphone2.equals(smartPhoneCloned));
        } catch (Exception exception) {
            exception.printStackTrace();
        }


    }
}
