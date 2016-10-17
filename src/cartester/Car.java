package cartester;

public class Car {
    
    private String brand, model, hue;
    private int year, price, speed;
    
    //constructors
    public Car() {
        //default
        brand = "unknown brand";
        model = "unknown model";
        hue = "old mustard";
        year = 1984;
        //in thousands
        price = 200;
        //in KM/h
        speed = 80;
    }

    public Car(String br, String mo, String hu, int ye, int pr, int sp) {
        //constructors are taken from loop to create objects
        brand = br;
        model = mo;
        hue = hu;
        year = ye;
        price = pr;
        speed = sp;
    }

    public String toString() {
        //creates object in paragraph form
        //puts price in thousands and speed in KM/h
        String output = "Brand: " + brand + "\n";
        output += "Model: " + model + "\n";
        output += "Color: " + hue + "\n";
        output += "Year: " + year + "\n";
        output += "Price: $" + price + ",000" + "\n";
        output += "Speed: " + speed + "KM/h" + "\n";
        return (output);
    }
}
