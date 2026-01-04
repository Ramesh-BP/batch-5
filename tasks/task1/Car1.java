import java.util.Scanner;

public class Car1 {
    String brand;
    String model;
    double price;
    
   void getDetails() {
        Scanner sc1 = new Scanner(System.in);

        System.out.print("Enter Car Brand: ");
        brand = sc1.nextLine();

        System.out.print("Enter Car Model: ");
        model = sc1.nextLine();

        System.out.print("Enter Car Price: ");
        price = sc1.nextDouble();
    }
    void displayDetials(){
        System.out.println("\n--- Car Details ---");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : $" + price);
    }

    public static void main(String[] args) {
                                //new Car().getDetails();
                                //new Car().displayDetials();
        Car1 c1=new Car1();
        c1.getDetails();
        c1.displayDetials();
    }
}