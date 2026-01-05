class Rectangle5 {
    double height;
    double width;

    Rectangle5(double height, double width) {
        this.height = height;
        this.width = width;
    }
    double calculateArea() {
        double x=height *width;
        System.out.println("area :" + x);
        return 0;
    }

    double calculatePerimeter() { 
        return 2 * (height + width);
    }

    public static void main(String[] args) {
        Rectangle5 rect = new Rectangle5(5, 5);

        rect.calculateArea();
        System.out.println("Perimeter: " + rect.calculatePerimeter());
    }
}
// -----------------------------------------------------------------------------------------------------
// simple code using scanner and without constructor

// import java.util.Scanner;

// class Rectangle5 {

//     double length;
//     double width;

//     void calculateArea(double  length,double width) {
//         double area = length * width;
//         System.out.println("Area of Rectangle: " + area);
//     }

//     void calculatePerimeter(double  length,double width) {
//         double perimeter = 2 * (length + width);
//         System.out.println("Perimeter of Rectangle: " + perimeter);
//     }

//     public static void main(String[] args) {
//         Rectangle5 r = new Rectangle5();
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter length of rectangle: ");
//         double length = sc.nextDouble();

//         System.out.print("Enter width of rectangle: ");
//          double width = sc.nextDouble();
    
//         r.calculateArea(length, width);          
//         r.calculatePerimeter(length,width);
//     }
// }

// --------------------------------------------------------------------------------------------------------

// code written in the  main method

// import java.util.Scanner;

// class Rectangle {

//     double length;
//     double width;

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         Rectangle r = new Rectangle();

//         System.out.print("Enter length: ");
//         r.length = sc.nextDouble();

//         System.out.print("Enter width: ");
//         r.width = sc.nextDouble();

//         double area = r.length * r.width;
//         double perimeter = 2 * (r.length + r.width);

//         System.out.println("\nArea of Rectangle: " + area);
//         System.out.println("Perimeter of Rectangle: " + perimeter);
//     }
// }
