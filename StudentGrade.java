import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        int[] m = new int[3];
        for(int i = 0; i < 3; i++){
            System.out.print("Enter marks for Subject" + (i + 1) + ": ");
             m[i] = sc.nextInt();
        }
        int total = 0;
        for(int i = 0; i < 3; i++){
            total += m[i];
        }
        double avg = total/3.0;
        char g;
        if(avg >= 80){
            g = 'A';
        }else if(avg >= 60){
            g = 'B';
        }else if(avg >= 40){
            g = 'C';
        }else{
            g = 'F';
        }
        System.out.println("\n----Student Report ----");
        System.out.println("Student Name : " + name);
        System.out.println("Average Marks: " + avg);
        System.out.println("Grade: " + g);
        sc.close();
    }
}
