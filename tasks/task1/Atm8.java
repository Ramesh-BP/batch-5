import java.util.Scanner;

public class Atm8 {
    private int pin;

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Atm8 atm = new Atm8();

    
        System.out.print("Set your PIN: ");  //set pin
        int setPin = sc.nextInt();
        atm.setPin(setPin);

    
        System.out.print("Enter PIN to access ATM: "); // valiate pin
        int ePin = sc.nextInt();

        if (atm.getPin() == ePin) {
            System.out.println("PIN verified. Access granted.");
        } else {
            System.out.println("Incorrect PIN. Access denied.");
        }
        sc.close();
    }
}
