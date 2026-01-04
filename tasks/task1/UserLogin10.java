import java.util.Scanner;

public class UserLogin10 {
    
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean validateLogin(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserLogin10 user = new UserLogin10();

       
        System.out.print("Set Username: ");
        user.setUsername(sc.nextLine());

        System.out.print("Set Password: ");
        user.setPassword(sc.nextLine());


        System.out.print("Enter Username: ");
        String u = sc.nextLine();

        System.out.print("Enter Password: ");
        String p = sc.nextLine();

        if (user.validateLogin(u, p)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }

        sc.close();
    }
}

