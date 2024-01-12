import java.util.*;
public class marksGrade {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the student name:");
        String name=sc.nextLine();
        System.out.println("Enter the marks of the student in 3 subjects:");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        int totalMarks=m1+m2+m3;
        int averagePercent=totalMarks/3;
        if(averagePercent>=90){
            System.out.println("Grade is:A+");
        }
        else if(averagePercent>=80){
            System.out.println("Grade is:A");
        }
        else if(averagePercent>=70){
            System.out.println("Grade is:B+");
        }
        else if(averagePercent>=60){
            System.out.println("Grade is:c+");
        }
        else if(averagePercent>=50){
            System.out.println("Grade is:c");
        }
        else{
            System.out.println("Grade is:FAIL");
        }
        System.out.println("Total marks is:"+totalMarks);
        System.out.println("average percent is:"+averagePercent);
    }

}
