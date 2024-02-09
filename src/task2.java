import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int birthMonth = 0;

        System.out.println("Enter the number of a month (e.g. 1 for January): ");

        if(in.hasNextInt()){
            birthMonth = in.nextInt();
            in.nextLine();
        }

        if (birthMonth < 1) {
            System.out.println("Please enter a correct month");
        } else if (birthMonth > 12) {
            System.out.println("Please enter a correct month");
        } else {
            System.out.println("Your birth month is: " + birthMonth);
        }
    }
}
