import java.util.Scanner;

//intialize class and method for access
public class input_output {
    public static void main(String[] args){
        //get method for input
        Scanner sc=new Scanner(System.in);

        //get input from user
        System.out.print("Enter Name:");
        String name=sc.nextLine();

        System.out.print("Enter Age:");
        int age=sc.nextInt();

        System.out.print("Enter CGPA:");
        double cgpa=sc.nextDouble();

        System.out.print("Enter Garde:");
        char grade=sc.next().charAt(0);

        //print output
        System.out.println("\nStudent Details");
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.printf("CGPA:%.2f%n",cgpa);
        System.out.println("Grade:"+grade);

    }
}
