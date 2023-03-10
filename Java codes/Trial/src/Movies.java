import java.util.Scanner;

class Movies
{
    public static void main(String[] args) {
        int age;
        String name;
        char gender;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = s.nextLine();

        Scanner scana = new Scanner(System.in);
        System.out.println("Enter your age :");
        age = scana.nextInt();

        Scanner scang = new Scanner(System.in);
        System.out.println("Enter your gender :");
        gender = scang.next().charAt (0);

        System.out.println("CUSTOMER INFORMATION.");
        System.out.println("Name:"+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);

        if (age < 18)
        {
            System.out.println("You are too young too watch this movie!!!");
        }
        else
        {
            System.out.println("You can enter for the movie.");
        }
    }
}