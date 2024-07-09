class Car {
    String color;
    String model;
    
    void displayDetails() {
        System.out.println("Model: " + model + ", Color: " + color);
    }
}

public class ClassesObjectsDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "Red";
        car1.model = "Tesla Model S";
        
        Car car2 = new Car();
        car2.color = "Blue";
        car2.model = "BMW X5";
        
        car1.displayDetails();
        car2.displayDetails();
    }
}
