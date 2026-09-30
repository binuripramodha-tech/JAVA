public class Laptop {
    // Variable declaration
    String brand;
    String model;
    double price;

    public static void main(String[] args) {
        //Creat the first Laptop object
        Laptop laptop1 = new Laptop();
        laptop1.brand = "Dell";
        laptop1.model = "XPS 13";
        laptop1.price = 1200.50;

        //Creat the second Laptop object
        Laptop laptop2 = new Laptop();
        laptop2.brand = "Apple";
        laptop2.model = "MacBook Air";
        laptop2.price = 999.99;

        //Display details of laptop1
        System.out.println("Laptop 1 Details:");
        System.out.println("Brand: " + laptop1.brand);
        System.out.println("Model: " + laptop1.model);
        System.out.println("Price: $" + laptop1.brand);

        System.out.println(); // Blank line for spacing

        //Display details of laptop2
        System.out.println("Laptop 2 Details:");
        System.out.println("Brand: " + laptop2.brand);
        System.out.println("Model: " + laptop2.model);
        System.out.println("Price: $" + laptop2.brand);
        


    }


}
