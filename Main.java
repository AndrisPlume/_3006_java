import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

// correct login data
        String epasts = "rcs@gmail.com";
        String pass = "1234";

        Scanner scan = new Scanner(System.in);

        System.out.println("Ludzu Ievadi epastu: ");
        String userName = scan.nextLine();
        System.out.println("Ludzu Ievadi paroli: ");
        String userPass = scan.nextLine();

        if (epasts.equals(userName)) {
            if (pass.equals(userPass)) {
                System.out.println("Sveiki, " + epasts + ", Tu esi ielogojies sistema");
            } else {
                System.out.println("parole vai epasts nav pareizs");
            }
        }
        else {
            System.out.println("parole vai epasts nav pareizs!");
        }

    }
}
