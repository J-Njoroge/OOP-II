import java.util.Scanner;
public class Student {
    public static void main(String args []){

        int mark1, mark2, mark3, mark4, mark5, sum = 0, average;
        String name;
        char grade;

        Scanner nameS = new Scanner(System.in);
        System.out.println("Enter student's name: ");
        name = nameS.nextLine();

        Scanner mark1S = new Scanner(System.in);
        System.out.println("Enter subject 1 marks:");
        mark1 = mark1S.nextInt();

        Scanner mark2S = new Scanner(System.in);
        System.out.println("Enter subject 2 marks: ");
        mark2 = mark2S.nextInt();

    }
}
