import java.util.Scanner;

public class Car1 {
    String brand;
    String model;
    double price;

    public Car1(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    

    
    
    // void getDetails() {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Enter Car Brand: ");
    //     brand = sc.nextLine();

    //     System.out.print("Enter Car Model: ");
    //     model = sc.nextLine();

    //     System.out.print("Enter Car Price: ");
    //     price = sc.nextDouble();
    // }
    void displayDetials(){
        System.out.println("\n--- Car Details ---");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : $" + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Car Brand: ");
      String  brand = sc.nextLine();

        System.out.print("Enter Car Model: ");
       String model = sc.nextLine();

        System.out.print("Enter Car Price: ");
      double  price = sc.nextDouble();
                                //new Car().getDetails();
                                //new Car().displayDetials();
        Car1 c1=new Car1(brand, model,price);
        // c1.getDetails();
        c1.displayDetials();
    }
}