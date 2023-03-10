import java.util.Scanner;
public class Watch {
    public static void main(String[] args) {

        int age;

       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter your name: ");
       String name = scanner.nextLine();

       System.out.println("Enter your age: ");
        age = scanner.nextInt();
       scanner.nextLine();//clear the input buffer

        System.out.println("Enter your gender: ");
        String gender = scanner.nextLine();

        if (age < 18)
        {
            System.out.println("Hey " + name + " at your age of " +age + " You are too young to watch this movie!!");
        }
        else
            System.out.println("Hey " + name + " at your age of " +age + " You can watch this movie. Enjoy :).");

}
}