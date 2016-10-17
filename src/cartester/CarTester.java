/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartester;

import java.util.*;

public class CarTester {

    public static void main(String[] args) {
    //This array will hold all car objects
    ArrayList<Car> cars = new ArrayList();
    /**These arrays contain all brands names, models and colors
     * Each element is randomly selected from the array to create a new object
     */
    ArrayList<String> brands = new ArrayList<String>(Arrays.asList("Acura", "Alfa Romeo", "Aston Martin", "Audi", "Bentley", "BMW", "Bugatti", "Buick", "Cadillac", "Chevrolet", "Chrysler", "Citroen", "Dodge", "Ferrari", "Fiat", "Ford", "Geely", "General Motors", "GMC", "Honda", "Hyundai", "Infiniti", "Jaguar", "Jeep", "Kia", "Koenigsgegg", "Lamborghini", "Land Rover", "Lexus", "Maserati", "Mazda", "Mclaren", "Mercedez-Benz", "Mini", "Mitsubishi", "Nissan", "Pagani", "Peugeot", "Prosche", "Ram", "Renault", "Rolls Royce", "Saab", "Subaru", "Suzuki", "Tata Motors", "Tesla", "Toyota", "Volkswagen", "Volvo"));
    ArrayList<String> models = new ArrayList<String>(Arrays.asList("Highlander", "Land Cruiser 200", "Prado", "Rav4", "Sequoia", "Venza", "Tundra", "Aygo", "Allion", "Aurion", "Auris", "Avalon", "Belta", "Camry", "Century", "Corolla Altis", "Crown", "Etios", "iQ", "Mark X", "Matrix", "Premio", " Vios Exclusive", "Wigo", "Yaris", "Vitz", "Condor", "Comfort", "Innova", "Ipsum", "Porte", "Ractis", "Sienta", "Verso", "Alphard", "Coaster", "Hilux", "Previa", "Sienna", "Tacoma", "Paseo", "Starlet", "Supra", "Celica", "Carina", "MR2"));
    ArrayList<String> colors = new ArrayList<String>(Arrays.asList("Red","Orange","Burgandy","Brown","Yellow","Lime","Green","Teal","Blue","violet","Purple","Black","White","Grey","Chrome"));
    //Loop ensures 10 objects will be created
        for (int j = 0; j < 10; j++) {
            //random numbers are picked to determine constructors
            int n1 = (int) (Math.random() * brands.size());
            String b = brands.get(n1);
            int n2 = (int) (Math.random() * models.size());
            String n = models.get(n2);
            int n3 = (int) (Math.random() * colors.size());
            String c = colors.get(n3);
            //Once brand, model and color are determined, random numbers create year, price and speed within constructor
            Car car1 = new Car(b, n, c, (int) (Math.random() * 50) + 1960, (int) (Math.random() * 300) + 200, (int) (Math.random() * 60) + 80);
            //Element is finally added to array, loop repeats
            cars.add(car1);
        }
        for(int i = 0; i < cars.size(); i++){
        //toString function creates a pragraph format of object
        System.out.println(cars.get(i).toString());
        //seperate
        System.out.println("---------------");
        }
    }

}
