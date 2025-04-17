class Stationary {
    String name;
    String brand;
    double price;
    String color;
    String material;

    public Stationary(String name, String brand, double price, String color, String material) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.material = material;
    }

    public void displayStationary() {
        System.out.println("Stationary Details:");
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
    }
}
class Pen extends Stationary {
    String inkType;
    double inkCapacity;
    double length;
    String penType;
    boolean isRefillable;

    public Pen(String name, String brand, double price, String color, String material, 
               String inkType, double inkCapacity, double length, String penType, boolean isRefillable) {
        super(name, brand, price, color, material);
        this.inkType = inkType;
        this.inkCapacity = inkCapacity;
        this.length = length;
        this.penType = penType;
        this.isRefillable = isRefillable;
    }

    public void displayPen() {
        displayStationary();
        System.out.println("Ink Type: " + inkType);
        System.out.println("Ink Capacity: " + inkCapacity);
        System.out.println("Length: " + length + "cm");
        System.out.println("Pen Type: " + penType);
        System.out.println("Refillable: " + isRefillable);
    }
}
class BallPen extends Pen {
    double ballSize;
    String gripMaterial;
    String capType;
    double weight;
    String writingSmoothness;

    public BallPen(String name, String brand, double price, String color, String material, 
                   String inkType, double inkCapacity, double length, String penType, boolean isRefillable,
                   double ballSize, String gripMaterial, String capType, double weight, String writingSmoothness) {
        super(name, brand, price, color, material, inkType, inkCapacity, length, penType, isRefillable);
        this.ballSize = ballSize;
        this.gripMaterial = gripMaterial;
        this.capType = capType;
        this.weight = weight;
        this.writingSmoothness = writingSmoothness;
    }

    public void displayBallPen() {
        displayPen();
        System.out.println("Ball Size: " + ballSize + "mm");
        System.out.println("Grip Material: " + gripMaterial);
        System.out.println("Cap Type: " + capType);
        System.out.println("Weight: " + weight);
        System.out.println("Writing Smoothness: " + writingSmoothness);
    }
}

// Main class
public class MultiLevelInheritanceExample {
    public static void main(String[] args) {
        BallPen ballPen = new BallPen("BallPen", "Pilot", 2.50, "Blue", "Plastic", 
                                      "Gel", 0.5, 14.0, "Retractable", true,
                                      0.7, "Rubber", "Clip-On", 15.0, "Smooth");
        ballPen.displayBallPen();
    }
}
