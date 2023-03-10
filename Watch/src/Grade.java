import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Grade {
    public static void main (String args[]){
        //ArrayList<Integer> Marks = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Name of student : ");
        String name = scanner.nextLine();

        System.out.println("Enter marks for subject 1 : ");
        int mark0 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter marks for subject 2 : ");
        int mark1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter marks for subject 3 : ");
        int mark2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter marks for subject 4 : ");
        int mark3 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter marks for subject 5 : ");
        int mark4 = scanner.nextInt();
        scanner.nextLine();

        double average  = (mark0 + mark1 + mark2 + mark3 + mark4) / 5;

        System.out.print("The student got: ");

        if(average >= 70){
            System.out.print("A");
        } else if (average >= 60) {
            System.out.print("B");
        } else if (average >= 50) {
            System.out.print("C");
        } else if (average >= 40) {
            System.out.print("D");
        }
        else{
             System.out.print("E");
        }




        /*for(int i = 0; i < 4; i++){
           System.out.print(marks[i]);
        }*/






    }
}
